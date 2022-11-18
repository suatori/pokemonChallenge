package com.challenge.endpointsoap.api.restful.request2;

@lombok.Data
public class Sprites {
    private String backDefault;
    private Object backFemale;
    private String backShiny;
    private Object backShinyFemale;
    private String frontDefault;
    private Object frontFemale;
    private String frontShiny;
    private Object frontShinyFemale;
    private Other other;
    private Versions versions;
    private Sprites animated;
}