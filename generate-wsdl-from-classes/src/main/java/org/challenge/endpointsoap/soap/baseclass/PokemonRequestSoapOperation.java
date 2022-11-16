package org.challenge.endpointsoap.soap.baseclass;


import java.util.List;

public abstract class PokemonRequestSoapOperation {

    public abstract List<Ability> getAbilities(String pokemonName);

    public abstract long getBaseExperience(String pokemonName);

    public abstract List<HeldItem> getHeldItems(String pokemonName);

    public abstract long getId(String pokemonName);

    public abstract String getNamePokemon(String pokemonName);

    public abstract String getLocationAreaEncounters(String pokemonName);
}
