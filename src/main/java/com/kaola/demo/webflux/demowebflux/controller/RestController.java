package com.kaola.demo.webflux.demowebflux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RestController {

    @GetMapping("/cache/current")
    @ResponseBody
    public Mono<Map<String,String>> queryCurrent(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dt=simpleDateFormat.format(new Date());
        Map<String,String> map=new HashMap<>();
        map.put("date",dt);
         return Mono.just(map);
    }

}
