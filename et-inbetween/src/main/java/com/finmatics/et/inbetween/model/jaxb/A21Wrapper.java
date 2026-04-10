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

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.finmatics.et.inbetween.model.a21.A21InvoiceType;
import com.helger.annotation.concurrent.NotThreadSafe;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
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
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type InvoiceTypeCodeType and
   *         never <code>null</code>
   */
  @NonNull
  public InvoiceTypeCodeType setInvoiceTypeCode (@Nullable final String sValueParam)
  {
    InvoiceTypeCodeType aObj = getInvoiceTypeCode ();
    if (aObj == null)
    {
      aObj = new InvoiceTypeCodeType (sValueParam);
      setInvoiceTypeCode (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type DocumentCurrencyCodeType
   *         and never <code>null</code>
   */
  @NonNull
  public DocumentCurrencyCodeType setDocumentCurrencyCode (@Nullable final String sValueParam)
  {
    DocumentCurrencyCodeType aObj = getDocumentCurrencyCode ();
    if (aObj == null)
    {
      aObj = new DocumentCurrencyCodeType (sValueParam);
      setDocumentCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type TaxCurrencyCodeType and
   *         never <code>null</code>
   */
  @NonNull
  public TaxCurrencyCodeType setTaxCurrencyCode (@Nullable final String sValueParam)
  {
    TaxCurrencyCodeType aObj = getTaxCurrencyCode ();
    if (aObj == null)
    {
      aObj = new TaxCurrencyCodeType (sValueParam);
      setTaxCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type PricingCurrencyCodeType and
   *         never <code>null</code>
   */
  @NonNull
  public PricingCurrencyCodeType setPricingCurrencyCode (@Nullable final String sValueParam)
  {
    PricingCurrencyCodeType aObj = getPricingCurrencyCode ();
    if (aObj == null)
    {
      aObj = new PricingCurrencyCodeType (sValueParam);
      setPricingCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type PaymentCurrencyCodeType and
   *         never <code>null</code>
   */
  @NonNull
  public PaymentCurrencyCodeType setPaymentCurrencyCode (@Nullable final String sValueParam)
  {
    PaymentCurrencyCodeType aObj = getPaymentCurrencyCode ();
    if (aObj == null)
    {
      aObj = new PaymentCurrencyCodeType (sValueParam);
      setPaymentCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type
   *         PaymentAlternativeCurrencyCodeType and never <code>null</code>
   */
  @NonNull
  public PaymentAlternativeCurrencyCodeType setPaymentAlternativeCurrencyCode (@Nullable final String sValueParam)
  {
    PaymentAlternativeCurrencyCodeType aObj = getPaymentAlternativeCurrencyCode ();
    if (aObj == null)
    {
      aObj = new PaymentAlternativeCurrencyCodeType (sValueParam);
      setPaymentAlternativeCurrencyCode (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type AccountingCostCodeType and
   *         never <code>null</code>
   */
  @NonNull
  public AccountingCostCodeType setAccountingCostCode (@Nullable final String sValueParam)
  {
    AccountingCostCodeType aObj = getAccountingCostCode ();
    if (aObj == null)
    {
      aObj = new AccountingCostCodeType (sValueParam);
      setAccountingCostCode (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type LocalDate<br>
   *
   * @param aValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type IssueDateType and never
   *         <code>null</code>
   */
  @NonNull
  public IssueDateType setIssueDate (@Nullable final LocalDate aValueParam)
  {
    IssueDateType aObj = getIssueDate ();
    if (aObj == null)
    {
      aObj = new IssueDateType (aValueParam);
      setIssueDate (aObj);
    }
    else
    {
      aObj.setValue (aValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type LocalDate<br>
   *
   * @param aValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type DueDateType and never
   *         <code>null</code>
   */
  @NonNull
  public DueDateType setDueDate (@Nullable final LocalDate aValueParam)
  {
    DueDateType aObj = getDueDate ();
    if (aObj == null)
    {
      aObj = new DueDateType (aValueParam);
      setDueDate (aObj);
    }
    else
    {
      aObj.setValue (aValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type LocalDate<br>
   *
   * @param aValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type TaxPointDateType and never
   *         <code>null</code>
   */
  @NonNull
  public TaxPointDateType setTaxPointDate (@Nullable final LocalDate aValueParam)
  {
    TaxPointDateType aObj = getTaxPointDate ();
    if (aObj == null)
    {
      aObj = new TaxPointDateType (aValueParam);
      setTaxPointDate (aObj);
    }
    else
    {
      aObj.setValue (aValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type LocalTime<br>
   *
   * @param aValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type IssueTimeType and never
   *         <code>null</code>
   */
  @NonNull
  public IssueTimeType setIssueTime (@Nullable final LocalTime aValueParam)
  {
    IssueTimeType aObj = getIssueTime ();
    if (aObj == null)
    {
      aObj = new IssueTimeType (aValueParam);
      setIssueTime (aObj);
    }
    else
    {
      aObj.setValue (aValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type UBLVersionIDType and never
   *         <code>null</code>
   */
  @NonNull
  public UBLVersionIDType setUBLVersionID (@Nullable final String sValueParam)
  {
    UBLVersionIDType aObj = getUBLVersionID ();
    if (aObj == null)
    {
      aObj = new UBLVersionIDType (sValueParam);
      setUBLVersionID (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type CustomizationIDType and
   *         never <code>null</code>
   */
  @NonNull
  public CustomizationIDType setCustomizationID (@Nullable final String sValueParam)
  {
    CustomizationIDType aObj = getCustomizationID ();
    if (aObj == null)
    {
      aObj = new CustomizationIDType (sValueParam);
      setCustomizationID (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type ProfileIDType and never
   *         <code>null</code>
   */
  @NonNull
  public ProfileIDType setProfileID (@Nullable final String sValueParam)
  {
    ProfileIDType aObj = getProfileID ();
    if (aObj == null)
    {
      aObj = new ProfileIDType (sValueParam);
      setProfileID (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type ProfileExecutionIDType and
   *         never <code>null</code>
   */
  @NonNull
  public ProfileExecutionIDType setProfileExecutionID (@Nullable final String sValueParam)
  {
    ProfileExecutionIDType aObj = getProfileExecutionID ();
    if (aObj == null)
    {
      aObj = new ProfileExecutionIDType (sValueParam);
      setProfileExecutionID (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type IDType and never
   *         <code>null</code>
   */
  @NonNull
  public IDType setID (@Nullable final String sValueParam)
  {
    IDType aObj = getID ();
    if (aObj == null)
    {
      aObj = new IDType (sValueParam);
      setID (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type UUIDType and never
   *         <code>null</code>
   */
  @NonNull
  public UUIDType setUUID (@Nullable final String sValueParam)
  {
    UUIDType aObj = getUUID ();
    if (aObj == null)
    {
      aObj = new UUIDType (sValueParam);
      setUUID (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type boolean<br>
   *
   * @param bValueParam
   *        The value to be set.
   * @return The created intermediary object of type CopyIndicatorType and never
   *         <code>null</code>
   */
  @NonNull
  public CopyIndicatorType setCopyIndicator (final boolean bValueParam)
  {
    CopyIndicatorType aObj = getCopyIndicator ();
    if (aObj == null)
    {
      aObj = new CopyIndicatorType (bValueParam);
      setCopyIndicator (aObj);
    }
    else
    {
      aObj.setValue (bValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type BigDecimal<br>
   *
   * @param aValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type LineCountNumericType and
   *         never <code>null</code>
   */
  @NonNull
  public LineCountNumericType setLineCountNumeric (@Nullable final BigDecimal aValueParam)
  {
    LineCountNumericType aObj = getLineCountNumeric ();
    if (aObj == null)
    {
      aObj = new LineCountNumericType (aValueParam);
      setLineCountNumeric (aObj);
    }
    else
    {
      aObj.setValue (aValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type AccountingCostType and
   *         never <code>null</code>
   */
  @NonNull
  public AccountingCostType setAccountingCost (@Nullable final String sValueParam)
  {
    AccountingCostType aObj = getAccountingCost ();
    if (aObj == null)
    {
      aObj = new AccountingCostType (sValueParam);
      setAccountingCost (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
    }
    return aObj;
  }

  /**
   * Special setter with value of type String<br>
   *
   * @param sValueParam
   *        The value to be set. May be <code>null</code>.
   * @return The created intermediary object of type BuyerReferenceType and
   *         never <code>null</code>
   */
  @NonNull
  public BuyerReferenceType setBuyerReference (@Nullable final String sValueParam)
  {
    BuyerReferenceType aObj = getBuyerReference ();
    if (aObj == null)
    {
      aObj = new BuyerReferenceType (sValueParam);
      setBuyerReference (aObj);
    }
    else
    {
      aObj.setValue (sValueParam);
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
   * @param bNullValue
   *        The value to be returned, if the owning object is <code>null</code>
   * @return Either the value of the contained CopyIndicatorType object or the
   *         passed nullValue
   */
  public boolean isCopyIndicatorValue (final boolean bNullValue)
  {
    final CopyIndicatorType aObj = getCopyIndicator ();
    return ((aObj == null) ? bNullValue : aObj.isValue ());
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
