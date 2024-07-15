package org.example;

import java.util.List;

public class PessoaProxy implements IPessoa{
    private Pessoa pessoa;

    private Integer id;

    public PessoaProxy(int id) {
        this.pessoa = new Pessoa(id);
    }

    @Override
    public List<String> obterDadosPessoais() {
        if (this.pessoa == null) {
            this.pessoa = new Pessoa(id);
        }

        return this.pessoa.obterDadosPessoais();
    }

    @Override
    public List<Float> obterPontosDeViagem(Passageiro passageiro) {
        if (!passageiro.isComissario()) {
            throw new IllegalArgumentException("Apenas comissários podem acessar os pontos de viagem de outra pessoa.");
        }

        if (this.pessoa == null) {
            this.pessoa = new Pessoa(id);
        }

        return this.pessoa.obterPontosDeViagem(passageiro);
    }
}
