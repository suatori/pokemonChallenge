package com.challenge.endpointsoap.api.restful.request1;


import lombok.NoArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@NoArgsConstructor
public class Pokemon {
    private long count;
    private String next;
    private Object previous;
    private List<Result> results;
}
