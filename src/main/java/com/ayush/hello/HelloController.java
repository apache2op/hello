package com.ayush.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";

    }

    @RequestMapping("/bye")
    public String bye(){
        return "bye world";
    }
    
}
