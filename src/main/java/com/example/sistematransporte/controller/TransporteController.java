package com.example.sistematransporte.controller;

import com.example.sistematransporte.model.Capital;
import com.example.sistematransporte.model.Grafo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/transporte")
public class TransporteController {
    private final Grafo mapaBrasil;

    public TransporteController(Grafo mapaBrasil){
        this.mapaBrasil = mapaBrasil;
    }

    @GetMapping("/capitais")
    public Collection<Capital> listarCapitais(){
        return mapaBrasil.getCapitais().values();
    }

}
