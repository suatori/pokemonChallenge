package com.challenge.endpointsoap.api.restful.request3;

import java.util.List;

@lombok.Data
public class VersionDetail {
    private List<EncounterDetail> encounterDetails;
    private long maxChance;
    private LocationArea version;
}
