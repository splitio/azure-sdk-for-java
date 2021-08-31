// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.AppLogsConfiguration;
import com.azure.resourcemanager.appservice.models.ArcConfiguration;
import com.azure.resourcemanager.appservice.models.KubeEnvironmentProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** KubeEnvironment resource specific properties. */
@Fluent
public final class KubeEnvironmentProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KubeEnvironmentProperties.class);

    /*
     * Provisioning state of the Kubernetes Environment.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KubeEnvironmentProvisioningState provisioningState;

    /*
     * Any errors that occurred during deployment or deployment validation
     */
    @JsonProperty(value = "deploymentErrors", access = JsonProperty.Access.WRITE_ONLY)
    private String deploymentErrors;

    /*
     * Only visible within Vnet/Subnet
     */
    @JsonProperty(value = "internalLoadBalancerEnabled")
    private Boolean internalLoadBalancerEnabled;

    /*
     * Default Domain Name for the cluster
     */
    @JsonProperty(value = "defaultDomain", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultDomain;

    /*
     * Static IP of the KubeEnvironment
     */
    @JsonProperty(value = "staticIp")
    private String staticIp;

    /*
     * Cluster configuration which determines the ARC cluster
     * components types. Eg: Choosing between BuildService kind,
     * FrontEnd Service ArtifactsStorageType etc.
     */
    @JsonProperty(value = "arcConfiguration")
    private ArcConfiguration arcConfiguration;

    /*
     * Cluster configuration which enables the log daemon to export
     * app logs to a destination. Currently only "log-analytics" is
     * supported
     */
    @JsonProperty(value = "appLogsConfiguration")
    private AppLogsConfiguration appLogsConfiguration;

    /*
     * The aksResourceID property.
     */
    @JsonProperty(value = "aksResourceID")
    private String aksResourceId;

    /**
     * Get the provisioningState property: Provisioning state of the Kubernetes Environment.
     *
     * @return the provisioningState value.
     */
    public KubeEnvironmentProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentErrors property: Any errors that occurred during deployment or deployment validation.
     *
     * @return the deploymentErrors value.
     */
    public String deploymentErrors() {
        return this.deploymentErrors;
    }

    /**
     * Get the internalLoadBalancerEnabled property: Only visible within Vnet/Subnet.
     *
     * @return the internalLoadBalancerEnabled value.
     */
    public Boolean internalLoadBalancerEnabled() {
        return this.internalLoadBalancerEnabled;
    }

    /**
     * Set the internalLoadBalancerEnabled property: Only visible within Vnet/Subnet.
     *
     * @param internalLoadBalancerEnabled the internalLoadBalancerEnabled value to set.
     * @return the KubeEnvironmentProperties object itself.
     */
    public KubeEnvironmentProperties withInternalLoadBalancerEnabled(Boolean internalLoadBalancerEnabled) {
        this.internalLoadBalancerEnabled = internalLoadBalancerEnabled;
        return this;
    }

    /**
     * Get the defaultDomain property: Default Domain Name for the cluster.
     *
     * @return the defaultDomain value.
     */
    public String defaultDomain() {
        return this.defaultDomain;
    }

    /**
     * Get the staticIp property: Static IP of the KubeEnvironment.
     *
     * @return the staticIp value.
     */
    public String staticIp() {
        return this.staticIp;
    }

    /**
     * Set the staticIp property: Static IP of the KubeEnvironment.
     *
     * @param staticIp the staticIp value to set.
     * @return the KubeEnvironmentProperties object itself.
     */
    public KubeEnvironmentProperties withStaticIp(String staticIp) {
        this.staticIp = staticIp;
        return this;
    }

    /**
     * Get the arcConfiguration property: Cluster configuration which determines the ARC cluster components types. Eg:
     * Choosing between BuildService kind, FrontEnd Service ArtifactsStorageType etc.
     *
     * @return the arcConfiguration value.
     */
    public ArcConfiguration arcConfiguration() {
        return this.arcConfiguration;
    }

    /**
     * Set the arcConfiguration property: Cluster configuration which determines the ARC cluster components types. Eg:
     * Choosing between BuildService kind, FrontEnd Service ArtifactsStorageType etc.
     *
     * @param arcConfiguration the arcConfiguration value to set.
     * @return the KubeEnvironmentProperties object itself.
     */
    public KubeEnvironmentProperties withArcConfiguration(ArcConfiguration arcConfiguration) {
        this.arcConfiguration = arcConfiguration;
        return this;
    }

    /**
     * Get the appLogsConfiguration property: Cluster configuration which enables the log daemon to export app logs to a
     * destination. Currently only "log-analytics" is supported.
     *
     * @return the appLogsConfiguration value.
     */
    public AppLogsConfiguration appLogsConfiguration() {
        return this.appLogsConfiguration;
    }

    /**
     * Set the appLogsConfiguration property: Cluster configuration which enables the log daemon to export app logs to a
     * destination. Currently only "log-analytics" is supported.
     *
     * @param appLogsConfiguration the appLogsConfiguration value to set.
     * @return the KubeEnvironmentProperties object itself.
     */
    public KubeEnvironmentProperties withAppLogsConfiguration(AppLogsConfiguration appLogsConfiguration) {
        this.appLogsConfiguration = appLogsConfiguration;
        return this;
    }

    /**
     * Get the aksResourceId property: The aksResourceID property.
     *
     * @return the aksResourceId value.
     */
    public String aksResourceId() {
        return this.aksResourceId;
    }

    /**
     * Set the aksResourceId property: The aksResourceID property.
     *
     * @param aksResourceId the aksResourceId value to set.
     * @return the KubeEnvironmentProperties object itself.
     */
    public KubeEnvironmentProperties withAksResourceId(String aksResourceId) {
        this.aksResourceId = aksResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (arcConfiguration() != null) {
            arcConfiguration().validate();
        }
        if (appLogsConfiguration() != null) {
            appLogsConfiguration().validate();
        }
    }
}