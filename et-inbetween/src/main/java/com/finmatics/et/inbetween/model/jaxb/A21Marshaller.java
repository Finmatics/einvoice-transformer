/*
 * Copyright (C) 2019-2021 Finmatics GmbH
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

import javax.annotation.Nonnull;

import com.finmatics.et.inbetween.model.a21.A21InvoiceType;
import com.finmatics.et.inbetween.model.a21.ObjectFactory;
import com.helger.commons.collection.impl.CommonsArrayList;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.jaxb.GenericJAXBMarshaller;
import com.helger.jaxb.validation.LoggingValidationEventHandler;
import com.helger.ubl21.CUBL21;
import com.helger.xsds.ccts.cct.schemamodule.CCCTS;
import com.helger.xsds.xades132.CXAdES132;
import com.helger.xsds.xades141.CXAdES141;
import com.helger.xsds.xmldsig.CXMLDSig;

/**
 * JAXB marshaller and unmarshaller for A21 invoices
 *
 * @author Philip Helger
 */
public class A21Marshaller extends GenericJAXBMarshaller <A21InvoiceType>
{
  @Nonnull
  private static ClassLoader _getCL ()
  {
    return A21Marshaller.class.getClassLoader ();
  }

  public static final ClassPathResource XSD_SHARED_TYPES = new ClassPathResource ("schemas/common/Abacus-Shared-Types.xsd", _getCL ());
  public static final ClassPathResource XSD_A21 = new ClassPathResource ("schemas/Abacus-Invoice-2.1.xsd", _getCL ());

  private static final List <ClassPathResource> XSDS = new CommonsArrayList <> (CCCTS.getXSDResource (),
                                                                                CXMLDSig.getXSDResource (),
                                                                                CXAdES132.getXSDResource (),
                                                                                CXAdES141.getXSDResource (),
                                                                                CUBL21.XSD_UNQUALIFIED_DATA_TYPES,
                                                                                CUBL21.XSD_COMMON_BASIC_COMPONENTS,
                                                                                CUBL21.XSD_COMMON_AGGREGATE_COMPONENTS,
                                                                                CUBL21.XSD_COMMON_EXTENSION_COMPONENTS,
                                                                                XSD_SHARED_TYPES,
                                                                                XSD_A21).getAsUnmodifiable ();

  public A21Marshaller (final boolean bPerformValidation)
  {
    super (A21InvoiceType.class, bPerformValidation ? XSDS : null, new ObjectFactory ()::createInvoice);
    setValidationEventHandlerFactory (x -> new LoggingValidationEventHandler ());
    setNamespaceContext (A21NamespaceContext.getInstance ());
  }
}
