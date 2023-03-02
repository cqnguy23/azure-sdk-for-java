// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.IngressStartAtProperties;
import com.azure.resourcemanager.timeseriesinsights.models.IngressStartAtType;
import org.junit.jupiter.api.Assertions;

public final class IngressStartAtPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IngressStartAtProperties model =
            BinaryData
                .fromString("{\"type\":\"CustomEnqueuedTime\",\"time\":\"pkdwzbai\"}")
                .toObject(IngressStartAtProperties.class);
        Assertions.assertEquals(IngressStartAtType.CUSTOM_ENQUEUED_TIME, model.type());
        Assertions.assertEquals("pkdwzbai", model.time());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IngressStartAtProperties model =
            new IngressStartAtProperties().withType(IngressStartAtType.CUSTOM_ENQUEUED_TIME).withTime("pkdwzbai");
        model = BinaryData.fromObject(model).toObject(IngressStartAtProperties.class);
        Assertions.assertEquals(IngressStartAtType.CUSTOM_ENQUEUED_TIME, model.type());
        Assertions.assertEquals("pkdwzbai", model.time());
    }
}