package com.challenge.endpointsoap.config.properties;


import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Getter
@ConstructorBinding
@ConfigurationProperties(prefix = "com.challenge.endpointsoap")
public class AppProperties {

    private String host;

    private String namespace_uri;

    public AppProperties(@DefaultValue("http://localhost")  String host, @DefaultValue("http://localhost")  String namespace_uri) {
        this.host = host;
        this.namespace_uri = namespace_uri;
    }
}