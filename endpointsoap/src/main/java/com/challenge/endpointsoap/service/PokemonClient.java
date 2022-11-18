package com.challenge.endpointsoap.service;

import com.challenge.endpointsoap.api.restful.request2.CharactersPokemon;
import com.challenge.endpointsoap.api.restful.request3.Encounters;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface PokemonClient {


    @RequestLine("GET api/v2/pokemon/{pokemonName}")
    @Headers("Content-Type: application/json")
    CharactersPokemon getPokemon(
            @Param(value = "pokemonName") String pokemonName
    );

    @RequestLine("GET api/v2/pokemon/{pokemonName}/encounters")
    @Headers("Content-Type: application/json")
    List<Encounters> getEncounters(
            @Param(value = "pokemonName") String pokemonName
    );

}

