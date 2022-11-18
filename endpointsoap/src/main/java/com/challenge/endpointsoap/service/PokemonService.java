package com.challenge.endpointsoap.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    public static PokemonClient pokemonClient(String baseUri) {
        return pokemonClient(baseUri, Logger.Level.FULL);
    }

    public static PokemonClient pokemonClient(String baseUri, Logger.Level loggerLevel) {
        var mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        return Feign.builder()
                .logger(new Slf4jLogger())
                .logLevel(loggerLevel)
                .dismiss404()
                .encoder(new JacksonEncoder(mapper))
                .decoder(new JacksonDecoder(mapper))
                .target(PokemonClient.class, baseUri);
    }
}
