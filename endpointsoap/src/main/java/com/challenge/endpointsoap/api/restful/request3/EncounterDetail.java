package com.challenge.endpointsoap.api.restful.request3;

import java.util.List;

@lombok.Data
public class EncounterDetail {
    private long chance;
    private List<LocationArea> conditionValues;
    private long maxLevel;
    private LocationArea method;
    private long minLevel;
}
