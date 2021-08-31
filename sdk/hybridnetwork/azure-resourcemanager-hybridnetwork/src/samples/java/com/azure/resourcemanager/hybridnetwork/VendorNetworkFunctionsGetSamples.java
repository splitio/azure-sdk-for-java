// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork;

import com.azure.core.util.Context;

/** Samples for VendorNetworkFunctions Get. */
public final class VendorNetworkFunctionsGetSamples {
    /**
     * Sample code: Get vendor network function sub resource by service key of network function.
     *
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void getVendorNetworkFunctionSubResourceByServiceKeyOfNetworkFunction(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.vendorNetworkFunctions().getWithResponse("eastus", "testVendor", "testServiceKey", Context.NONE);
    }
}