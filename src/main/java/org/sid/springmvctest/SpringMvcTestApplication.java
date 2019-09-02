package org.sid.springmvctest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringMvcTestApplication {
    @GetMapping("/index")
    public String test(){
        return "index";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringMvcTestApplication.class, args);
    }

}
