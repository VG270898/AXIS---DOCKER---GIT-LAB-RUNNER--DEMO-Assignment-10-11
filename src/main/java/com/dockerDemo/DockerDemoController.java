package com.dockerDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {

    @GetMapping("/home")
    public String welcomePage(){
        return "<h2>Welcome to Docker Deployment</h2>";
    }
}
