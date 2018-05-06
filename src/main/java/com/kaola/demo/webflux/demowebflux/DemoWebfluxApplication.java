package com.kaola.demo.webflux.demowebflux;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kaola.demo.webflux.demowebflux.handler.EchoHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@SpringBootApplication
public class DemoWebfluxApplication {


    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction(EchoHandler echoHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/echo"), echoHandler::echo);

    }
    public static void main(String[] args) {
        SpringApplication.run(DemoWebfluxApplication.class, args);
    }
}
