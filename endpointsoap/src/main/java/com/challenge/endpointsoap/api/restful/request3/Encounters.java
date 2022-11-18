package com.challenge.endpointsoap.api.restful.request3;

import java.util.List;

@lombok.Data

public class Encounters {
    private LocationArea locationArea;
    private List<VersionDetail> versionDetails;
}
