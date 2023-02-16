// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeStatus;
import java.util.HashMap;
import java.util.Map;

public final class IntegrationRuntimeStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeStatus model =
            BinaryData
                .fromString(
                    "{\"type\":\"IntegrationRuntimeStatus\",\"dataFactoryName\":\"zdfuydzvkfvxcnqm\",\"state\":\"Offline\",\"\":{\"bemzqkzszuwi\":\"dataokmvkhlggd\",\"ljfp\":\"datatglxx\",\"pqcbfrmbodthsq\":\"datapicrmnzhrgmqgjsx\"}}")
                .toObject(IntegrationRuntimeStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeStatus model =
            new IntegrationRuntimeStatus()
                .withAdditionalProperties(
                    mapOf(
                        "dataFactoryName", "zdfuydzvkfvxcnqm", "state", "Offline", "type", "IntegrationRuntimeStatus"));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeStatus.class);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}