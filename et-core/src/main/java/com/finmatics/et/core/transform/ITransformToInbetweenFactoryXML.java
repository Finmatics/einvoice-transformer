package com.finmatics.et.core.transform;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.w3c.dom.Document;

import com.finmatics.et.core.syntax.xml.IDocumentFormatXML;
import com.finmatics.et.inbetween.model.a21.A21InvoiceType;
import com.helger.commons.error.list.ErrorList;

public interface ITransformToInbetweenFactoryXML
{
  /**
   * @return The document format details. May not be <code>null</code>. The
   *         syntax must be XML.
   */
  @Nonnull
  IDocumentFormatXML getDocumentFormat ();

  /**
   * Convert the provided XML Document to the in-between format.
   *
   * @param aDoc
   *        The document to convert. Never <code>null</code>.
   * @param aErrorList
   *        The error list to be filled with all transformation errors.
   * @return <code>null</code> in case the transformation failed.
   */
  @Nullable
  A21InvoiceType convertToInbetweenFormat (@Nonnull Document aDoc, @Nonnull ErrorList aErrorList);
}
