package com.salesforce.intellij;

import com.intellij.lang.Language;

/**
 * Created with IntelliJ IDEA.
 * User: jrizzo
 * Date: 9/22/13
 * Time: 4:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApexLanguage extends Language {
    public static final ApexLanguage INSTANCE = new ApexLanguage();

    private ApexLanguage() {
        super("Apex");
    }
}
