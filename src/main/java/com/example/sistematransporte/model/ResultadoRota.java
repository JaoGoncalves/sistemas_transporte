package com.example.sistematransporte.model;

import java.util.List;

public class ResultadoRota {
    private List<Capital> caminho;
    private Double distanciaTotal;
    private Double custoTotal;

    public ResultadoRota(){}

    public ResultadoRota(List<Capital> caminho, double distanciaTotal,double custoTotal){
        this.caminho = caminho;
        this.distanciaTotal = distanciaTotal;
        this.custoTotal = custoTotal;
    }

    public List<Capital> getCaminho() {
        return caminho;
    }

    public Double getDistanciaTotal() {
        return distanciaTotal;
    }


    public Double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(Double custoTotal) {
        this.custoTotal = custoTotal;
    }
}
