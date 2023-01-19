// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.Job;
import com.azure.resourcemanager.mediaservices.models.Priority;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class JobsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"created\":\"2021-04-25T00:58:51Z\",\"state\":\"Queued\",\"description\":\"jptmcgsbost\",\"input\":{\"@odata.type\":\"JobInput\"},\"lastModified\":\"2021-05-03T01:44:42Z\",\"outputs\":[],\"priority\":\"Low\",\"correlationData\":{\"neqvcwwyyurmo\":\"utmzlbiojlvfhrbb\",\"rsnm\":\"hppr\"},\"startTime\":\"2021-07-18T02:05:58Z\",\"endTime\":\"2021-03-23T11:52:12Z\"},\"id\":\"jnhlbkpbzpcpiljh\",\"name\":\"hzvechndbnwieho\",\"type\":\"ewjwiuubw\"}";

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

        MediaServicesManager manager =
            MediaServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Job response =
            manager
                .jobs()
                .getWithResponse("bkwvzg", "zvd", "bzdixzmq", "noda", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("jptmcgsbost", response.description());
        Assertions.assertEquals(Priority.LOW, response.priority());
        Assertions.assertEquals("utmzlbiojlvfhrbb", response.correlationData().get("neqvcwwyyurmo"));
    }
}