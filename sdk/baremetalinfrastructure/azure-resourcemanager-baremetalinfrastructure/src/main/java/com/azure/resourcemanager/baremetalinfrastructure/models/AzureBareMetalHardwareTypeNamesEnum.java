// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AzureBareMetalHardwareTypeNamesEnum. */
public final class AzureBareMetalHardwareTypeNamesEnum
    extends ExpandableStringEnum<AzureBareMetalHardwareTypeNamesEnum> {
    /** Static value Cisco_UCS for AzureBareMetalHardwareTypeNamesEnum. */
    public static final AzureBareMetalHardwareTypeNamesEnum CISCO_UCS = fromString("Cisco_UCS");

    /** Static value HPE for AzureBareMetalHardwareTypeNamesEnum. */
    public static final AzureBareMetalHardwareTypeNamesEnum HPE = fromString("HPE");

    /**
     * Creates or finds a AzureBareMetalHardwareTypeNamesEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureBareMetalHardwareTypeNamesEnum.
     */
    @JsonCreator
    public static AzureBareMetalHardwareTypeNamesEnum fromString(String name) {
        return fromString(name, AzureBareMetalHardwareTypeNamesEnum.class);
    }

    /** @return known AzureBareMetalHardwareTypeNamesEnum values. */
    public static Collection<AzureBareMetalHardwareTypeNamesEnum> values() {
        return values(AzureBareMetalHardwareTypeNamesEnum.class);
    }
}