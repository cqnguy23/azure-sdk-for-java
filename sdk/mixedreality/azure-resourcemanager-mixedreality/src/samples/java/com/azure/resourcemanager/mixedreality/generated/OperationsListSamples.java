// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/mixedreality/resource-manager/Microsoft.MixedReality/stable/2021-01-01/examples/proxy/ExposingAvailableOperations.json
     */
    /**
     * Sample code: List available operations.
     *
     * @param manager Entry point to MixedRealityManager.
     */
    public static void listAvailableOperations(com.azure.resourcemanager.mixedreality.MixedRealityManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}