package com.example.sistematransporte;

import com.example.sistematransporte.model.Capital;
import com.example.sistematransporte.model.Grafo;
import com.example.sistematransporte.model.Rota;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaTransporteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SistemaTransporteApplication.class, args);

        // Teste do Grafo
        System.out.println("\n--- INICIANDO TESTE DO MOTOR DO GRAFO ---");

        Grafo mapaBrasil = new Grafo();

        mapaBrasil.adicionarCapital("Florianópolis", "SC");
        mapaBrasil.adicionarCapital("Curitiba", "PR");
        mapaBrasil.adicionarCapital("Porto Alegre", "RS");

        mapaBrasil.adicionarRota("SC", "PR", 300.00);
        mapaBrasil.adicionarRota("SC", "RS", 460.00);

        Capital sc = mapaBrasil.getCapitais().get("SC");

        System.out.println("Você está em: " + sc.getName() + " (" + sc.getUf() + ") ");
        System.out.println("Opções de viagem:");

        for (Rota estrada: sc.getRotasAdjacentes() ) {
            System.out.println(" -> Rumo a " + estrada.getDestino().getName() + " percorrendo "+ estrada.getDistancia() + " km.");
        }

        System.out.println("--------------------------------------------------------------\n");
    }

}
