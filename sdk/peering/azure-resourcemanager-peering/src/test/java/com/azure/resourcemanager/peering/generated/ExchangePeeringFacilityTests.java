// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.models.ExchangePeeringFacility;
import org.junit.jupiter.api.Assertions;

public final class ExchangePeeringFacilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExchangePeeringFacility model =
            BinaryData
                .fromString(
                    "{\"exchangeName\":\"hmgkbrpyy\",\"bandwidthInMbps\":380689806,\"microsoftIPv4Address\":\"nuqqkpikadrgvt\",\"microsoftIPv6Address\":\"gnbuy\",\"facilityIPv4Prefix\":\"ijggmebfsiar\",\"facilityIPv6Prefix\":\"trcvpnazzmh\",\"peeringDBFacilityId\":2024670267,\"peeringDBFacilityLink\":\"mpxttdbhrbnlankx\"}")
                .toObject(ExchangePeeringFacility.class);
        Assertions.assertEquals("hmgkbrpyy", model.exchangeName());
        Assertions.assertEquals(380689806, model.bandwidthInMbps());
        Assertions.assertEquals("nuqqkpikadrgvt", model.microsoftIPv4Address());
        Assertions.assertEquals("gnbuy", model.microsoftIPv6Address());
        Assertions.assertEquals("ijggmebfsiar", model.facilityIPv4Prefix());
        Assertions.assertEquals("trcvpnazzmh", model.facilityIPv6Prefix());
        Assertions.assertEquals(2024670267, model.peeringDBFacilityId());
        Assertions.assertEquals("mpxttdbhrbnlankx", model.peeringDBFacilityLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExchangePeeringFacility model =
            new ExchangePeeringFacility()
                .withExchangeName("hmgkbrpyy")
                .withBandwidthInMbps(380689806)
                .withMicrosoftIPv4Address("nuqqkpikadrgvt")
                .withMicrosoftIPv6Address("gnbuy")
                .withFacilityIPv4Prefix("ijggmebfsiar")
                .withFacilityIPv6Prefix("trcvpnazzmh")
                .withPeeringDBFacilityId(2024670267)
                .withPeeringDBFacilityLink("mpxttdbhrbnlankx");
        model = BinaryData.fromObject(model).toObject(ExchangePeeringFacility.class);
        Assertions.assertEquals("hmgkbrpyy", model.exchangeName());
        Assertions.assertEquals(380689806, model.bandwidthInMbps());
        Assertions.assertEquals("nuqqkpikadrgvt", model.microsoftIPv4Address());
        Assertions.assertEquals("gnbuy", model.microsoftIPv6Address());
        Assertions.assertEquals("ijggmebfsiar", model.facilityIPv4Prefix());
        Assertions.assertEquals("trcvpnazzmh", model.facilityIPv6Prefix());
        Assertions.assertEquals(2024670267, model.peeringDBFacilityId());
        Assertions.assertEquals("mpxttdbhrbnlankx", model.peeringDBFacilityLink());
    }
}