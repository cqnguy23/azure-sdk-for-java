// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.IntegrationRuntimeMonitoringDataInner;
import com.azure.resourcemanager.synapse.models.IntegrationRuntimeNodeMonitoringData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeMonitoringDataInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeMonitoringDataInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"jfrnxousxauzlwv\",\"nodes\":[{\"nodeName\":\"ohqfzizv\",\"availableMemoryInMB\":1707376707,\"cpuUtilization\":1537872857,\"concurrentJobsLimit\":898982207,\"concurrentJobsRunning\":2035263923,\"maxConcurrentJobs\":1281920058,\"sentBytes\":12.24882,\"receivedBytes\":47.57043,\"\":{\"lu\":\"dataovmribiattg\",\"fhnykzcugs\":\"datafotang\",\"xmcuqud\":\"datavxwlmzqwmvtxnj\"}},{\"nodeName\":\"vclx\",\"availableMemoryInMB\":1138354387,\"cpuUtilization\":267466114,\"concurrentJobsLimit\":1887329670,\"concurrentJobsRunning\":1186529927,\"maxConcurrentJobs\":1392311287,\"sentBytes\":75.20067,\"receivedBytes\":24.185776,\"\":{\"oxgjiuqhibt\":\"datazphdugneiknp\",\"pqwjedm\":\"dataz\",\"lkm\":\"datarrxxgewpktvq\"}},{\"nodeName\":\"zoyhlfbcgwg\",\"availableMemoryInMB\":1700222183,\"cpuUtilization\":325536454,\"concurrentJobsLimit\":809854276,\"concurrentJobsRunning\":189021776,\"maxConcurrentJobs\":1567586671,\"sentBytes\":49.565147,\"receivedBytes\":30.378746,\"\":{\"zpofoiyjwpfilk\":\"dataujqlafcbahh\",\"ogphuartvtiu\":\"datakkholvdndvia\",\"ahmnxhkxjqirw\":\"datayefchnm\"}},{\"nodeName\":\"eooxffifh\",\"availableMemoryInMB\":2004143928,\"cpuUtilization\":109793124,\"concurrentJobsLimit\":225627049,\"concurrentJobsRunning\":682704724,\"maxConcurrentJobs\":557932259,\"sentBytes\":78.87173,\"receivedBytes\":99.20141,\"\":{\"abo\":\"dataamhsycxhxzgazt\"}}]}")
                .toObject(IntegrationRuntimeMonitoringDataInner.class);
        Assertions.assertEquals("jfrnxousxauzlwv", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeMonitoringDataInner model =
            new IntegrationRuntimeMonitoringDataInner()
                .withName("jfrnxousxauzlwv")
                .withNodes(
                    Arrays
                        .asList(
                            new IntegrationRuntimeNodeMonitoringData()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "ohqfzizv",
                                        "cpuUtilization",
                                        1537872857,
                                        "receivedBytes",
                                        47.57043f,
                                        "concurrentJobsLimit",
                                        898982207,
                                        "concurrentJobsRunning",
                                        2035263923,
                                        "maxConcurrentJobs",
                                        1281920058,
                                        "availableMemoryInMB",
                                        1707376707,
                                        "sentBytes",
                                        12.24882f)),
                            new IntegrationRuntimeNodeMonitoringData()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "vclx",
                                        "cpuUtilization",
                                        267466114,
                                        "receivedBytes",
                                        24.185776f,
                                        "concurrentJobsLimit",
                                        1887329670,
                                        "concurrentJobsRunning",
                                        1186529927,
                                        "maxConcurrentJobs",
                                        1392311287,
                                        "availableMemoryInMB",
                                        1138354387,
                                        "sentBytes",
                                        75.20067f)),
                            new IntegrationRuntimeNodeMonitoringData()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "zoyhlfbcgwg",
                                        "cpuUtilization",
                                        325536454,
                                        "receivedBytes",
                                        30.378746f,
                                        "concurrentJobsLimit",
                                        809854276,
                                        "concurrentJobsRunning",
                                        189021776,
                                        "maxConcurrentJobs",
                                        1567586671,
                                        "availableMemoryInMB",
                                        1700222183,
                                        "sentBytes",
                                        49.565147f)),
                            new IntegrationRuntimeNodeMonitoringData()
                                .withAdditionalProperties(
                                    mapOf(
                                        "nodeName",
                                        "eooxffifh",
                                        "cpuUtilization",
                                        109793124,
                                        "receivedBytes",
                                        99.20141f,
                                        "concurrentJobsLimit",
                                        225627049,
                                        "concurrentJobsRunning",
                                        682704724,
                                        "maxConcurrentJobs",
                                        557932259,
                                        "availableMemoryInMB",
                                        2004143928,
                                        "sentBytes",
                                        78.87173f))));
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeMonitoringDataInner.class);
        Assertions.assertEquals("jfrnxousxauzlwv", model.name());
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