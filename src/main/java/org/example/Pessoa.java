package org.example;

import java.util.Arrays;
import java.util.List;

public class Pessoa implements IPessoa {
    private Integer id;
    private String nome;
    private String cidade;
    private String estado;
    private String pais;
    private Float milhas;
    private Float pontos;

    public Pessoa(int id) {
        this.id = id;
        Pessoa objeto = BD.getPessoa(id);
        this.nome = objeto.nome;
        this.cidade = objeto.cidade;
        this.estado = objeto.estado;
        this.pais = objeto.pais;
        this.milhas = objeto.milhas;
        this.pontos = objeto.pontos;
    }

    public Pessoa(int id, String nome, String cidade, String estado, String pais, Float milhas, Float pontos) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.milhas = milhas;
        this.pontos = pontos;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDadosPessoais() {
        return Arrays.asList(this.nome, this.cidade, this.estado, this.pais);
    }

    @Override
    public List<Float> obterPontosDeViagem(Passageiro passageiro) {
        return Arrays.asList(this.milhas, this.pontos);
    }
}
