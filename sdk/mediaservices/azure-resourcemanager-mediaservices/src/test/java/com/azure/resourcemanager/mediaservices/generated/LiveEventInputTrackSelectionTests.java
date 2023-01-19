// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.LiveEventInputTrackSelection;
import org.junit.jupiter.api.Assertions;

public final class LiveEventInputTrackSelectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LiveEventInputTrackSelection model =
            BinaryData
                .fromString("{\"property\":\"enwabfatk\",\"operation\":\"dxbjhwuaanozj\",\"value\":\"ph\"}")
                .toObject(LiveEventInputTrackSelection.class);
        Assertions.assertEquals("enwabfatk", model.property());
        Assertions.assertEquals("dxbjhwuaanozj", model.operation());
        Assertions.assertEquals("ph", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LiveEventInputTrackSelection model =
            new LiveEventInputTrackSelection().withProperty("enwabfatk").withOperation("dxbjhwuaanozj").withValue("ph");
        model = BinaryData.fromObject(model).toObject(LiveEventInputTrackSelection.class);
        Assertions.assertEquals("enwabfatk", model.property());
        Assertions.assertEquals("dxbjhwuaanozj", model.operation());
        Assertions.assertEquals("ph", model.value());
    }
}