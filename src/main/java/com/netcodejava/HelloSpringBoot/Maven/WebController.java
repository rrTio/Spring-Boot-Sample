package com.netcodejava.HelloSpringBoot.Maven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebController {
    
    @RequestMapping("/hello")
    public String sayHello(Model model)
    {
        String welcomeMessage = "Welcome Spring Boot Netbeans";
        System.out.println("Hello Page");
        model.addAttribute("message", welcomeMessage);
        return "hello";
    }
}
