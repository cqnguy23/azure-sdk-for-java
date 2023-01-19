// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualMachine;
import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualMachines Update. */
public final class VirtualMachinesUpdateSamples {
    /*
     * x-ms-original-file: specification/vmwarecloudsimple/resource-manager/Microsoft.VMwareCloudSimple/stable/2019-04-01/examples/PatchVirtualMachine.json
     */
    /**
     * Sample code: PatchVirtualMachine.
     *
     * @param manager Entry point to VMwareCloudSimpleManager.
     */
    public static void patchVirtualMachine(
        com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager) {
        VirtualMachine resource =
            manager
                .virtualMachines()
                .getByResourceGroupWithResponse("myResourceGroup", "myVirtualMachine", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("myTag", "tagValue")).apply();
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