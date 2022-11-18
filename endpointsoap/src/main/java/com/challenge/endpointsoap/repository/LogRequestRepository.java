package com.challenge.endpointsoap.repository;

import com.challenge.endpointsoap.entity.LogRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRequestRepository extends JpaRepository<LogRequestEntity, Integer> {
}
