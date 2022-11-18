package com.challenge.endpointsoap.api.restful.request2;

import java.util.List;
import lombok.Data;
@Data
public class CharactersPokemon {
    private List<Ability> abilities;
    private long baseExperience;
    private List<Species> forms;
    private List<GameIndex> gameIndices;
    private long height;
    private List<HeldItem> heldItems;
    private long id;
    private boolean isDefault;
    private String locationAreaEncounters;
    private List<Move> moves;
    private String name;
    private long order;
    private List<Object> pastTypes;
    private Species species;
    private Sprites sprites;
    private List<Stat> stats;
    private List<Type> types;
    private long weight;
}
