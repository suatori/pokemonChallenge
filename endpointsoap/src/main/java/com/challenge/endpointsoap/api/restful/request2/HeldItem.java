package com.challenge.endpointsoap.api.restful.request2;

import java.util.List;

@lombok.Data
public class HeldItem {
    private Species item;
    private List<VersionDetail> versionDetails;
}
