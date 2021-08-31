// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.models.OperationalState;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The role instance properties of the network function. */
@Fluent
public final class RoleInstanceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoleInstanceProperties.class);

    /*
     * The provisioning state of the RoleInstance resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The operational state of the role instance.
     */
    @JsonProperty(value = "operationalState")
    private OperationalState operationalState;

    /**
     * Get the provisioningState property: The provisioning state of the RoleInstance resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the operationalState property: The operational state of the role instance.
     *
     * @return the operationalState value.
     */
    public OperationalState operationalState() {
        return this.operationalState;
    }

    /**
     * Set the operationalState property: The operational state of the role instance.
     *
     * @param operationalState the operationalState value to set.
     * @return the RoleInstanceProperties object itself.
     */
    public RoleInstanceProperties withOperationalState(OperationalState operationalState) {
        this.operationalState = operationalState;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}