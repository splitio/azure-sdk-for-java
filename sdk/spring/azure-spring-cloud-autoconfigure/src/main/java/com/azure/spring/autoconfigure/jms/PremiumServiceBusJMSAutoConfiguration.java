// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.autoconfigure.jms;

import com.azure.spring.autoconfigure.unity.AzureProperties;
import com.microsoft.azure.servicebus.jms.ServiceBusJmsConnectionFactory;
import com.microsoft.azure.servicebus.jms.ServiceBusJmsConnectionFactorySettings;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.ConnectionFactory;

import static com.azure.spring.autoconfigure.unity.AzureProperties.AZURE_PROPERTY_BEAN_NAME;
import static com.azure.spring.core.ApplicationId.AZURE_SPRING_SERVICE_BUS;
import static com.azure.spring.core.ApplicationId.VERSION;

/**
 * Automatic configuration class of ServiceBusJMS for Premium Service Bus
 */
@Configuration
@ConditionalOnClass(ServiceBusJmsConnectionFactory.class)
@ConditionalOnResource(resources = "classpath:servicebusjms.enable.config")
@ConditionalOnProperty(value = "spring.jms.servicebus.enabled", matchIfMissing = true)
@ConditionalOnExpression(value = "'${spring.jms.servicebus.pricing-tier}'.equalsIgnoreCase('premium')")
@EnableConfigurationProperties(AzureServiceBusJMSProperties.class)
public class PremiumServiceBusJMSAutoConfiguration extends AbstractServiceBusJMSAutoConfiguration {

    public PremiumServiceBusJMSAutoConfiguration(AzureServiceBusJMSProperties azureServiceBusJMSProperties) {
        super(azureServiceBusJMSProperties);
    }

    @Bean
    @ConditionalOnMissingBean
    public ConnectionFactory jmsConnectionFactory(@Qualifier(AZURE_PROPERTY_BEAN_NAME) AzureProperties azureProperties) {
        String connectionString = azureServiceBusJMSProperties.getConnectionString();
        String clientId = azureServiceBusJMSProperties.getTopicClientId();
        int idleTimeout = azureServiceBusJMSProperties.getIdleTimeout();

        ServiceBusJmsConnectionFactorySettings settings =
            new ServiceBusJmsConnectionFactorySettings(idleTimeout, false);
        settings.setShouldReconnect(false);
        SpringServiceBusJmsConnectionFactory springServiceBusJmsConnectionFactory =
            new SpringServiceBusJmsConnectionFactory(connectionString, settings);
        springServiceBusJmsConnectionFactory.setClientId(clientId);
        springServiceBusJmsConnectionFactory.setCustomUserAgent(AZURE_SPRING_SERVICE_BUS + VERSION);

        return springServiceBusJmsConnectionFactory;
    }

}