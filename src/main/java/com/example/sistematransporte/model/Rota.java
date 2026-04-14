package com.example.sistematransporte.model;

public class Rota {

    private Capital destino;
    private Double distancia;
    private Capital origem;

    public Rota(){

    }

    public Rota(Capital origem, Double distancia, Capital destino) {
        this.origem = origem;
        this.distancia = distancia;
        this.destino = destino;
    }

    public Capital getDestino() {
        return destino;
    }

    public void setDestino(Capital destino) {
        this.destino = destino;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Capital getOrigem() {
        return origem;
    }

    public void setOrigem(Capital origem) {
        this.origem = origem;
    }
}
