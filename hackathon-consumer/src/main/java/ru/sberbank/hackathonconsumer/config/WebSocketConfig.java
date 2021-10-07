package ru.sberbank.hackathonconsumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;


@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/arm");
        registry.addEndpoint("/arm").withSockJS();
        registry.addEndpoint("/door");
        registry.addEndpoint("/door").withSockJS();
        registry.addEndpoint("/router");
        registry.addEndpoint("/router").withSockJS();
        registry.addEndpoint("/room");
        registry.addEndpoint("/room").withSockJS();
        registry.addEndpoint("/user");
        registry.addEndpoint("/user").withSockJS();
        registry.addEndpoint("/userEvent");
        registry.addEndpoint("/userEvent").withSockJS();
    }
}
