package org.example;

import java.util.List;

public interface IPessoa {
    List<String> obterDadosPessoais();
    List<Float> obterPontosDeViagem(Passageiro passageiro);
}
