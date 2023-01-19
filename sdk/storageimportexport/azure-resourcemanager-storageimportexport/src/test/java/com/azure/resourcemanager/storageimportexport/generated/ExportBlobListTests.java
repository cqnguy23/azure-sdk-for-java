// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storageimportexport.fluent.models.ExportBlobList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ExportBlobListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExportBlobList model =
            BinaryData
                .fromString("{\"blobPath\":[\"vbqid\"],\"blobPathPrefix\":[\"jzyulpk\",\"dj\"]}")
                .toObject(ExportBlobList.class);
        Assertions.assertEquals("vbqid", model.blobPath().get(0));
        Assertions.assertEquals("jzyulpk", model.blobPathPrefix().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExportBlobList model =
            new ExportBlobList()
                .withBlobPath(Arrays.asList("vbqid"))
                .withBlobPathPrefix(Arrays.asList("jzyulpk", "dj"));
        model = BinaryData.fromObject(model).toObject(ExportBlobList.class);
        Assertions.assertEquals("vbqid", model.blobPath().get(0));
        Assertions.assertEquals("jzyulpk", model.blobPathPrefix().get(0));
    }
}