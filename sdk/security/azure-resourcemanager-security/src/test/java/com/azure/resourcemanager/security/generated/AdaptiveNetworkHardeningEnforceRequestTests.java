// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardeningEnforceRequest;
import com.azure.resourcemanager.security.models.Direction;
import com.azure.resourcemanager.security.models.Rule;
import com.azure.resourcemanager.security.models.TransportProtocol;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AdaptiveNetworkHardeningEnforceRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdaptiveNetworkHardeningEnforceRequest model =
            BinaryData
                .fromString(
                    "{\"rules\":[{\"name\":\"vyc\",\"direction\":\"Inbound\",\"destinationPort\":1491139189,\"protocols\":[\"UDP\"],\"ipAddresses\":[\"nfnw\",\"btmvpdvjdhttza\",\"fedxihchrphkm\",\"rjdqnsdfzp\"]}],\"networkSecurityGroups\":[\"tg\",\"ylkdghrje\",\"utlwxezwzhok\"]}")
                .toObject(AdaptiveNetworkHardeningEnforceRequest.class);
        Assertions.assertEquals("vyc", model.rules().get(0).name());
        Assertions.assertEquals(Direction.INBOUND, model.rules().get(0).direction());
        Assertions.assertEquals(1491139189, model.rules().get(0).destinationPort());
        Assertions.assertEquals(TransportProtocol.UDP, model.rules().get(0).protocols().get(0));
        Assertions.assertEquals("nfnw", model.rules().get(0).ipAddresses().get(0));
        Assertions.assertEquals("tg", model.networkSecurityGroups().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdaptiveNetworkHardeningEnforceRequest model =
            new AdaptiveNetworkHardeningEnforceRequest()
                .withRules(
                    Arrays
                        .asList(
                            new Rule()
                                .withName("vyc")
                                .withDirection(Direction.INBOUND)
                                .withDestinationPort(1491139189)
                                .withProtocols(Arrays.asList(TransportProtocol.UDP))
                                .withIpAddresses(
                                    Arrays.asList("nfnw", "btmvpdvjdhttza", "fedxihchrphkm", "rjdqnsdfzp"))))
                .withNetworkSecurityGroups(Arrays.asList("tg", "ylkdghrje", "utlwxezwzhok"));
        model = BinaryData.fromObject(model).toObject(AdaptiveNetworkHardeningEnforceRequest.class);
        Assertions.assertEquals("vyc", model.rules().get(0).name());
        Assertions.assertEquals(Direction.INBOUND, model.rules().get(0).direction());
        Assertions.assertEquals(1491139189, model.rules().get(0).destinationPort());
        Assertions.assertEquals(TransportProtocol.UDP, model.rules().get(0).protocols().get(0));
        Assertions.assertEquals("nfnw", model.rules().get(0).ipAddresses().get(0));
        Assertions.assertEquals("tg", model.networkSecurityGroups().get(0));
    }
}