/*
 * Copyright (C) 2019-2023 Finmatics GmbH
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

import javax.xml.XMLConstants;

import com.finmatics.et.inbetween.model.a21.ObjectFactory;
import com.helger.annotation.misc.Singleton;
import com.helger.ubl21.CUBL21;
import com.helger.xml.namespace.MapBasedNamespaceContext;
import com.helger.xsds.xmldsig.CXMLDSig;

import org.jspecify.annotations.NonNull;

/**
 * The namespace context to be used as the A21 namespace prefix mapper.
 *
 * @author Philip Helger
 */
@Singleton
public class A21NamespaceContext extends MapBasedNamespaceContext
{
  private static final class SingletonHolder
  {
    static final A21NamespaceContext INSTANCE = new A21NamespaceContext ();
  }

  protected A21NamespaceContext ()
  {
    addDefaultNamespaceURI (ObjectFactory._Invoice_QNAME.getNamespaceURI ());
    addMapping ("xsi", XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
    addMapping ("xs", XMLConstants.W3C_XML_SCHEMA_NS_URI);
    addMapping ("cac", CUBL21.XML_SCHEMA_CAC_NAMESPACE_URL);
    addMapping ("cbc", CUBL21.XML_SCHEMA_CBC_NAMESPACE_URL);
    addMapping ("cec", CUBL21.XML_SCHEMA_CEC_NAMESPACE_URL);
    addMapping ("ds", CXMLDSig.NAMESPACE_URI);
    addMapping ("ast", "urn:abacus.ac:schema:xsd:shared-types");
  }

  @NonNull
  public static A21NamespaceContext getInstance ()
  {
    return SingletonHolder.INSTANCE;
  }
}
