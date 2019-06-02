package com.example.apinbp.controller;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.put("curriencies", Arrays.asList("eur", "usd"));
        return "home";
    }

}
