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
package com.finmatics.et.inbetween.model.jaxb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Test class for class {@link A21NamespaceContext}
 *
 * @author Philip Helger
 */
public final class A21NamespaceContextTest
{
  @Test
  public void testSingleton ()
  {
    final A21NamespaceContext aCtx = A21NamespaceContext.getInstance ();
    assertNotNull (aCtx);
    assertSame (aCtx, A21NamespaceContext.getInstance ());
  }

  @Test
  public void testAstPrefixMapping ()
  {
    final A21NamespaceContext aCtx = A21NamespaceContext.getInstance ();
    final String sAstNs = com.finmatics.et.inbetween.model.shared.ObjectFactory._AbacusDetails_QNAME.getNamespaceURI ();
    assertEquals (sAstNs, aCtx.getCustomNamespaceURI ("ast"));
  }

  @Test
  public void testDefaultNamespaceIsA21Invoice ()
  {
    final A21NamespaceContext aCtx = A21NamespaceContext.getInstance ();
    final String sInvoiceNs = com.finmatics.et.inbetween.model.a21.ObjectFactory._Invoice_QNAME.getNamespaceURI ();
    assertEquals (sInvoiceNs, aCtx.getDefaultNamespaceURI ());
  }
}
