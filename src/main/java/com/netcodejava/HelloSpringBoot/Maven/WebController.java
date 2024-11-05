package com.netcodejava.HelloSpringBoot.Maven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("Saying Hello...");
        return "hello";
    }
}
