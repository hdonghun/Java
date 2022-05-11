package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class ApiController {

    //text
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }
    //JSON
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }

    //ResponseEntity
    //응답에 대한 반응변경
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }  // 응답이 201로 온다.
}
