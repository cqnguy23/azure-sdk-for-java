// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.SubscriptionIsAllowedToCreateJobValidationRequest;

public final class SubscriptionIsAllowedToCreateJobValidationRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SubscriptionIsAllowedToCreateJobValidationRequest model =
            BinaryData
                .fromString("{\"validationType\":\"ValidateSubscriptionIsAllowedToCreateJob\"}")
                .toObject(SubscriptionIsAllowedToCreateJobValidationRequest.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SubscriptionIsAllowedToCreateJobValidationRequest model =
            new SubscriptionIsAllowedToCreateJobValidationRequest();
        model = BinaryData.fromObject(model).toObject(SubscriptionIsAllowedToCreateJobValidationRequest.class);
    }
}