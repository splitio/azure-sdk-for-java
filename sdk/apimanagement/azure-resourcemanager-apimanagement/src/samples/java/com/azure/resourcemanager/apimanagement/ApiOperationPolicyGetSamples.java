// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;

/** Samples for ApiOperationPolicy Get. */
public final class ApiOperationPolicyGetSamples {
    /*
     * operationId: ApiOperationPolicy_Get
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetApiOperationPolicy
     */
    /**
     * Sample code: ApiManagementGetApiOperationPolicy.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetApiOperationPolicy(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiOperationPolicies()
            .getWithResponse(
                "rg1",
                "apimService1",
                "5600b539c53f5b0062040001",
                "5600b53ac53f5b0062080006",
                PolicyIdName.POLICY,
                null,
                Context.NONE);
    }
}