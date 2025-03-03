package com.example.EjercicioPractico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class SaludoController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/saludo")
    public Mono<String> obtenerSaludo(@RequestParam(name = "lang", defaultValue = "en") String lang) {
        Locale locale = Locale.forLanguageTag(lang);
        return Mono.just(messageSource.getMessage("saludo", null, locale));
    }
}
