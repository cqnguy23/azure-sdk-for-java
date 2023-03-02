// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.WorkloadNetworkGatewayInner;
import org.junit.jupiter.api.Assertions;

public final class WorkloadNetworkGatewayInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkloadNetworkGatewayInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"displayName\":\"xgk\",\"path\":\"mgucna\"},\"id\":\"kteo\",\"name\":\"llwptfdy\",\"type\":\"pfqbuaceopzf\"}")
                .toObject(WorkloadNetworkGatewayInner.class);
        Assertions.assertEquals("xgk", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkloadNetworkGatewayInner model = new WorkloadNetworkGatewayInner().withDisplayName("xgk");
        model = BinaryData.fromObject(model).toObject(WorkloadNetworkGatewayInner.class);
        Assertions.assertEquals("xgk", model.displayName());
    }
}