// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

/** Samples for ConfigurationAssignments DeleteParent. */
public final class ConfigurationAssignmentsDeleteParentSamples {
    /*
     * x-ms-original-file: specification/maintenance/resource-manager/Microsoft.Maintenance/stable/2021-05-01/examples/ConfigurationAssignments_DeleteParent.json
     */
    /**
     * Sample code: ConfigurationAssignments_DeleteParent.
     *
     * @param manager Entry point to MaintenanceManager.
     */
    public static void configurationAssignmentsDeleteParent(
        com.azure.resourcemanager.maintenance.MaintenanceManager manager) {
        manager
            .configurationAssignments()
            .deleteParentWithResponse(
                "examplerg",
                "Microsoft.Compute",
                "virtualMachineScaleSets",
                "smdtest1",
                "virtualMachines",
                "smdvm1",
                "workervmConfiguration",
                com.azure.core.util.Context.NONE);
    }
}