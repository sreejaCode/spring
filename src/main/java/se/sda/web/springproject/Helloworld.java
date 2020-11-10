package se.sda.web.springproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
    @RequestMapping("/")
    public String Helloworld() {
        return "Hello world1";
    }
}
