package org.example;

public class Passageiro {
    private String nome;
    private boolean comissario;

    public Passageiro(String nome, boolean comissario) {
        this.nome = nome;
        this.comissario = comissario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isComissario() {
        return comissario;
    }

    public void setComissario(boolean comissario) {
        this.comissario = comissario;
    }
}
