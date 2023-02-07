// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/** The ProviderRegistrationPropertiesProviderHubMetadata model. */
@Fluent
public final class ProviderRegistrationPropertiesProviderHubMetadata extends ProviderHubMetadata {
    /** Creates an instance of ProviderRegistrationPropertiesProviderHubMetadata class. */
    public ProviderRegistrationPropertiesProviderHubMetadata() {
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationPropertiesProviderHubMetadata withProviderAuthorizations(
        List<ResourceProviderAuthorization> providerAuthorizations) {
        super.withProviderAuthorizations(providerAuthorizations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationPropertiesProviderHubMetadata withProviderAuthentication(
        ProviderHubMetadataProviderAuthentication providerAuthentication) {
        super.withProviderAuthentication(providerAuthentication);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProviderRegistrationPropertiesProviderHubMetadata withThirdPartyProviderAuthorization(
        ProviderHubMetadataThirdPartyProviderAuthorization thirdPartyProviderAuthorization) {
        super.withThirdPartyProviderAuthorization(thirdPartyProviderAuthorization);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}