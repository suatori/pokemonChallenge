package com.challenge.endpointsoap.api.restful.request2;

import java.util.Map;

@lombok.Data
public class Versions {
    private GenerationI generationI;
    private GenerationIi generationIi;
    private GenerationIii generationIii;
    private GenerationIv generationIv;
    private GenerationV generationV;
    private Map<String, Home> generationVi;
    private GenerationVii generationVii;
    private GenerationViii generationViii;
}