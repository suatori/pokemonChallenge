package com.challenge.endpointsoap.api.restful.request2;

import java.util.List;

@lombok.Data
public class Move {
    private Species move;
    private List<VersionGroupDetail> versionGroupDetails;
}

