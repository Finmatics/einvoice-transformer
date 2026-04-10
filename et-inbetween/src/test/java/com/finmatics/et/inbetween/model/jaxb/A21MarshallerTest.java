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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;

import org.junit.Test;

import com.finmatics.et.inbetween.model.a21.A21InvoiceType;
import com.helger.collection.commons.ICommonsList;
import com.helger.io.resource.ClassPathResource;

/**
 * Test class for class {@link A21Marshaller}
 *
 * @author Philip Helger
 */
public final class A21MarshallerTest
{
  @Test
  public void testGetAllXSDsNotEmpty ()
  {
    final ICommonsList <ClassPathResource> aXSDs = A21Marshaller.getAllXSDs ();
    assertNotNull (aXSDs);
    assertFalse (aXSDs.isEmpty ());
    // The two A21-specific schemas must be present
    assertTrue (aXSDs.contains (A21Marshaller.XSD_A21));
    assertTrue (aXSDs.contains (A21Marshaller.XSD_SHARED_TYPES));
  }

  @Test
  public void testRoundTripWithoutSchemaValidation ()
  {
    final A21Wrapper aInvoice = new A21Wrapper ();
    aInvoice.setID ("INV-001");
    aInvoice.setIssueDate (LocalDate.of (2026, 4, 10));
    aInvoice.setDocumentCurrencyCode ("EUR");
    aInvoice.setUBLVersionID ("2.1");

    final A21Marshaller aMarshaller = new A21Marshaller ();
    // Skip XSD validation - the wrapper is intentionally minimal and would not
    // satisfy the full UBL Invoice schema. We only want to verify the JAXB
    // round-trip and the namespace context wiring.
    aMarshaller.setUseSchema (false);
    aMarshaller.setFormattedOutput (true);

    final String sXML = aMarshaller.getAsString (aInvoice);
    assertNotNull (sXML);
    // Default namespace must point to the A21 invoice namespace
    assertTrue (sXML.contains ("xmlns=\"" +
                               com.finmatics.et.inbetween.model.a21.ObjectFactory._Invoice_QNAME.getNamespaceURI () +
                               "\""));
    // The "ast" prefix must be declared from the namespace context
    assertTrue (sXML.contains ("xmlns:ast=\""));
    // Field values must be present
    assertTrue (sXML.contains ("INV-001"));
    assertTrue (sXML.contains ("2026-04-10"));
    assertTrue (sXML.contains ("EUR"));

    // Read back
    final A21InvoiceType aRead = aMarshaller.read (sXML.getBytes (StandardCharsets.UTF_8));
    assertNotNull (aRead);
    assertNotNull (aRead.getID ());
    assertEquals ("INV-001", aRead.getID ().getValue ());
    assertNotNull (aRead.getIssueDate ());
    assertEquals (LocalDate.of (2026, 4, 10), aRead.getIssueDate ().getValueLocal ());
    assertNotNull (aRead.getDocumentCurrencyCode ());
    assertEquals ("EUR", aRead.getDocumentCurrencyCode ().getValue ());
  }
}
