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
package com.finmatics.et.core.domain;

import org.jspecify.annotations.NonNull;

import com.helger.annotation.Nonempty;

/**
 * Enumeration with all supported syntaxes.
 *
 * @author Philip Helger
 */
public enum ESyntaxType
{
  /** JSON */
  JSON (".json"),
  /** XML */
  XML (".xml");

  private String m_sExt;

  ESyntaxType (@NonNull @Nonempty final String sExt)
  {
    m_sExt = sExt;
  }

  @NonNull
  @Nonempty
  public String getExtension ()
  {
    return m_sExt;
  }
}
