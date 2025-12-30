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
package com.finmatics.et.core.syntax.xml;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import com.finmatics.et.core.domain.ESyntaxType;
import com.finmatics.et.core.domain.IDocumentFormat;

/**
 * Specialized {@link IDocumentFormat} for XML.
 *
 * @author Philip Helger
 */
public interface IDocumentFormatXML extends IDocumentFormat
{
  @NonNull
  default ESyntaxType getSyntax ()
  {
    return ESyntaxType.XML;
  }

  /**
   * @return The namespace URI of the root element for automatic document
   *         determination. If this is <code>null</code>, auto-detect will not
   *         work.
   */
  @Nullable
  String getRootElementNamespaceURI ();

  /**
   * @return The local name of the root element for automatic document
   *         determination. If this is <code>null</code>, auto-detect will not
   *         work.
   */
  @Nullable
  String getRootElementLocalName ();
}
