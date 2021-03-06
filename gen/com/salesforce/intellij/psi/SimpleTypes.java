// This is a generated file. Not intended for manual editing.
package com.salesforce.intellij.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.salesforce.intellij.psi.impl.*;

public interface SimpleTypes {

  IElementType PROPERTY = new SimpleElementType("PROPERTY");

  IElementType COMMENT = new SimpleTokenType("COMMENT");
  IElementType CRLF = new SimpleTokenType("CRLF");
  IElementType KEY = new SimpleTokenType("KEY");
  IElementType SEPARATOR = new SimpleTokenType("SEPARATOR");
  IElementType VALUE = new SimpleTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new ApexPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
