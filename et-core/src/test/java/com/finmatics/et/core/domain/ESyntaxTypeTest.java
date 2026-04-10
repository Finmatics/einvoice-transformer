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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for enum {@link ESyntaxType}
 *
 * @author Philip Helger
 */
public final class ESyntaxTypeTest
{
  @Test
  public void testGetDottedExtension ()
  {
    assertEquals (".xml", ESyntaxType.XML.getDottedExtension ());
    assertEquals (".json", ESyntaxType.JSON.getDottedExtension ());
  }

  @Test
  public void testAllValuesHaveDottedExtension ()
  {
    for (final ESyntaxType e : ESyntaxType.values ())
    {
      final String s = e.getDottedExtension ();
      assertNotNull (s);
      assertTrue ("Extension '" + s + "' must start with a dot", s.startsWith ("."));
      assertTrue ("Extension '" + s + "' must have at least one char after the dot", s.length () > 1);
    }
  }
}
