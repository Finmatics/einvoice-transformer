/*
 * Copyright (C) 2019-2026 Finmatics GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.finmatics.et.core.syntax.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

import com.helger.base.state.ETriState;
import com.helger.diagnostics.error.list.ErrorList;
import com.helger.json.IJsonArray;
import com.helger.json.IJsonObject;
import com.helger.json.JsonArray;
import com.helger.json.JsonObject;

/**
 * Test class for class {@link JsonFinder}
 *
 * @author Philip Helger
 */
public final class JsonFinderTest
{
  private static JsonFinder _finder (final IJsonObject aObj, final ErrorList aErr)
  {
    return new JsonFinder ("root", aObj, aErr);
  }

  @Test
  public void testFindString ()
  {
    final ErrorList aErr = new ErrorList ();
    final IJsonObject aObj = new JsonObject ().add ("name", "Philip");
    final JsonFinder aF = _finder (aObj, aErr);

    assertEquals ("Philip", aF.findString ("name", true));
    assertTrue (aErr.isEmpty ());

    // optional missing -> null, no error
    assertNull (aF.findString ("missing", false));
    assertTrue (aErr.isEmpty ());

    // mandatory missing -> null, error added
    assertNull (aF.findString ("missing", true));
    assertFalse (aErr.isEmpty ());
    assertEquals (1, aErr.size ());
  }

  @Test
  public void testFindIntLongDecimal ()
  {
    final ErrorList aErr = new ErrorList ();
    final IJsonObject aObj = new JsonObject ().add ("i", 42).add ("l", 9_999_999_999L).add ("d", "12.34");
    final JsonFinder aF = _finder (aObj, aErr);

    assertEquals (Integer.valueOf (42), aF.findInt ("i", true));
    assertEquals (Long.valueOf (9_999_999_999L), aF.findLong ("l", true));
    assertEquals (new BigDecimal ("12.34"), aF.findDouble ("d", true));
    assertTrue (aErr.isEmpty ());
  }

  @Test
  public void testFindLocalDate ()
  {
    final ErrorList aErr = new ErrorList ();
    final IJsonObject aObj = new JsonObject ().add ("good", "2026-04-10").add ("bad", "not-a-date");
    final JsonFinder aF = _finder (aObj, aErr);

    assertEquals (LocalDate.of (2026, 4, 10), aF.findLocalDate ("good", true));
    assertTrue (aErr.isEmpty ());

    assertNull (aF.findLocalDate ("bad", true));
    assertEquals (1, aErr.size ());
  }

  @Test
  public void testFindBoolean ()
  {
    final ErrorList aErr = new ErrorList ();
    final IJsonObject aObj = new JsonObject ().add ("t", true).add ("f", false);
    final JsonFinder aF = _finder (aObj, aErr);

    assertEquals (ETriState.TRUE, aF.findBoolean ("t", true));
    assertEquals (ETriState.FALSE, aF.findBoolean ("f", true));
    assertEquals (ETriState.UNDEFINED, aF.findBoolean ("missing", false));
    assertTrue (aErr.isEmpty ());
  }

  @Test
  public void testFindObjectAndPathPropagation ()
  {
    final ErrorList aErr = new ErrorList ();
    final IJsonObject aChild = new JsonObject ().add ("inner", "v");
    final IJsonObject aRoot = new JsonObject ().add ("child", aChild);

    final JsonFinder aRootFinder = new JsonFinder (null, aRoot, aErr);
    assertNull (aRootFinder.getPath ());

    // path is null at the root -> child path is just "child"
    final JsonFinder aChildFinder = aRootFinder.findObject ("child", true);
    assertNotNull (aChildFinder);
    assertEquals ("child", aChildFinder.getPath ());

    // path is "root" at the root -> child path becomes "root.child"
    final JsonFinder aChildFinder2 = _finder (aRoot, aErr).findObject ("child", true);
    assertNotNull (aChildFinder2);
    assertEquals ("root.child", aChildFinder2.getPath ());

    assertEquals ("v", aChildFinder.findString ("inner", true));
    assertTrue (aErr.isEmpty ());
  }

  @Test
  public void testFindArray ()
  {
    final ErrorList aErr = new ErrorList ();
    final IJsonObject aObj = new JsonObject ().add ("items", new JsonArray ().add ("a").add ("b"));
    final JsonFinder aF = _finder (aObj, aErr);

    final IJsonArray aArr = aF.findArray ("items", true);
    assertNotNull (aArr);
    assertEquals (2, aArr.size ());
    assertTrue (aErr.isEmpty ());
  }

  @Test
  public void testTypeMismatchReportsError ()
  {
    final ErrorList aErr = new ErrorList ();
    final IJsonObject aObj = new JsonObject ().add ("scalar", "v")
                                              .add ("anObject", new JsonObject ().add ("k", "v"))
                                              .add ("anArray", new JsonArray ().add (1));
    final JsonFinder aF = _finder (aObj, aErr);

    // expecting an object where there's a scalar
    assertNull (aF.findObject ("scalar", true));
    assertFalse (aErr.isEmpty ());

    aErr.clear ();
    // expecting an array where there's an object
    assertNull (aF.findArray ("anObject", true));
    assertFalse (aErr.isEmpty ());

    aErr.clear ();
    // expecting a scalar where there's an array
    assertNull (aF.findValue ("anArray", true));
    assertFalse (aErr.isEmpty ());
  }
}
