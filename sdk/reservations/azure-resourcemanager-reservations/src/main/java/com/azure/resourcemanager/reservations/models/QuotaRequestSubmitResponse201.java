// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.resourcemanager.reservations.fluent.models.QuotaRequestSubmitResponse201Inner;

/** An immutable client-side representation of QuotaRequestSubmitResponse201. */
public interface QuotaRequestSubmitResponse201 {
    /**
     * Gets the id property: The quota request ID. Use the requestId parameter to check the request status.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Operation ID.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the provisioningState property: The details of the quota request status.
     *
     * @return the provisioningState value.
     */
    QuotaRequestState provisioningState();

    /**
     * Gets the message property: A user friendly message.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.reservations.fluent.models.QuotaRequestSubmitResponse201Inner object.
     *
     * @return the inner object.
     */
    QuotaRequestSubmitResponse201Inner innerModel();
}