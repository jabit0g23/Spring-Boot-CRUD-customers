package com.example.customers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class CustomerController {

    @GetMapping("/prueba")
    public String prueba(){
        return "hola mundo";
    }

    @GetMapping("/prueba2")
    public List<String> prueba2(){
        List<String> list = new ArrayList<>();
        list.add("javier");
        list.add("javier2");
        list.add("javier3");
        return list;
    }

    @GetMapping("/prueba3")
    public Map<String, String> prueba3(){
        Map<String, String> map = new HashMap<>();
        map.put("clave1" , "valor1");
        map.put("clave2" , "valor2");
        map.put("clave3" , "valor3");
        map.put("clave4" , "valor4");
        map.put("clave5" , "valor5");
        return map;
    }
}
