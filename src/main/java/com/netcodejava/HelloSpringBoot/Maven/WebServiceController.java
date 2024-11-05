package com.netcodejava.HelloSpringBoot.Maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WebServiceController {
    
    @GetMapping("/rest")
    public String takeRest(){
        return "Rest is not needed";
    }
    
}
