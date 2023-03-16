// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotInner;
import org.junit.jupiter.api.Assertions;

public final class SnapshotInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotInner model =
            BinaryData
                .fromString(
                    "{\"location\":\"zlmwlxkvugfhz\",\"properties\":{\"snapshotId\":\"wjvzunluthnn\",\"created\":\"2021-03-11T05:06:45Z\",\"provisioningState\":\"i\"},\"id\":\"ilpjzuaejxdult\",\"name\":\"kzbbtd\",\"type\":\"umveekgpwozuhkf\"}")
                .toObject(SnapshotInner.class);
        Assertions.assertEquals("zlmwlxkvugfhz", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotInner model = new SnapshotInner().withLocation("zlmwlxkvugfhz");
        model = BinaryData.fromObject(model).toObject(SnapshotInner.class);
        Assertions.assertEquals("zlmwlxkvugfhz", model.location());
    }
}