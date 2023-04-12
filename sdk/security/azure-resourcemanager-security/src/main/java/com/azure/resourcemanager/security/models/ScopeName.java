// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The resource scope of the health report. */
public final class ScopeName extends ExpandableStringEnum<ScopeName> {
    /** Static value Connectors for ScopeName. */
    public static final ScopeName CONNECTORS = fromString("Connectors");

    /** Static value Clusters for ScopeName. */
    public static final ScopeName CLUSTERS = fromString("Clusters");

    /** Static value VirtualMachines for ScopeName. */
    public static final ScopeName VIRTUAL_MACHINES = fromString("VirtualMachines");

    /** Static value Unknown for ScopeName. */
    public static final ScopeName UNKNOWN = fromString("Unknown");

    /**
     * Creates a new instance of ScopeName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScopeName() {
    }

    /**
     * Creates or finds a ScopeName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScopeName.
     */
    @JsonCreator
    public static ScopeName fromString(String name) {
        return fromString(name, ScopeName.class);
    }

    /**
     * Gets known ScopeName values.
     *
     * @return known ScopeName values.
     */
    public static Collection<ScopeName> values() {
        return values(ScopeName.class);
    }
}