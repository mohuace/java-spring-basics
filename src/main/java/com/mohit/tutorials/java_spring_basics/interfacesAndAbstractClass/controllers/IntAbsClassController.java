package com.mohit.tutorials.java_spring_basics.interfacesAndAbstractClass.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntAbsClassController {

    @GetMapping(value = "/intAbs")
    public String getValue() {
        return "hello";
    }
}
