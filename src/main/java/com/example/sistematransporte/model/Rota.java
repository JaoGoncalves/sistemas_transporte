package com.example.sistematransporte.model;

public class Rota {

    private Capital destino;
    private Capital origem;
    private Double distancia;

    public Rota(){

    }

    public Rota(Capital origem,Capital destino,Double distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Capital getDestino() {
        return destino;
    }

    public void setDestino(Capital destino) {
        this.destino = destino;
    }
    public Capital getOrigem() {
        return origem;
    }

    public void setOrigem(Capital origem) {
        this.origem = origem;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
}
