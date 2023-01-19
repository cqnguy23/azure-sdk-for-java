// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.QueryAnalysisValidationResult;

public final class QueryAnalysisValidationResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QueryAnalysisValidationResult model =
            BinaryData
                .fromString(
                    "{\"queryResults\":{\"queryText\":\"jlyjtlvofq\",\"statementsInBatch\":3485118187596080390,\"sourceResult\":{\"executionCount\":628433967464068666,\"cpuTimeMs\":42.81506,\"elapsedTimeMs\":93.550156,\"waitStats\":{},\"hasErrors\":false,\"sqlErrors\":[\"vdwxfzwi\",\"vwzjbhyz\"]},\"targetResult\":{\"executionCount\":6059728272001096126,\"cpuTimeMs\":69.97488,\"elapsedTimeMs\":96.81164,\"waitStats\":{},\"hasErrors\":true,\"sqlErrors\":[\"nvuqeqvldspa\",\"tjb\"]}},\"validationErrors\":{\"text\":\"mflvest\",\"severity\":\"Error\"}}")
                .toObject(QueryAnalysisValidationResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QueryAnalysisValidationResult model = new QueryAnalysisValidationResult();
        model = BinaryData.fromObject(model).toObject(QueryAnalysisValidationResult.class);
    }
}