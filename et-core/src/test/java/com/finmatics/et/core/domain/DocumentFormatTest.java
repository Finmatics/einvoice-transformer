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
package com.finmatics.et.core.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test class for class {@link DocumentFormat}
 *
 * @author Philip Helger
 */
public final class DocumentFormatTest
{
  @Test
  public void testBasic ()
  {
    final DocumentFormat aDF = new DocumentFormat ("id1", "Display 1", ESyntaxType.XML);
    assertEquals ("id1", aDF.getID ());
    assertEquals ("Display 1", aDF.getDisplayName ());
    assertSame (ESyntaxType.XML, aDF.getSyntax ());
    assertNotNull (aDF.toString ());
  }

  @Test
  public void testEqualsHashCode ()
  {
    final DocumentFormat aA = new DocumentFormat ("id1", "Display 1", ESyntaxType.XML);
    final DocumentFormat aB = new DocumentFormat ("id1", "Different display", ESyntaxType.JSON);
    final DocumentFormat aC = new DocumentFormat ("id2", "Display 1", ESyntaxType.XML);

    // equality is based on ID only (m_sID is final, so this is safe per JLS)
    assertTrue (aA.equals (aA));
    assertTrue (aA.equals (aB));
    assertEquals (aA.hashCode (), aB.hashCode ());

    assertFalse (aA.equals (aC));
    assertFalse (aA.equals (null));
    assertFalse (aA.equals ("not a DocumentFormat"));
  }

  @Test
  public void testCtorRejectsInvalidArgs ()
  {
    try
    {
      new DocumentFormat ("", "Display", ESyntaxType.XML);
      fail ("empty ID must be rejected");
    }
    catch (final IllegalArgumentException ex)
    {
      // expected
    }

    try
    {
      new DocumentFormat ("id", "", ESyntaxType.XML);
      fail ("empty display name must be rejected");
    }
    catch (final IllegalArgumentException ex)
    {
      // expected
    }

    try
    {
      new DocumentFormat ("id", "Display", null);
      fail ("null syntax must be rejected");
    }
    catch (final NullPointerException | IllegalArgumentException ex)
    {
      // expected
    }
  }
}
