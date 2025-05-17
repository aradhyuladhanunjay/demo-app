package com.example.demo_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/helloworld")
public class Hellocontroller {

    //http://localhost:8080/helloworld/gethelloworldmessage
    @GetMapping("/gethelloworldmessage")
    public String hellocontroller(){
        return "Hello World!....";
    }
}
