package com.example.oauth_github;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    @GetMapping("/")
    public String Greet(){
        return "Welcome to OAuth demo, login using github";
    }

}
