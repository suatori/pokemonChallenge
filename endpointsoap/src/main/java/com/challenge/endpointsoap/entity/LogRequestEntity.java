package com.challenge.endpointsoap.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "logservice")
@Getter
@Setter
public class LogRequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 30)
    private String method1;

    @Column(nullable = false, length = 16)
    private String ip;

    @Column(name = "register", columnDefinition = "TIMESTAMP")
    private LocalDateTime register;

}
