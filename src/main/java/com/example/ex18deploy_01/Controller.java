package com.example.ex18deploy_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class Controller {

    @Autowired
    private Environment environment;

    @Value("${CustomVarTree.devName}")
    String myDevName;

    @GetMapping
    public String loadProperty() {
        return myDevName;
    }



}
