// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.Context;

/** Samples for AccountBackups Delete. */
public final class AccountBackupsDeleteSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2021-06-01/examples/Backups_Account_Delete.json
     */
    /**
     * Sample code: AccountBackups_Delete.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void accountBackupsDelete(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.accountBackups().delete("resourceGroup", "accountName", "backupName", Context.NONE);
    }
}