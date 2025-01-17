// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.models.ProvisioningState;
import com.azure.resourcemanager.labservices.models.RecurrencePattern;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schedule resource properties. */
@Fluent
public final class ScheduleProperties extends ScheduleUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScheduleProperties.class);

    /*
     * Current provisioning state of the schedule.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the provisioningState property: Current provisioning state of the schedule.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withStartAt(OffsetDateTime startAt) {
        super.withStartAt(startAt);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withStopAt(OffsetDateTime stopAt) {
        super.withStopAt(stopAt);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withRecurrencePattern(RecurrencePattern recurrencePattern) {
        super.withRecurrencePattern(recurrencePattern);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withTimeZoneId(String timeZoneId) {
        super.withTimeZoneId(timeZoneId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ScheduleProperties withNotes(String notes) {
        super.withNotes(notes);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
