// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.models.ImpactType;
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.Update;
import com.azure.resourcemanager.maintenance.models.UpdateStatus;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class UpdatesListParentMockTests {
    @Test
    public void testListParent() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"maintenanceScope\":\"InGuestPatch\",\"impactType\":\"None\",\"status\":\"InProgress\",\"impactDurationInSec\":495861202,\"notBefore\":\"2021-07-29T03:03:57Z\",\"properties\":{\"resourceId\":\"n\"}}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MaintenanceManager manager =
            MaintenanceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Update> response =
            manager
                .updates()
                .listParent(
                    "cq", "qxolzdahzx", "t", "bgbkdmoizpost", "grcfb", "nrmfqjhhk", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(MaintenanceScope.IN_GUEST_PATCH, response.iterator().next().maintenanceScope());
        Assertions.assertEquals(ImpactType.NONE, response.iterator().next().impactType());
        Assertions.assertEquals(UpdateStatus.IN_PROGRESS, response.iterator().next().status());
        Assertions.assertEquals(495861202, response.iterator().next().impactDurationInSec());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-29T03:03:57Z"), response.iterator().next().notBefore());
        Assertions.assertEquals("n", response.iterator().next().resourceId());
    }
}