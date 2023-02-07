// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceTypeSku model. */
@Fluent
public class ResourceTypeSku {
    /*
     * The skuSettings property.
     */
    @JsonProperty(value = "skuSettings", required = true)
    private List<SkuSetting> skuSettings;

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /** Creates an instance of ResourceTypeSku class. */
    public ResourceTypeSku() {
    }

    /**
     * Get the skuSettings property: The skuSettings property.
     *
     * @return the skuSettings value.
     */
    public List<SkuSetting> skuSettings() {
        return this.skuSettings;
    }

    /**
     * Set the skuSettings property: The skuSettings property.
     *
     * @param skuSettings the skuSettings value to set.
     * @return the ResourceTypeSku object itself.
     */
    public ResourceTypeSku withSkuSettings(List<SkuSetting> skuSettings) {
        this.skuSettings = skuSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioningState property.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ResourceTypeSku object itself.
     */
    public ResourceTypeSku withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (skuSettings() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property skuSettings in model ResourceTypeSku"));
        } else {
            skuSettings().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceTypeSku.class);
}