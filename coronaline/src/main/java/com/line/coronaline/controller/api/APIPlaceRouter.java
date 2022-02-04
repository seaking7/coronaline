package com.line.coronaline.controller.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

import static org.springframework.web.servlet.function.RouterFunctions.route;

@Configuration
public class APIPlaceRouter {

    @Bean
    public RouterFunction<ServerResponse> placeRouter(){
        return route().GET("/api/places", req -> ServerResponse.ok().body(List.of("place3", "place4")))
                .build();
    }
}
