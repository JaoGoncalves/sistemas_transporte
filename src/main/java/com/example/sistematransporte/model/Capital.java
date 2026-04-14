package com.example.sistematransporte.model;

import java.util.ArrayList;
import java.util.List;

public class Capital {
    private String name;
    private String uf;
    private List <Rota> estradasAdjacentes = new ArrayList<>();

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

    public List<Rota> getEstradasAdjacentes() {
        return estradasAdjacentes;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void adicionarRota(Rota rota){
        this.estradasAdjacentes.add(rota);
    }
}
