package com.example.htmlogcss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller

public class Controllers {

    @GetMapping("/h")
    public String indeks(){
        return "first-html-css";
    }
}
