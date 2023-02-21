// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationForBatchUpdate;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationForBatchUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationForBatchUpdate model =
            BinaryData
                .fromString("{\"name\":\"hkryhtn\",\"properties\":{\"value\":\"zw\",\"source\":\"kjyemkk\"}}")
                .toObject(ConfigurationForBatchUpdate.class);
        Assertions.assertEquals("hkryhtn", model.name());
        Assertions.assertEquals("zw", model.value());
        Assertions.assertEquals("kjyemkk", model.source());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationForBatchUpdate model =
            new ConfigurationForBatchUpdate().withName("hkryhtn").withValue("zw").withSource("kjyemkk");
        model = BinaryData.fromObject(model).toObject(ConfigurationForBatchUpdate.class);
        Assertions.assertEquals("hkryhtn", model.name());
        Assertions.assertEquals("zw", model.value());
        Assertions.assertEquals("kjyemkk", model.source());
    }
}