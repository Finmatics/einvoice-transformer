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
package com.finmatics.et.core.syntax.json;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import com.helger.annotation.Nonempty;
import com.helger.base.enforce.ValueEnforcer;
import com.helger.base.state.ETriState;
import com.helger.datetime.format.PDTFromString;
import com.helger.diagnostics.error.SingleError;
import com.helger.diagnostics.error.list.ErrorList;
import com.helger.json.IJson;
import com.helger.json.IJsonArray;
import com.helger.json.IJsonObject;
import com.helger.json.IJsonValue;

/**
 * A small helper class to simplify traversal in a JSON hierarchy
 *
 * @author Philip Helger
 */
public final class JsonFinder
{
  private static final String DATE_PATTERN = "uuuu-MM-dd";
  private final String m_sPath;
  private final IJsonObject m_aJson;
  private final ErrorList m_aErrorList;

  public JsonFinder (@Nullable final String sPath,
                     @NonNull final IJsonObject aJson,
                     @NonNull final ErrorList aErrorList)
  {
    m_sPath = sPath;
    m_aJson = aJson;
    m_aErrorList = aErrorList;
  }

  @Nullable
  public String getPath ()
  {
    return m_sPath;
  }

  @Nullable
  public IJson findAny (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    ValueEnforcer.notEmpty (sChild, "Child");
    final IJson aChild = m_aJson.get (sChild);
    if (aChild == null)
    {
      if (bMandatory)
        m_aErrorList.add (SingleError.builder ()
                                     .errorFieldName (m_sPath)
                                     .errorText ("Failed to resolve child element '" + sChild + "'")
                                     .build ());
    }
    return aChild;
  }

  @Nullable
  public IJsonValue findValue (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    final IJson aChild = findAny (sChild, bMandatory);
    if (aChild != null)
    {
      if (aChild.isValue ())
        return aChild.getAsValue ();

      m_aErrorList.add (SingleError.builder ()
                                   .errorFieldName (m_sPath)
                                   .errorText ("Expected the child element '" +
                                               sChild +
                                               "' to be a value it is " +
                                               (aChild.isArray () ? "an array" : "an object"))
                                   .build ());
    }
    // else the error was already added in "findAny"
    return null;
  }

  @Nullable
  public JsonFinder findObject (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    final IJson aChild = findAny (sChild, bMandatory);
    if (aChild != null)
    {
      if (aChild.isObject ())
        return new JsonFinder (m_sPath == null ? sChild : m_sPath + "." + sChild, (IJsonObject) aChild, m_aErrorList);

      if (aChild.isValue () && aChild.getAsValue ().getValue () == null)
        return null;

      m_aErrorList.add (SingleError.builder ()
                                   .errorFieldName (m_sPath)
                                   .errorText ("Expected the child element '" +
                                               sChild +
                                               "' to be an object but it is " +
                                               (aChild.isArray () ? "an array" : "a value"))
                                   .build ());
    }
    return null;
  }

  @Nullable
  public IJsonArray findArray (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    final IJson aChild = findAny (sChild, bMandatory);
    if (aChild != null)
    {
      if (aChild.isArray ())
        return aChild.getAsArray ();

      if (aChild.isValue () && aChild.getAsValue ().getValue () == null)
        return null;

      m_aErrorList.add (SingleError.builder ()
                                   .errorFieldName (m_sPath)
                                   .errorText ("Expected the child element '" +
                                               sChild +
                                               "' to be an array but it is " +
                                               (aChild.isObject () ? "an object" : "a value"))
                                   .build ());
    }
    return null;
  }

  @Nullable
  public String findString (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    final IJsonValue aValue = findValue (sChild, bMandatory);
    if (aValue == null)
      return null;
    return aValue.getAsString ();
  }

  @Nullable
  public LocalDate findLocalDate (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    final String s = findString (sChild, bMandatory);
    if (s == null)
      return null;
    final LocalDate ret = PDTFromString.getLocalDateFromString (s, DATE_PATTERN);
    if (ret == null && bMandatory)
    {
      m_aErrorList.add (SingleError.builder ()
                                   .errorFieldName (m_sPath)
                                   .errorText ("Expected the child element '" +
                                               sChild +
                                               "' to be a LocalDate value but failed to parse '" +
                                               s +
                                               "'")
                                   .build ());
    }
    return ret;
  }

  @NonNull
  public ETriState findBoolean (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    final IJsonValue aValue = findValue (sChild, bMandatory);
    return aValue == null ? ETriState.UNDEFINED : ETriState.valueOf (aValue.getAsBoolean ());
  }

  @Nullable
  public Integer findInt (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    final IJsonValue aValue = findValue (sChild, bMandatory);
    if (aValue == null)
      return null;
    final Integer ret = aValue.getAsIntObj ();
    if (ret == null && bMandatory)
    {
      m_aErrorList.add (SingleError.builder ()
                                   .errorFieldName (m_sPath)
                                   .errorText ("Expected the child element '" +
                                               sChild +
                                               "' to be an int value but failed to parse '" +
                                               aValue.getAsString () +
                                               "'")
                                   .build ());
    }
    return ret;
  }

  @Nullable
  public Long findLong (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    final IJsonValue aValue = findValue (sChild, bMandatory);
    if (aValue == null)
      return null;
    final Long ret = aValue.getAsLongObj ();
    if (ret == null && bMandatory)
    {
      m_aErrorList.add (SingleError.builder ()
                                   .errorFieldName (m_sPath)
                                   .errorText ("Expected the child element '" +
                                               sChild +
                                               "' to be a long value but failed to parse '" +
                                               aValue.getAsString () +
                                               "'")
                                   .build ());
    }
    return ret;
  }

  @Nullable
  public BigDecimal findDouble (@NonNull @Nonempty final String sChild, final boolean bMandatory)
  {
    final IJsonValue aValue = findValue (sChild, bMandatory);
    if (aValue == null)
      return null;
    final BigDecimal ret = aValue.getAsBigDecimal ();
    if (ret == null && bMandatory)
    {
      m_aErrorList.add (SingleError.builder ()
                                   .errorFieldName (m_sPath)
                                   .errorText ("Expected the child element '" +
                                               sChild +
                                               "' to be an double value but failed to parse '" +
                                               aValue.getAsString () +
                                               "'")
                                   .build ());
    }
    return ret;
  }
}
