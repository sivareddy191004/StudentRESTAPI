package com.example.StudentRESTAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    
    @RequestMapping("/greet")
    public static String greet(){
        return "this is spring project";
    }
}
