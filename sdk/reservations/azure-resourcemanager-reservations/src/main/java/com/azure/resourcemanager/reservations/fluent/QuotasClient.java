// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.reservations.fluent.models.CurrentQuotaLimitBaseInner;
import com.azure.resourcemanager.reservations.models.QuotasGetResponse;

/** An instance of this class provides access to all the operations defined in QuotasClient. */
public interface QuotasClient {
    /**
     * Get the current quota (service limit) and usage of a resource. You can use the response from the GET operation to
     * submit quota update request.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current quota (service limit) and usage of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QuotasGetResponse getWithResponse(
        String subscriptionId, String providerId, String location, String resourceName, Context context);

    /**
     * Get the current quota (service limit) and usage of a resource. You can use the response from the GET operation to
     * submit quota update request.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current quota (service limit) and usage of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner get(String subscriptionId, String providerId, String location, String resourceName);

    /**
     * Create or update the quota (service limits) of a resource to the requested value. Steps: 1. Make the Get request
     * to get the quota information for specific resource. 2. To increase the quota, update the limit field in the
     * response from Get request to new value. 3. Submit the JSON to the quota request API to update the quota. The
     * Create quota request may be constructed as follows. The PUT operation can be used to update the quota.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param createQuotaRequest Quota requests payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of quota properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CurrentQuotaLimitBaseInner>, CurrentQuotaLimitBaseInner> beginCreateOrUpdate(
        String subscriptionId,
        String providerId,
        String location,
        String resourceName,
        CurrentQuotaLimitBaseInner createQuotaRequest);

    /**
     * Create or update the quota (service limits) of a resource to the requested value. Steps: 1. Make the Get request
     * to get the quota information for specific resource. 2. To increase the quota, update the limit field in the
     * response from Get request to new value. 3. Submit the JSON to the quota request API to update the quota. The
     * Create quota request may be constructed as follows. The PUT operation can be used to update the quota.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param createQuotaRequest Quota requests payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of quota properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CurrentQuotaLimitBaseInner>, CurrentQuotaLimitBaseInner> beginCreateOrUpdate(
        String subscriptionId,
        String providerId,
        String location,
        String resourceName,
        CurrentQuotaLimitBaseInner createQuotaRequest,
        Context context);

    /**
     * Create or update the quota (service limits) of a resource to the requested value. Steps: 1. Make the Get request
     * to get the quota information for specific resource. 2. To increase the quota, update the limit field in the
     * response from Get request to new value. 3. Submit the JSON to the quota request API to update the quota. The
     * Create quota request may be constructed as follows. The PUT operation can be used to update the quota.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param createQuotaRequest Quota requests payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner createOrUpdate(
        String subscriptionId,
        String providerId,
        String location,
        String resourceName,
        CurrentQuotaLimitBaseInner createQuotaRequest);

    /**
     * Create or update the quota (service limits) of a resource to the requested value. Steps: 1. Make the Get request
     * to get the quota information for specific resource. 2. To increase the quota, update the limit field in the
     * response from Get request to new value. 3. Submit the JSON to the quota request API to update the quota. The
     * Create quota request may be constructed as follows. The PUT operation can be used to update the quota.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param createQuotaRequest Quota requests payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner createOrUpdate(
        String subscriptionId,
        String providerId,
        String location,
        String resourceName,
        CurrentQuotaLimitBaseInner createQuotaRequest,
        Context context);

    /**
     * Update the quota (service limits) of this resource to the requested value. • To get the quota information for
     * specific resource, send a GET request. • To increase the quota, update the limit field from the GET response to a
     * new value. • To update the quota value, submit the JSON response to the quota request API to update the quota. •
     * To update the quota. use the PATCH operation.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param createQuotaRequest Payload for the quota request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of quota properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CurrentQuotaLimitBaseInner>, CurrentQuotaLimitBaseInner> beginUpdate(
        String subscriptionId,
        String providerId,
        String location,
        String resourceName,
        CurrentQuotaLimitBaseInner createQuotaRequest);

    /**
     * Update the quota (service limits) of this resource to the requested value. • To get the quota information for
     * specific resource, send a GET request. • To increase the quota, update the limit field from the GET response to a
     * new value. • To update the quota value, submit the JSON response to the quota request API to update the quota. •
     * To update the quota. use the PATCH operation.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param createQuotaRequest Payload for the quota request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of quota properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CurrentQuotaLimitBaseInner>, CurrentQuotaLimitBaseInner> beginUpdate(
        String subscriptionId,
        String providerId,
        String location,
        String resourceName,
        CurrentQuotaLimitBaseInner createQuotaRequest,
        Context context);

    /**
     * Update the quota (service limits) of this resource to the requested value. • To get the quota information for
     * specific resource, send a GET request. • To increase the quota, update the limit field from the GET response to a
     * new value. • To update the quota value, submit the JSON response to the quota request API to update the quota. •
     * To update the quota. use the PATCH operation.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param createQuotaRequest Payload for the quota request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner update(
        String subscriptionId,
        String providerId,
        String location,
        String resourceName,
        CurrentQuotaLimitBaseInner createQuotaRequest);

    /**
     * Update the quota (service limits) of this resource to the requested value. • To get the quota information for
     * specific resource, send a GET request. • To increase the quota, update the limit field from the GET response to a
     * new value. • To update the quota value, submit the JSON response to the quota request API to update the quota. •
     * To update the quota. use the PATCH operation.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param resourceName The resource name for a resource provider, such as SKU name for Microsoft.Compute, Sku or
     *     TotalLowPriorityCores for Microsoft.MachineLearningServices.
     * @param createQuotaRequest Payload for the quota request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner update(
        String subscriptionId,
        String providerId,
        String location,
        String resourceName,
        CurrentQuotaLimitBaseInner createQuotaRequest,
        Context context);

    /**
     * Gets a list of current quotas (service limits) and usage for all resources. The response from the list quota
     * operation can be leveraged to request quota updates.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current quotas (service limits) and usage for all resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CurrentQuotaLimitBaseInner> list(String subscriptionId, String providerId, String location);

    /**
     * Gets a list of current quotas (service limits) and usage for all resources. The response from the list quota
     * operation can be leveraged to request quota updates.
     *
     * @param subscriptionId Azure subscription ID.
     * @param providerId Azure resource provider ID.
     * @param location Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current quotas (service limits) and usage for all resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CurrentQuotaLimitBaseInner> list(
        String subscriptionId, String providerId, String location, Context context);
}