package com.example.sistematransporte.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public class Capital {
    private String name;
    private String uf;
    @JsonIgnore
    private List <Rota> rotasAdjacentes = new ArrayList<>();

    public Capital(){
    }

    public Capital(String name, String uf){
        this.name = name;
        this.uf = uf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Rota> getRotasAdjacentes() {
        return rotasAdjacentes;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void adicionarRota(Rota rota){
        this.rotasAdjacentes.add(rota);
    }
}
