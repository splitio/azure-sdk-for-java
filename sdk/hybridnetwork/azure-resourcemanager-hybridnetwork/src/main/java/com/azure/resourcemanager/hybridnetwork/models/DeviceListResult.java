// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.fluent.models.DeviceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for devices API service call. */
@Fluent
public final class DeviceListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeviceListResult.class);

    /*
     * A list of devices.
     */
    @JsonProperty(value = "value")
    private List<DeviceInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of devices.
     *
     * @return the value value.
     */
    public List<DeviceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of devices.
     *
     * @param value the value value to set.
     * @return the DeviceListResult object itself.
     */
    public DeviceListResult withValue(List<DeviceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}