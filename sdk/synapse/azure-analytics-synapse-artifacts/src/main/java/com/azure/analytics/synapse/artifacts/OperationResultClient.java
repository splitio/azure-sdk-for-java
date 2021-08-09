// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.OperationResultsImpl;
import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class OperationResultClient {
    private final OperationResultsImpl serviceClient;

    /**
     * Initializes an instance of OperationResults client.
     *
     * @param serviceClient the service client implementation.
     */
    OperationResultClient(OperationResultsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Get operation result.
     *
     * @param operationId Operation ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void get(String operationId) {
        this.serviceClient.get(operationId);
    }

    /**
     * Get operation result.
     *
     * @param operationId Operation ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getWithResponse(String operationId, Context context) {
        return this.serviceClient.getWithResponse(operationId, context);
    }
}