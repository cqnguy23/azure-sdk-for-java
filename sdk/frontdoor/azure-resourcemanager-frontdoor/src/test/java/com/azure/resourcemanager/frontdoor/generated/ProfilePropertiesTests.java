// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.ProfileProperties;
import com.azure.resourcemanager.frontdoor.models.State;
import org.junit.jupiter.api.Assertions;

public final class ProfilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProfileProperties model =
            BinaryData
                .fromString("{\"resourceState\":\"Deleting\",\"enabledState\":\"Enabled\"}")
                .toObject(ProfileProperties.class);
        Assertions.assertEquals(State.ENABLED, model.enabledState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProfileProperties model = new ProfileProperties().withEnabledState(State.ENABLED);
        model = BinaryData.fromObject(model).toObject(ProfileProperties.class);
        Assertions.assertEquals(State.ENABLED, model.enabledState());
    }
}