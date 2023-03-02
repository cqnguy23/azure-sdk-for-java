// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.models.LogSpecification;
import org.junit.jupiter.api.Assertions;

public final class LogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogSpecification model =
            BinaryData
                .fromString("{\"name\":\"cndvkaozwyiftyhx\",\"displayName\":\"rokft\"}")
                .toObject(LogSpecification.class);
        Assertions.assertEquals("cndvkaozwyiftyhx", model.name());
        Assertions.assertEquals("rokft", model.displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogSpecification model = new LogSpecification().withName("cndvkaozwyiftyhx").withDisplayName("rokft");
        model = BinaryData.fromObject(model).toObject(LogSpecification.class);
        Assertions.assertEquals("cndvkaozwyiftyhx", model.name());
        Assertions.assertEquals("rokft", model.displayName());
    }
}