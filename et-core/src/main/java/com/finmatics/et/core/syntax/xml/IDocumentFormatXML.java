package com.finmatics.et.core.syntax.xml;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.finmatics.et.core.domain.ESyntaxType;
import com.finmatics.et.core.domain.IDocumentFormat;

public interface IDocumentFormatXML extends IDocumentFormat
{
  @Nonnull
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
