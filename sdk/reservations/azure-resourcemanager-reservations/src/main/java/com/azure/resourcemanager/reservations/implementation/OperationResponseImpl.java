// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.implementation;

import com.azure.resourcemanager.reservations.fluent.models.OperationResponseInner;
import com.azure.resourcemanager.reservations.models.OperationDisplay;
import com.azure.resourcemanager.reservations.models.OperationResponse;

public final class OperationResponseImpl implements OperationResponse {
    private OperationResponseInner innerObject;

    private final com.azure.resourcemanager.reservations.ReservationsManager serviceManager;

    OperationResponseImpl(
        OperationResponseInner innerObject, com.azure.resourcemanager.reservations.ReservationsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public OperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public OperationResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.reservations.ReservationsManager manager() {
        return this.serviceManager;
    }
}