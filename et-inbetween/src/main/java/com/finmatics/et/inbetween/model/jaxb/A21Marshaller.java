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

import java.util.List;

import org.jspecify.annotations.NonNull;

import com.finmatics.et.inbetween.model.a21.A21InvoiceType;
import com.finmatics.et.inbetween.model.a21.ObjectFactory;
import com.helger.annotation.Nonempty;
import com.helger.annotation.style.ReturnsMutableCopy;
import com.helger.collection.commons.CommonsArrayList;
import com.helger.collection.commons.ICommonsList;
import com.helger.io.resource.ClassPathResource;
import com.helger.jaxb.GenericJAXBMarshaller;
import com.helger.jaxb.validation.LoggingValidationEventHandler;
import com.helger.ubl21.UBL21Marshaller;

/**
 * JAXB marshaller and unmarshaller for A21 invoices
 *
 * @author Philip Helger
 */
public class A21Marshaller extends GenericJAXBMarshaller <A21InvoiceType>
{
  @NonNull
  private static ClassLoader _getCL ()
  {
    return A21Marshaller.class.getClassLoader ();
  }

  public static final ClassPathResource XSD_SHARED_TYPES = new ClassPathResource ("schemas/common/Abacus-Shared-Types.xsd",
                                                                                  _getCL ());
  public static final ClassPathResource XSD_A21 = new ClassPathResource ("schemas/Abacus-Invoice-2.1.xsd", _getCL ());

  private static final List <ClassPathResource> XSDS;
  static
  {
    final var aList = UBL21Marshaller.getAllBaseXSDs ();
    aList.addAll (XSD_SHARED_TYPES, XSD_A21);
    XSDS = aList.getAsUnmodifiable ();
  }

  public A21Marshaller ()
  {
    super (A21InvoiceType.class, XSDS, new ObjectFactory ()::createInvoice);
    setValidationEventHandler (new LoggingValidationEventHandler ());
    setNamespaceContext (A21NamespaceContext.getInstance ());
  }

  /**
   * @return All the XML Schema resources required for A21. Neither <code>null</code> nor empty.
   */
  @NonNull
  @Nonempty
  @ReturnsMutableCopy
  public static ICommonsList <ClassPathResource> getAllXSDs ()
  {
    return new CommonsArrayList <> (XSDS);
  }
}
