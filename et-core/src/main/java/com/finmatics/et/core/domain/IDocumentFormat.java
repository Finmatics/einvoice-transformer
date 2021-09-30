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
package com.finmatics.et.core.domain;

import javax.annotation.Nonnull;

import com.helger.commons.id.IHasID;
import com.helger.commons.name.IHasDisplayName;

public interface IDocumentFormat extends IHasID <String>, IHasDisplayName
{
  /**
   * @return The underlying syntax. May not be <code>null</code>.
   */
  @Nonnull
  ESyntaxType getSyntax ();

  /**
   * @return <code>true</code> if this document format is usable as a source
   *         format, <code>false</code> if not.
   */
  boolean isSourceFormat ();

  /**
   * @return <code>true</code> if this document format is usable as a target
   *         format, <code>false</code> if not.
   */
  boolean isTargetFormat ();
}
