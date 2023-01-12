// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.attestation.models.JsonWebKey;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JsonWebKeyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JsonWebKey model =
            BinaryData
                .fromString(
                    "{\"alg\":\"fwnfnb\",\"crv\":\"fionl\",\"d\":\"x\",\"dp\":\"qgtz\",\"dq\":\"pnqbqqwxrjfe\",\"e\":\"lnwsubisn\",\"k\":\"mpmngnzscxaqwoo\",\"kid\":\"cbonqvpk\",\"kty\":\"lrxnjeaseiphe\",\"n\":\"lokeyy\",\"p\":\"nj\",\"q\":\"lwtgrhpdj\",\"qi\":\"umasxazjpq\",\"use\":\"gual\",\"x\":\"xxhejjzzvd\",\"x5c\":[\"wdslfhotwmcy\",\"pwlbjnpg\",\"cftadeh\"],\"y\":\"ltyfsop\"}")
                .toObject(JsonWebKey.class);
        Assertions.assertEquals("fwnfnb", model.alg());
        Assertions.assertEquals("fionl", model.crv());
        Assertions.assertEquals("x", model.d());
        Assertions.assertEquals("qgtz", model.dp());
        Assertions.assertEquals("pnqbqqwxrjfe", model.dq());
        Assertions.assertEquals("lnwsubisn", model.e());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.k());
        Assertions.assertEquals("cbonqvpk", model.kid());
        Assertions.assertEquals("lrxnjeaseiphe", model.kty());
        Assertions.assertEquals("lokeyy", model.n());
        Assertions.assertEquals("nj", model.p());
        Assertions.assertEquals("lwtgrhpdj", model.q());
        Assertions.assertEquals("umasxazjpq", model.qi());
        Assertions.assertEquals("gual", model.use());
        Assertions.assertEquals("xxhejjzzvd", model.x());
        Assertions.assertEquals("wdslfhotwmcy", model.x5C().get(0));
        Assertions.assertEquals("ltyfsop", model.y());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JsonWebKey model =
            new JsonWebKey()
                .withAlg("fwnfnb")
                .withCrv("fionl")
                .withD("x")
                .withDp("qgtz")
                .withDq("pnqbqqwxrjfe")
                .withE("lnwsubisn")
                .withK("mpmngnzscxaqwoo")
                .withKid("cbonqvpk")
                .withKty("lrxnjeaseiphe")
                .withN("lokeyy")
                .withP("nj")
                .withQ("lwtgrhpdj")
                .withQi("umasxazjpq")
                .withUse("gual")
                .withX("xxhejjzzvd")
                .withX5C(Arrays.asList("wdslfhotwmcy", "pwlbjnpg", "cftadeh"))
                .withY("ltyfsop");
        model = BinaryData.fromObject(model).toObject(JsonWebKey.class);
        Assertions.assertEquals("fwnfnb", model.alg());
        Assertions.assertEquals("fionl", model.crv());
        Assertions.assertEquals("x", model.d());
        Assertions.assertEquals("qgtz", model.dp());
        Assertions.assertEquals("pnqbqqwxrjfe", model.dq());
        Assertions.assertEquals("lnwsubisn", model.e());
        Assertions.assertEquals("mpmngnzscxaqwoo", model.k());
        Assertions.assertEquals("cbonqvpk", model.kid());
        Assertions.assertEquals("lrxnjeaseiphe", model.kty());
        Assertions.assertEquals("lokeyy", model.n());
        Assertions.assertEquals("nj", model.p());
        Assertions.assertEquals("lwtgrhpdj", model.q());
        Assertions.assertEquals("umasxazjpq", model.qi());
        Assertions.assertEquals("gual", model.use());
        Assertions.assertEquals("xxhejjzzvd", model.x());
        Assertions.assertEquals("wdslfhotwmcy", model.x5C().get(0));
        Assertions.assertEquals("ltyfsop", model.y());
    }
}