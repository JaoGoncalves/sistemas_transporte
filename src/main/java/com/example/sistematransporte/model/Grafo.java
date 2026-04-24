package com.example.sistematransporte.model;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class Grafo {

    private Map<String, Capital> capitais = new HashMap<>();


    public Grafo(){
    }


    public void adicionarCapital(String name, String uf) {

        Capital cidade = new Capital(name,uf);
        capitais.put(uf,cidade);
    }

    public void adicionarRota(String ufOrigem, String ufDestino, Double distancia) {
        Capital origem = capitais.get(ufOrigem);
        Capital destino = capitais.get(ufDestino);


        if (origem != null && destino != null){
            Rota rotaIda = new Rota(origem,destino,distancia);
            origem.adicionarRota(rotaIda);

            Rota rotaVolta = new Rota(destino,origem,distancia);
            destino.adicionarRota(rotaVolta);
        } else{
            System.out.println("Erro: Uma das capitais não foi cadastrada no mapa!");
        }

    }

    public Map<String, Capital> getCapitais() {
        return capitais;
    }
}
