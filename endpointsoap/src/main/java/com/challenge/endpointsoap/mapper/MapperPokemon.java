package com.challenge.endpointsoap.mapper;


import com.challenge.endpointsoap.api.restful.request2.CharactersPokemon;
import com.challenge.endpointsoap.api.restful.request2.xsd.Ability;
import com.challenge.endpointsoap.api.restful.request2.xsd.HeldItem;
import com.challenge.endpointsoap.api.restful.request2.xsd.ObjectFactory;
import com.challenge.endpointsoap.config.properties.AppProperties;
import com.challenge.endpointsoap.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapperPokemon {


    @Autowired
    private AppProperties appProperties;
    private ObjectFactory objectFactory;

    private com.challenge.endpointsoap.api.soap.baseclass.ObjectFactory objectFactoryBaseClass;


    public MapperPokemon(AppProperties appProperties) {
        this.appProperties = appProperties;
        this.objectFactory = new ObjectFactory();
    }

    public List<Ability> toRequestAbility(String pokemonName) {
        var pokemonClient = PokemonService.pokemonClient(appProperties.getHost());
        CharactersPokemon charactersPokemon = pokemonClient.getPokemon(pokemonName);

        return charactersPokemon.getAbilities().stream().map(
                pokemonAbility -> {
                    var ability = objectFactory.createAbility();
                    var species = objectFactory.createSpecies();
                    var innerAbility = objectFactory.createAbilityAbility(species);
                    var speciesName = objectFactory.createSpeciesName(pokemonAbility.getAbility().getName());
                    species.setName(speciesName);
                    ability.setAbility(innerAbility);
                    return ability;
                }
        ).collect(Collectors.toList());
    }

    public List<String> toRequestLocationAreaEncounters(String pokemonName) {
        var pokemonClient = PokemonService.pokemonClient(appProperties.getHost());
        var encounterDetail = pokemonClient.getEncounters(pokemonName);

        return encounterDetail.stream().map(encounters -> {
            return encounters.getLocationArea().getName();
        }).collect(Collectors.toList());
    }


    public List<HeldItem> toRequestHeldItems(String pokemonName) {
        var pokemonClient = PokemonService.pokemonClient(appProperties.getHost());
        CharactersPokemon charactersPokemon = pokemonClient.getPokemon(pokemonName);

        return charactersPokemon.getHeldItems().stream().map(
                pokemonHeldItems -> {
                    var heldItem = new HeldItem();
                    var species = objectFactory.createSpecies();
                    var innerAbility = objectFactory.createAbilityAbility(species);
                    var speciesName = objectFactory.createSpeciesName(pokemonHeldItems.getItem().getName());
                    species.setName(speciesName);
                    heldItem.setItem(innerAbility);
                    return heldItem;
                }
        ).collect(Collectors.toList());
    }

    public long toRequestBaseExperience(String pokemonName) {
        var pokemonClient = PokemonService.pokemonClient(appProperties.getHost());
        CharactersPokemon charactersPokemon = pokemonClient.getPokemon(pokemonName);
        return charactersPokemon.getBaseExperience();
    }

    public String toRequestNamePokemon(String pokemonName) {
        var pokemonClient = PokemonService.pokemonClient(appProperties.getHost());
        CharactersPokemon charactersPokemon = pokemonClient.getPokemon(pokemonName);
        return charactersPokemon.getName();
    }

    public long toRequestId(String pokemonName) {
        var pokemonClient = PokemonService.pokemonClient(appProperties.getHost());
        CharactersPokemon charactersPokemon = pokemonClient.getPokemon(pokemonName);
        return charactersPokemon.getId();
    }
}
