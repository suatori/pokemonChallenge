package org.challenge.endpointsoap.soap.baseclass;

import java.util.List;

@lombok.Data
public class HeldItem {
    private Species item;
    private List<VersionDetail> versionDetails;
}
