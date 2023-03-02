// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.GenericProtectedItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GenericProtectedItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GenericProtectedItem model =
            BinaryData
                .fromString(
                    "{\"protectedItemType\":\"GenericProtectedItem\",\"friendlyName\":\"mjjyuojq\",\"policyState\":\"baxk\",\"protectionState\":\"Protected\",\"protectedItemId\":378200694653432281,\"sourceAssociations\":{\"hsyrqunj\":\"fjkwrusnkq\",\"akdkifmjnnawtqab\":\"hdenxaulk\"},\"fabricName\":\"uckpggqoweyir\",\"backupManagementType\":\"AzureSql\",\"workloadType\":\"VM\",\"containerName\":\"gwflq\",\"sourceResourceId\":\"pizruwnpqxpxiw\",\"policyId\":\"ngjsaasi\",\"lastRecoveryPoint\":\"2021-08-02T11:55:53Z\",\"backupSetName\":\"zjvkviirhgfgrws\",\"createMode\":\"Default\",\"deferredDeleteTimeInUTC\":\"2021-04-27T20:58:15Z\",\"isScheduledForDeferredDelete\":true,\"deferredDeleteTimeRemaining\":\"zb\",\"isDeferredDeleteScheduleUpcoming\":false,\"isRehydrate\":false,\"resourceGuardOperationRequests\":[\"tctbrxkjzwrgxffm\",\"hkwfbkgozxwop\",\"bydpizqaclnapxb\"],\"isArchiveEnabled\":false,\"policyName\":\"ugjknf\",\"softDeleteRetentionPeriod\":1087326396}")
                .toObject(GenericProtectedItem.class);
        Assertions.assertEquals("gwflq", model.containerName());
        Assertions.assertEquals("pizruwnpqxpxiw", model.sourceResourceId());
        Assertions.assertEquals("ngjsaasi", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-02T11:55:53Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("zjvkviirhgfgrws", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-27T20:58:15Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("zb", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(false, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("tctbrxkjzwrgxffm", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("ugjknf", model.policyName());
        Assertions.assertEquals(1087326396, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("mjjyuojq", model.friendlyName());
        Assertions.assertEquals("baxk", model.policyState());
        Assertions.assertEquals(ProtectionState.PROTECTED, model.protectionState());
        Assertions.assertEquals(378200694653432281L, model.protectedItemId());
        Assertions.assertEquals("fjkwrusnkq", model.sourceAssociations().get("hsyrqunj"));
        Assertions.assertEquals("uckpggqoweyir", model.fabricName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GenericProtectedItem model =
            new GenericProtectedItem()
                .withContainerName("gwflq")
                .withSourceResourceId("pizruwnpqxpxiw")
                .withPolicyId("ngjsaasi")
                .withLastRecoveryPoint(OffsetDateTime.parse("2021-08-02T11:55:53Z"))
                .withBackupSetName("zjvkviirhgfgrws")
                .withCreateMode(CreateMode.DEFAULT)
                .withDeferredDeleteTimeInUtc(OffsetDateTime.parse("2021-04-27T20:58:15Z"))
                .withIsScheduledForDeferredDelete(true)
                .withDeferredDeleteTimeRemaining("zb")
                .withIsDeferredDeleteScheduleUpcoming(false)
                .withIsRehydrate(false)
                .withResourceGuardOperationRequests(
                    Arrays.asList("tctbrxkjzwrgxffm", "hkwfbkgozxwop", "bydpizqaclnapxb"))
                .withIsArchiveEnabled(false)
                .withPolicyName("ugjknf")
                .withSoftDeleteRetentionPeriod(1087326396)
                .withFriendlyName("mjjyuojq")
                .withPolicyState("baxk")
                .withProtectionState(ProtectionState.PROTECTED)
                .withProtectedItemId(378200694653432281L)
                .withSourceAssociations(mapOf("hsyrqunj", "fjkwrusnkq", "akdkifmjnnawtqab", "hdenxaulk"))
                .withFabricName("uckpggqoweyir");
        model = BinaryData.fromObject(model).toObject(GenericProtectedItem.class);
        Assertions.assertEquals("gwflq", model.containerName());
        Assertions.assertEquals("pizruwnpqxpxiw", model.sourceResourceId());
        Assertions.assertEquals("ngjsaasi", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-02T11:55:53Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("zjvkviirhgfgrws", model.backupSetName());
        Assertions.assertEquals(CreateMode.DEFAULT, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-27T20:58:15Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(true, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("zb", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(false, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("tctbrxkjzwrgxffm", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("ugjknf", model.policyName());
        Assertions.assertEquals(1087326396, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("mjjyuojq", model.friendlyName());
        Assertions.assertEquals("baxk", model.policyState());
        Assertions.assertEquals(ProtectionState.PROTECTED, model.protectionState());
        Assertions.assertEquals(378200694653432281L, model.protectedItemId());
        Assertions.assertEquals("fjkwrusnkq", model.sourceAssociations().get("hsyrqunj"));
        Assertions.assertEquals("uckpggqoweyir", model.fabricName());
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