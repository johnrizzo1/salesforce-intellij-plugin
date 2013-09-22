package com.salesforce.intellij;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: jrizzo
 * Date: 9/22/13
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApexFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(ApexFileType.INSTANCE, "cls");
    }
}
