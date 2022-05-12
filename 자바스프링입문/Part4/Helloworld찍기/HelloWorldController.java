package com.fastcampus.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //rest API에 요청을 받도록
public class HelloWorldController {

    @GetMapping("/hello-world") //http메서드를 get으로 받는다는것을 알려줌. //괄호()안에는 url path임
    public String helloWorld(){
        return "hello-world";

    }
}
