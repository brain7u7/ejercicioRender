package com.ejemplo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public Map<String, String> saludo() {
        return Map.of("mensaje", "Hola desde Spring Boot");
    }
}
