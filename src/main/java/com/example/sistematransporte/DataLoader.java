package com.example.sistematransporte;

import com.example.sistematransporte.model.Grafo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class DataLoader implements CommandLineRunner {
    private final Grafo mapaBrasil;

    public DataLoader(Grafo mapaBrasil){
        this.mapaBrasil = mapaBrasil;
    }

    @Override
    public void run(String... args) throws Exception {
        mapaBrasil.adicionarCapital("Florianópolis","SC");
        mapaBrasil.adicionarCapital("Porto Alegre","RS");
        mapaBrasil.adicionarCapital("Curitiba","PR");
        mapaBrasil.adicionarCapital("São Paulo","SP");
        mapaBrasil.adicionarCapital("Rio de Janeiro","RJ");
        mapaBrasil.adicionarCapital("Vitória","ES");
        mapaBrasil.adicionarCapital("Belo Horizonte","MG");
        mapaBrasil.adicionarCapital("Campo Grande","MS");
        mapaBrasil.adicionarCapital("Cuiabá","MT");
        mapaBrasil.adicionarCapital("Goiânia","GO");
        mapaBrasil.adicionarCapital("Porto Velho","RO");
        mapaBrasil.adicionarCapital("Boa Vista","RR");
        mapaBrasil.adicionarCapital("Manaus","AM");
        mapaBrasil.adicionarCapital("Salvador","BA");
        mapaBrasil.adicionarCapital("Fortaleza","CE");
        mapaBrasil.adicionarCapital("Brasília","DF");
        mapaBrasil.adicionarCapital("São Luís","MA");
        mapaBrasil.adicionarCapital("Macéio","AL");
        mapaBrasil.adicionarCapital("Macapá","AP");
        mapaBrasil.adicionarCapital("Rio Branco","AC");
        mapaBrasil.adicionarCapital("Belém","PA");
        mapaBrasil.adicionarCapital("Recife","PE");
        mapaBrasil.adicionarCapital("Teresina","PI");
        mapaBrasil.adicionarCapital("João Pessoa","PB");
        mapaBrasil.adicionarCapital("Natal","RN");
        mapaBrasil.adicionarCapital("Palmas","TO");
        mapaBrasil.adicionarCapital("Aracaju","SE");


        try (BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/distancias.csv")))){
            String linha;
            br.readLine();

            while((linha = br.readLine()) != null){
                String [] fields = linha.split(",");
                String origem = fields[0];
                String destino = fields[1];
                double distancia = Double.parseDouble(fields[2]);
                mapaBrasil.adicionarRota(origem,destino,distancia);
            }
            System.out.println("Rotas carregadas com sucesso");
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
