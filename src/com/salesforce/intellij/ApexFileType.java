package com.salesforce.intellij;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: jrizzo
 * Date: 9/22/13
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApexFileType extends LanguageFileType {
    public static final ApexFileType INSTANCE = new ApexFileType();

    private ApexFileType() {
        super(ApexLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Apex File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Apex Class File";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return ".cls";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ApexIcons.FILE;
    }
}
