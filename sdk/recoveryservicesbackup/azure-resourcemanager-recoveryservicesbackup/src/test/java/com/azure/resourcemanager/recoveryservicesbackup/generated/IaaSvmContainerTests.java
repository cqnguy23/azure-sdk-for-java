// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaaSvmContainer;
import org.junit.jupiter.api.Assertions;

public final class IaaSvmContainerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IaaSvmContainer model =
            BinaryData
                .fromString(
                    "{\"containerType\":\"IaasVMContainer\",\"virtualMachineId\":\"lgsc\",\"virtualMachineVersion\":\"ri\",\"resourceGroup\":\"rsrrmoucsofldp\",\"friendlyName\":\"iyfc\",\"backupManagementType\":\"AzureStorage\",\"registrationStatus\":\"olhbhlvb\",\"healthStatus\":\"uqibsxtkcu\",\"protectableObjectType\":\"b\"}")
                .toObject(IaaSvmContainer.class);
        Assertions.assertEquals("iyfc", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_STORAGE, model.backupManagementType());
        Assertions.assertEquals("olhbhlvb", model.registrationStatus());
        Assertions.assertEquals("uqibsxtkcu", model.healthStatus());
        Assertions.assertEquals("b", model.protectableObjectType());
        Assertions.assertEquals("lgsc", model.virtualMachineId());
        Assertions.assertEquals("ri", model.virtualMachineVersion());
        Assertions.assertEquals("rsrrmoucsofldp", model.resourceGroup());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IaaSvmContainer model =
            new IaaSvmContainer()
                .withFriendlyName("iyfc")
                .withBackupManagementType(BackupManagementType.AZURE_STORAGE)
                .withRegistrationStatus("olhbhlvb")
                .withHealthStatus("uqibsxtkcu")
                .withProtectableObjectType("b")
                .withVirtualMachineId("lgsc")
                .withVirtualMachineVersion("ri")
                .withResourceGroup("rsrrmoucsofldp");
        model = BinaryData.fromObject(model).toObject(IaaSvmContainer.class);
        Assertions.assertEquals("iyfc", model.friendlyName());
        Assertions.assertEquals(BackupManagementType.AZURE_STORAGE, model.backupManagementType());
        Assertions.assertEquals("olhbhlvb", model.registrationStatus());
        Assertions.assertEquals("uqibsxtkcu", model.healthStatus());
        Assertions.assertEquals("b", model.protectableObjectType());
        Assertions.assertEquals("lgsc", model.virtualMachineId());
        Assertions.assertEquals("ri", model.virtualMachineVersion());
        Assertions.assertEquals("rsrrmoucsofldp", model.resourceGroup());
    }
}