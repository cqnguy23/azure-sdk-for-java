// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Exchange request. */
@Fluent
public final class ExchangeRequest {
    /*
     * Exchange request properties
     */
    @JsonProperty(value = "properties")
    private ExchangeRequestProperties properties;

    /** Creates an instance of ExchangeRequest class. */
    public ExchangeRequest() {
    }

    /**
     * Get the properties property: Exchange request properties.
     *
     * @return the properties value.
     */
    public ExchangeRequestProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Exchange request properties.
     *
     * @param properties the properties value to set.
     * @return the ExchangeRequest object itself.
     */
    public ExchangeRequest withProperties(ExchangeRequestProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}