package org.challenge.endpointsoap.soap.baseclass;


import java.util.List;

/**
 * Base class to generate .wsdl
 */
@lombok.Data
public class PokemonRequestSoap {
    private List<Ability> abilities;
    private long baseExperience;
    private List<Object> heldItems;
    private long id;
    private String name;
    private String locationAreaEncounters;
}
