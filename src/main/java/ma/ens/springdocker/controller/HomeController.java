package ma.ens.springdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return " Application Spring Boot avec Docker fonctionne correctement !";
    }

    @GetMapping("/hello")
    public String hello() {
        return " Bonjour Abla ! Ton conteneur Docker tourne parfaitement.";
    }
}
