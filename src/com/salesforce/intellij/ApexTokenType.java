package com.salesforce.intellij;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created with IntelliJ IDEA.
 * User: jrizzo
 * Date: 9/22/13
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApexTokenType extends IElementType {

    public ApexTokenType(@NotNull @NonNls String debugName) {
        super(debugName, ApexLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "ApexTokenType." + super.toString();
    }
}
