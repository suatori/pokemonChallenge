package com.challenge.endpointsoap.service;

import com.challenge.endpointsoap.entity.LogRequestEntity;
import com.challenge.endpointsoap.repository.LogRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.http.HttpServletConnection;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class LogService {

    @Autowired
    LogRequestRepository logRequestRepository;


    public void logRequest(TransportContext transportContext,
                           String methodName) {
        HttpServletConnection connection = (HttpServletConnection) transportContext.getConnection();
        HttpServletRequest request = connection.getHttpServletRequest();
        String ipAddress = request.getRemoteAddr();
        var logRequestEntity = new LogRequestEntity();
        logRequestEntity.setIp(ipAddress);
        logRequestEntity.setMethod1(request.getMethod());


        logRequestEntity.setRegister(LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC));
        logRequestRepository.save(logRequestEntity);
    }
}
