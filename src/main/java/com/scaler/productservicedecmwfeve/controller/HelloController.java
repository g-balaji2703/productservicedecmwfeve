package com.scaler.productservicedecmwfeve.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This class wii have multiple methods
// that will be serving HTTP requests at /Hello
// This class will be service Rest (HTTP) APIS
// localhost:8080/hello
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/say/{name}/{times}")
    public String sayHello(@PathVariable String name,
                           @PathVariable int times){
        String answer = "";

        for (int i=0;i<times;i++){
            answer += "Hello "+name;
            answer += "</br>";
        }
        return answer;
    }
}
