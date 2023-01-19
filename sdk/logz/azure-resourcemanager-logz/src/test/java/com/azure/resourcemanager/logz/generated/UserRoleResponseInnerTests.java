// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logz.fluent.models.UserRoleResponseInner;
import com.azure.resourcemanager.logz.models.UserRole;
import org.junit.jupiter.api.Assertions;

public final class UserRoleResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserRoleResponseInner model =
            BinaryData.fromString("{\"role\":\"None\"}").toObject(UserRoleResponseInner.class);
        Assertions.assertEquals(UserRole.NONE, model.role());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserRoleResponseInner model = new UserRoleResponseInner().withRole(UserRole.NONE);
        model = BinaryData.fromObject(model).toObject(UserRoleResponseInner.class);
        Assertions.assertEquals(UserRole.NONE, model.role());
    }
}