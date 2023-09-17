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

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

import com.finmatics.et.inbetween.model.a21.A21InvoiceType;

import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.*;

/**
 * An API extension to {@link A21InvoiceType} adding the simple setters on top
 * of it.
 *
 * @author Philip Helger
 */
@NotThreadSafe
public class A21Wrapper extends A21InvoiceType
{
  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type InvoiceTypeCodeType and
   *         never <code>null</code>
   */
  @Nonnull
  public InvoiceTypeCodeType setInvoiceTypeCode (@Nullable final String valueParam)
  {
    InvoiceTypeCodeType aObj = getInvoiceTypeCode ();
    if (aObj == null)
    {
      aObj = new InvoiceTypeCodeType (valueParam);
      setInvoiceTypeCode (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type DocumentCurrencyCodeType
   *         and never <code>null</code>
   */
  @Nonnull
  public DocumentCurrencyCodeType setDocumentCurrencyCode (@Nullable final String valueParam)
  {
    DocumentCurrencyCodeType aObj = getDocumentCurrencyCode ();
    if (aObj == null)
    {
      aObj = new DocumentCurrencyCodeType (valueParam);
      setDocumentCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type TaxCurrencyCodeType and
   *         never <code>null</code>
   */
  @Nonnull
  public TaxCurrencyCodeType setTaxCurrencyCode (@Nullable final String valueParam)
  {
    TaxCurrencyCodeType aObj = getTaxCurrencyCode ();
    if (aObj == null)
    {
      aObj = new TaxCurrencyCodeType (valueParam);
      setTaxCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type PricingCurrencyCodeType and
   *         never <code>null</code>
   */
  @Nonnull
  public PricingCurrencyCodeType setPricingCurrencyCode (@Nullable final String valueParam)
  {
    PricingCurrencyCodeType aObj = getPricingCurrencyCode ();
    if (aObj == null)
    {
      aObj = new PricingCurrencyCodeType (valueParam);
      setPricingCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type PaymentCurrencyCodeType and
   *         never <code>null</code>
   */
  @Nonnull
  public PaymentCurrencyCodeType setPaymentCurrencyCode (@Nullable final String valueParam)
  {
    PaymentCurrencyCodeType aObj = getPaymentCurrencyCode ();
    if (aObj == null)
    {
      aObj = new PaymentCurrencyCodeType (valueParam);
      setPaymentCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type
   *         PaymentAlternativeCurrencyCodeType and never <code>null</code>
   */
  @Nonnull
  public PaymentAlternativeCurrencyCodeType setPaymentAlternativeCurrencyCode (@Nullable final String valueParam)
  {
    PaymentAlternativeCurrencyCodeType aObj = getPaymentAlternativeCurrencyCode ();
    if (aObj == null)
    {
      aObj = new PaymentAlternativeCurrencyCodeType (valueParam);
      setPaymentAlternativeCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type AccountingCostCodeType and
   *         never <code>null</code>
   */
  @Nonnull
  public AccountingCostCodeType setAccountingCostCode (@Nullable final String valueParam)
  {
    AccountingCostCodeType aObj = getAccountingCostCode ();
    if (aObj == null)
    {
      aObj = new AccountingCostCodeType (valueParam);
      setAccountingCostCode (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type LocalDate<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type IssueDateType and never
   *         <code>null</code>
   */
  @Nonnull
  public IssueDateType setIssueDate (@Nullable final LocalDate valueParam)
  {
    IssueDateType aObj = getIssueDate ();
    if (aObj == null)
    {
      aObj = new IssueDateType (valueParam);
      setIssueDate (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type LocalDate<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type DueDateType and never
   *         <code>null</code>
   */
  @Nonnull
  public DueDateType setDueDate (@Nullable final LocalDate valueParam)
  {
    DueDateType aObj = getDueDate ();
    if (aObj == null)
    {
      aObj = new DueDateType (valueParam);
      setDueDate (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type LocalDate<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type TaxPointDateType and never
   *         <code>null</code>
   */
  @Nonnull
  public TaxPointDateType setTaxPointDate (@Nullable final LocalDate valueParam)
  {
    TaxPointDateType aObj = getTaxPointDate ();
    if (aObj == null)
    {
      aObj = new TaxPointDateType (valueParam);
      setTaxPointDate (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type LocalTime<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type IssueTimeType and never
   *         <code>null</code>
   */
  @Nonnull
  public IssueTimeType setIssueTime (@Nullable final LocalTime valueParam)
  {
    IssueTimeType aObj = getIssueTime ();
    if (aObj == null)
    {
      aObj = new IssueTimeType (valueParam);
      setIssueTime (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type UBLVersionIDType and never
   *         <code>null</code>
   */
  @Nonnull
  public UBLVersionIDType setUBLVersionID (@Nullable final String valueParam)
  {
    UBLVersionIDType aObj = getUBLVersionID ();
    if (aObj == null)
    {
      aObj = new UBLVersionIDType (valueParam);
      setUBLVersionID (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type CustomizationIDType and
   *         never <code>null</code>
   */
  @Nonnull
  public CustomizationIDType setCustomizationID (@Nullable final String valueParam)
  {
    CustomizationIDType aObj = getCustomizationID ();
    if (aObj == null)
    {
      aObj = new CustomizationIDType (valueParam);
      setCustomizationID (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type ProfileIDType and never
   *         <code>null</code>
   */
  @Nonnull
  public ProfileIDType setProfileID (@Nullable final String valueParam)
  {
    ProfileIDType aObj = getProfileID ();
    if (aObj == null)
    {
      aObj = new ProfileIDType (valueParam);
      setProfileID (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type ProfileExecutionIDType and
   *         never <code>null</code>
   */
  @Nonnull
  public ProfileExecutionIDType setProfileExecutionID (@Nullable final String valueParam)
  {
    ProfileExecutionIDType aObj = getProfileExecutionID ();
    if (aObj == null)
    {
      aObj = new ProfileExecutionIDType (valueParam);
      setProfileExecutionID (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type IDType and never
   *         <code>null</code>
   */
  @Nonnull
  public IDType setID (@Nullable final String valueParam)
  {
    IDType aObj = getID ();
    if (aObj == null)
    {
      aObj = new IDType (valueParam);
      setID (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type UUIDType and never
   *         <code>null</code>
   */
  @Nonnull
  public UUIDType setUUID (@Nullable final String valueParam)
  {
    UUIDType aObj = getUUID ();
    if (aObj == null)
    {
      aObj = new UUIDType (valueParam);
      setUUID (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type boolean<br>
   *
   * @param valueParam
   *        The value to be set.
   * @return The created intermediary object of type CopyIndicatorType and never
   *         <code>null</code>
   */
  @Nonnull
  public CopyIndicatorType setCopyIndicator (final boolean valueParam)
  {
    CopyIndicatorType aObj = getCopyIndicator ();
    if (aObj == null)
    {
      aObj = new CopyIndicatorType (valueParam);
      setCopyIndicator (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type BigDecimal<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type LineCountNumericType and
   *         never <code>null</code>
   */
  @Nonnull
  public LineCountNumericType setLineCountNumeric (@Nullable final BigDecimal valueParam)
  {
    LineCountNumericType aObj = getLineCountNumeric ();
    if (aObj == null)
    {
      aObj = new LineCountNumericType (valueParam);
      setLineCountNumeric (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type AccountingCostType and
   *         never <code>null</code>
   */
  @Nonnull
  public AccountingCostType setAccountingCost (@Nullable final String valueParam)
  {
    AccountingCostType aObj = getAccountingCost ();
    if (aObj == null)
    {
      aObj = new AccountingCostType (valueParam);
      setAccountingCost (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param valueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type BuyerReferenceType and
   *         never <code>null</code>
   */
  @Nonnull
  public BuyerReferenceType setBuyerReference (@Nullable final String valueParam)
  {
    BuyerReferenceType aObj = getBuyerReference ();
    if (aObj == null)
    {
      aObj = new BuyerReferenceType (valueParam);
      setBuyerReference (aObj);
    }
    else
    {
      aObj.setValue (valueParam);
    }
    return aObj;
  }

  /**
   * Get the value of the contained UBLVersionIDType object<br>
   *
   * @return Either the value of the contained UBLVersionIDType object or
   *         <code>null</code>
   */
  @Nullable
  public String getUBLVersionIDValue ()
  {
    final UBLVersionIDType aObj = getUBLVersionID ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained CustomizationIDType object<br>
   *
   * @return Either the value of the contained CustomizationIDType object or
   *         <code>null</code>
   */
  @Nullable
  public String getCustomizationIDValue ()
  {
    final CustomizationIDType aObj = getCustomizationID ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained ProfileIDType object<br>
   *
   * @return Either the value of the contained ProfileIDType object or
   *         <code>null</code>
   */
  @Nullable
  public String getProfileIDValue ()
  {
    final ProfileIDType aObj = getProfileID ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained ProfileExecutionIDType object<br>
   *
   * @return Either the value of the contained ProfileExecutionIDType object or
   *         <code>null</code>
   */
  @Nullable
  public String getProfileExecutionIDValue ()
  {
    final ProfileExecutionIDType aObj = getProfileExecutionID ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained IDType object<br>
   *
   * @return Either the value of the contained IDType object or
   *         <code>null</code>
   */
  @Nullable
  public String getIDValue ()
  {
    final IDType aObj = getID ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained CopyIndicatorType object<br>
   *
   * @param nullValue
   *        The value to be returned, if the owning object is <code>null</code>
   * @return Either the value of the contained CopyIndicatorType object or the
   *         passed nullValue
   */
  public boolean isCopyIndicatorValue (final boolean nullValue)
  {
    final CopyIndicatorType aObj = getCopyIndicator ();
    return ((aObj == null) ? nullValue : aObj.isValue ());
  }

  /**
   * Get the value of the contained UUIDType object<br>
   *
   * @return Either the value of the contained UUIDType object or
   *         <code>null</code>
   */
  @Nullable
  public String getUUIDValue ()
  {
    final UUIDType aObj = getUUID ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained IssueDateType object<br>
   *
   * @return Either the value of the contained IssueDateType object or
   *         <code>null</code>
   */
  @Nullable
  public LocalDate getIssueDateValue ()
  {
    final IssueDateType aObj = getIssueDate ();
    return ((aObj == null) ? null : aObj.getValueLocal ());
  }

  /**
   * Get the value of the contained IssueTimeType object<br>
   *
   * @return Either the value of the contained IssueTimeType object or
   *         <code>null</code>
   */
  @Nullable
  public LocalTime getIssueTimeValue ()
  {
    final IssueTimeType aObj = getIssueTime ();
    return ((aObj == null) ? null : aObj.getValueLocal ());
  }

  /**
   * Get the value of the contained DueDateType object<br>
   *
   * @return Either the value of the contained DueDateType object or
   *         <code>null</code>
   */
  @Nullable
  public LocalDate getDueDateValue ()
  {
    final DueDateType aObj = getDueDate ();
    return ((aObj == null) ? null : aObj.getValueLocal ());
  }

  /**
   * Get the value of the contained InvoiceTypeCodeType object<br>
   *
   * @return Either the value of the contained InvoiceTypeCodeType object or
   *         <code>null</code>
   */
  @Nullable
  public String getInvoiceTypeCodeValue ()
  {
    final InvoiceTypeCodeType aObj = getInvoiceTypeCode ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained TaxPointDateType object<br>
   *
   * @return Either the value of the contained TaxPointDateType object or
   *         <code>null</code>
   */
  @Nullable
  public LocalDate getTaxPointDateValue ()
  {
    final TaxPointDateType aObj = getTaxPointDate ();
    return ((aObj == null) ? null : aObj.getValueLocal ());
  }

  /**
   * Get the value of the contained DocumentCurrencyCodeType object<br>
   *
   * @return Either the value of the contained DocumentCurrencyCodeType object
   *         or <code>null</code>
   */
  @Nullable
  public String getDocumentCurrencyCodeValue ()
  {
    final DocumentCurrencyCodeType aObj = getDocumentCurrencyCode ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained TaxCurrencyCodeType object<br>
   *
   * @return Either the value of the contained TaxCurrencyCodeType object or
   *         <code>null</code>
   */
  @Nullable
  public String getTaxCurrencyCodeValue ()
  {
    final TaxCurrencyCodeType aObj = getTaxCurrencyCode ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained PricingCurrencyCodeType object<br>
   *
   * @return Either the value of the contained PricingCurrencyCodeType object or
   *         <code>null</code>
   */
  @Nullable
  public String getPricingCurrencyCodeValue ()
  {
    final PricingCurrencyCodeType aObj = getPricingCurrencyCode ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained PaymentCurrencyCodeType object<br>
   *
   * @return Either the value of the contained PaymentCurrencyCodeType object or
   *         <code>null</code>
   */
  @Nullable
  public String getPaymentCurrencyCodeValue ()
  {
    final PaymentCurrencyCodeType aObj = getPaymentCurrencyCode ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained PaymentAlternativeCurrencyCodeType
   * object<br>
   *
   * @return Either the value of the contained
   *         PaymentAlternativeCurrencyCodeType object or <code>null</code>
   */
  @Nullable
  public String getPaymentAlternativeCurrencyCodeValue ()
  {
    final PaymentAlternativeCurrencyCodeType aObj = getPaymentAlternativeCurrencyCode ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained AccountingCostCodeType object<br>
   *
   * @return Either the value of the contained AccountingCostCodeType object or
   *         <code>null</code>
   */
  @Nullable
  public String getAccountingCostCodeValue ()
  {
    final AccountingCostCodeType aObj = getAccountingCostCode ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained AccountingCostType object<br>
   *
   * @return Either the value of the contained AccountingCostType object or
   *         <code>null</code>
   */
  @Nullable
  public String getAccountingCostValue ()
  {
    final AccountingCostType aObj = getAccountingCost ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained LineCountNumericType object<br>
   *
   * @return Either the value of the contained LineCountNumericType object or
   *         <code>null</code>
   */
  @Nullable
  public BigDecimal getLineCountNumericValue ()
  {
    final LineCountNumericType aObj = getLineCountNumeric ();
    return ((aObj == null) ? null : aObj.getValue ());
  }

  /**
   * Get the value of the contained BuyerReferenceType object<br>
   *
   * @return Either the value of the contained BuyerReferenceType object or
   *         <code>null</code>
   */
  @Nullable
  public String getBuyerReferenceValue ()
  {
    final BuyerReferenceType aObj = getBuyerReference ();
    return ((aObj == null) ? null : aObj.getValue ());
  }
}
