package com.example.sistematransporte.service;

import com.example.sistematransporte.model.Grafo;
import org.springframework.stereotype.Service;

@Service
public class TransporteService {

    private final Grafo mapaBrasil;

    public TransporteService(Grafo mapaBrasil){
        this.mapaBrasil = mapaBrasil;
    }

    
}
