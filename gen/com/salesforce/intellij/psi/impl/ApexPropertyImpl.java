// This is a generated file. Not intended for manual editing.
package com.salesforce.intellij.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.salesforce.intellij.psi.SimpleTypes.*;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.salesforce.intellij.parser.GeneratedParserUtilBase;
import com.salesforce.intellij.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class ApexPropertyImpl extends StubBasedPsiElementBase<GeneratedParserUtilBase> implements ApexProperty {

  public ApexPropertyImpl(ASTNode node) {
    super(node);
  }

  public ApexPropertyImpl(GeneratedParserUtilBase stub, IStubElementType nodeType) {
    super(stub, nodeType);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ApexVisitor) ((ApexVisitor)visitor).visitProperty(this);
    else super.accept(visitor);
  }

}
