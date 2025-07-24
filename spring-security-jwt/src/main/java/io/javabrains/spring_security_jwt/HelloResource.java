package io.javabrains.spring_security_jwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResource {

    @RequestMapping({"/hello"})
    public String hello() {
        return "Hello world...";
    }

}
