// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.newrelicobservability.fluent.models.MonitoredResourceInner;
import com.azure.resourcemanager.newrelicobservability.models.MonitoredResourceListResponse;
import com.azure.resourcemanager.newrelicobservability.models.SendingLogsStatus;
import com.azure.resourcemanager.newrelicobservability.models.SendingMetricsStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonitoredResourceListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitoredResourceListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"id\":\"gf\",\"sendingMetrics\":\"Disabled\",\"reasonForMetricsStatus\":\"ezyiuokktwhrdxw\",\"sendingLogs\":\"Enabled\",\"reasonForLogsStatus\":\"sm\"},{\"id\":\"ureximoryocfs\",\"sendingMetrics\":\"Enabled\",\"reasonForMetricsStatus\":\"mddystkiiux\",\"sendingLogs\":\"Disabled\",\"reasonForLogsStatus\":\"dxorrqnbpoczv\"},{\"id\":\"fqrvkdvjsllrmvvd\",\"sendingMetrics\":\"Enabled\",\"reasonForMetricsStatus\":\"kpnpulexxbczwtr\",\"sendingLogs\":\"Enabled\",\"reasonForLogsStatus\":\"zb\"},{\"id\":\"vsovmyokac\",\"sendingMetrics\":\"Enabled\",\"reasonForMetricsStatus\":\"lhzdobp\",\"sendingLogs\":\"Enabled\",\"reasonForLogsStatus\":\"lb\"}],\"nextLink\":\"nchrkcciww\"}")
                .toObject(MonitoredResourceListResponse.class);
        Assertions.assertEquals("gf", model.value().get(0).id());
        Assertions.assertEquals(SendingMetricsStatus.DISABLED, model.value().get(0).sendingMetrics());
        Assertions.assertEquals("ezyiuokktwhrdxw", model.value().get(0).reasonForMetricsStatus());
        Assertions.assertEquals(SendingLogsStatus.ENABLED, model.value().get(0).sendingLogs());
        Assertions.assertEquals("sm", model.value().get(0).reasonForLogsStatus());
        Assertions.assertEquals("nchrkcciww", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitoredResourceListResponse model =
            new MonitoredResourceListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new MonitoredResourceInner()
                                .withId("gf")
                                .withSendingMetrics(SendingMetricsStatus.DISABLED)
                                .withReasonForMetricsStatus("ezyiuokktwhrdxw")
                                .withSendingLogs(SendingLogsStatus.ENABLED)
                                .withReasonForLogsStatus("sm"),
                            new MonitoredResourceInner()
                                .withId("ureximoryocfs")
                                .withSendingMetrics(SendingMetricsStatus.ENABLED)
                                .withReasonForMetricsStatus("mddystkiiux")
                                .withSendingLogs(SendingLogsStatus.DISABLED)
                                .withReasonForLogsStatus("dxorrqnbpoczv"),
                            new MonitoredResourceInner()
                                .withId("fqrvkdvjsllrmvvd")
                                .withSendingMetrics(SendingMetricsStatus.ENABLED)
                                .withReasonForMetricsStatus("kpnpulexxbczwtr")
                                .withSendingLogs(SendingLogsStatus.ENABLED)
                                .withReasonForLogsStatus("zb"),
                            new MonitoredResourceInner()
                                .withId("vsovmyokac")
                                .withSendingMetrics(SendingMetricsStatus.ENABLED)
                                .withReasonForMetricsStatus("lhzdobp")
                                .withSendingLogs(SendingLogsStatus.ENABLED)
                                .withReasonForLogsStatus("lb")))
                .withNextLink("nchrkcciww");
        model = BinaryData.fromObject(model).toObject(MonitoredResourceListResponse.class);
        Assertions.assertEquals("gf", model.value().get(0).id());
        Assertions.assertEquals(SendingMetricsStatus.DISABLED, model.value().get(0).sendingMetrics());
        Assertions.assertEquals("ezyiuokktwhrdxw", model.value().get(0).reasonForMetricsStatus());
        Assertions.assertEquals(SendingLogsStatus.ENABLED, model.value().get(0).sendingLogs());
        Assertions.assertEquals("sm", model.value().get(0).reasonForLogsStatus());
        Assertions.assertEquals("nchrkcciww", model.nextLink());
    }
}