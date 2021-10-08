/**
 * Copyright (C) 2019-2021 Abacus.ac
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

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.hashcode.HashCodeGenerator;

/**
 * Standalone implementation of {@link IDocumentFormat}
 *
 * @author Philip Helger
 */
public class DocumentFormat implements IDocumentFormat
{
  private final String m_sID;
  private final String m_sDisplayName;
  private final ESyntaxType m_eSyntax;

  public DocumentFormat (@Nonnull @Nonempty final String sID,
                         @Nonnull @Nonempty final String sDisplayName,
                         @Nonnull final ESyntaxType eSyntax)
  {
    ValueEnforcer.notEmpty (sID, "ID");
    ValueEnforcer.notEmpty (sDisplayName, "DisplayName");
    ValueEnforcer.notNull (eSyntax, "Syntax");

    m_sID = sID;
    m_sDisplayName = sDisplayName;
    m_eSyntax = eSyntax;
  }

  @Nonnull
  @Nonempty
  public String getID ()
  {
    return m_sID;
  }

  @Nonnull
  @Nonempty
  public String getDisplayName ()
  {
    return m_sDisplayName;
  }

  @Nonnull
  public ESyntaxType getSyntax ()
  {
    return m_eSyntax;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final DocumentFormat rhs = (DocumentFormat) o;
    return m_sID.equals (rhs.m_sID);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sID).getHashCode ();
  }
}
