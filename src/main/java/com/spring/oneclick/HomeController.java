package com.spring.oneclick;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/ajax")
    public String AgriculturalTechnologyVideo(){
        return "callback";
    }
}
