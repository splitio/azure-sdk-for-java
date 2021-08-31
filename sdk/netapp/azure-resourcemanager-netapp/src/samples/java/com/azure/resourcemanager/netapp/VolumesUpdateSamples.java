// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.models.Volume;

/** Samples for Volumes Update. */
public final class VolumesUpdateSamples {
    /*
     * operationId: Volumes_Update
     * api-version: 2021-06-01
     * x-ms-examples: Volumes_Update
     */
    /**
     * Sample code: Volumes_Update.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesUpdate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        Volume resource =
            manager.volumes().getWithResponse("myRG", "account1", "pool1", "volume1", Context.NONE).getValue();
        resource.update().apply();
    }
}