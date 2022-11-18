package com.challenge.endpointsoap.endpoint;


import com.challenge.endpointsoap.api.soap.baseclass.*;
import com.challenge.endpointsoap.mapper.MapperPokemon;
import com.challenge.endpointsoap.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.transport.context.TransportContextHolder;

@Endpoint
public class PokemonEndpoint {
    private static final String NAMESPACE_URI = "http://baseclass.soap.api.endpointsoap.challenge.com";
    @Autowired
    private MapperPokemon mapperPokemon;

    @Autowired
    private LogService logService;
    private final ObjectFactory objectFactory = new ObjectFactory();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAbilities")
    @ResponsePayload
    public GetAbilitiesResponse getAbilities(@RequestPayload GetAbilities request) {
        logService.logRequest(TransportContextHolder.getTransportContext(),
                request.getClass().getSimpleName());

        var response = objectFactory.createGetAbilitiesResponse();
        response.getReturn().addAll(mapperPokemon.toRequestAbility(request.getArgs0().getValue()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getHeldItems")
    @ResponsePayload
    public GetHeldItemsResponse getHeldItems(@RequestPayload GetHeldItems request) {
        logService.logRequest(TransportContextHolder.getTransportContext(), request.getClass().getSimpleName());

        var response = objectFactory.createGetHeldItemsResponse();
        response.getReturn().addAll(mapperPokemon.toRequestHeldItems(request.getArgs0().getValue()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getLocationAreaEncounters")
    @ResponsePayload
    public GetLocationAreaEncountersResponse getLocationAreaEncounters(@RequestPayload GetLocationAreaEncounters request) {
        logService.logRequest(TransportContextHolder.getTransportContext(), request.getClass().getSimpleName());

        var response = objectFactory.createGetLocationAreaEncountersResponse();
        response.getReturn().addAll(mapperPokemon.toRequestLocationAreaEncounters(request.getArgs0().getValue()));
        return response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBaseExperience")
    @ResponsePayload
    public GetBaseExperienceResponse getBaseExperience(@RequestPayload GetBaseExperience request) {
        logService.logRequest(TransportContextHolder.getTransportContext(), request.getClass().getSimpleName());

        var response = objectFactory.createGetBaseExperienceResponse();
        response.setReturn(mapperPokemon.toRequestBaseExperience(request.getArgs0().getValue()));
        return response;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getNamePokemon")
    @ResponsePayload
    public GetNamePokemonResponse getNamePokemon(@RequestPayload GetNamePokemon request) {
        logService.logRequest(TransportContextHolder.getTransportContext(), request.getClass().getSimpleName());

        var response = objectFactory.createGetNamePokemonResponse();
        response.setReturn(mapperPokemon.toRequestNamePokemon(request.getArgs0().getValue()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getId")
    @ResponsePayload
    public GetIdResponse getId(@RequestPayload GetId request) {
        logService.logRequest(TransportContextHolder.getTransportContext(), request.getClass().getSimpleName());

        var response = objectFactory.createGetIdResponse();
        response.setReturn(mapperPokemon.toRequestId(request.getArgs0().getValue()));
        return response;
    }
}
