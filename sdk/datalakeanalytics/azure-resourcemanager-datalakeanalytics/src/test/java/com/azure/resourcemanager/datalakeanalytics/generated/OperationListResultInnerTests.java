// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakeanalytics.fluent.models.OperationListResultInner;

public final class OperationListResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResultInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"uhashsfwx\",\"display\":{\"provider\":\"w\",\"resource\":\"cugicjoox\",\"operation\":\"ebwpucwwfvo\",\"description\":\"vmeueci\"},\"properties\":{},\"origin\":\"system\"},{\"name\":\"uojgj\",\"display\":{\"provider\":\"ueiotwmcdyt\",\"resource\":\"wit\",\"operation\":\"rjaw\",\"description\":\"wgxhn\"},\"properties\":{},\"origin\":\"system\"},{\"name\":\"kpycgklwndnhjd\",\"display\":{\"provider\":\"hvylwzbt\",\"resource\":\"xujznbmpowu\",\"operation\":\"rzqlveu\",\"description\":\"upjm\"},\"properties\":{},\"origin\":\"system\"}],\"nextLink\":\"bcswsrt\"}")
                .toObject(OperationListResultInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResultInner model = new OperationListResultInner();
        model = BinaryData.fromObject(model).toObject(OperationListResultInner.class);
    }
}