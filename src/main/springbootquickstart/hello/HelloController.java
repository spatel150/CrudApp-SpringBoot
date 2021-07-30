package io.javabrains.springbootquickstart.hello;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan("io.javabrains.springbootquickstart.hello")
@RestController
public class HelloController {
    
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
}
