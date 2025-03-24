package cs.tariq.SpringApp1.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String welcome(){
        return sayAbout();
    }
    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to my REST API";
    }

    @GetMapping("/about")
    public String sayAbout(){
        return "Welcome to my REST API.  Developed by Tariq (4th March 2025)";
    }

}
