package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PessoaProxyTest {
    @BeforeEach
    void setUp() {
        BD.addPessoa(new Pessoa(1, "João", "São Paulo", "SP", "Brasil", 1000.0f, 100.0f));
        BD.addPessoa(new Pessoa(2, "Marco", "Juiz de Fora", "MG", "Brasil", 500.0f, 20.0f));
    }

    @Test
    void deveRetornarDadosPessoais() {
        PessoaProxy pessoa = new PessoaProxy(1);
        assertEquals(Arrays.asList("João", "São Paulo", "SP", "Brasil"), pessoa.obterDadosPessoais());
    }

    @Test
    void deveRetornarPontosDeViagem() {
        Passageiro passageiro = new Passageiro("Eduardo", true);
        PessoaProxy pessoa = new PessoaProxy(2);

        assertEquals(Arrays.asList(500.0f, 20.0f), pessoa.obterPontosDeViagem(passageiro));
    }

    @Test
    void deveLancarExcecaoAoTentarAcessarPontosDeViagem() {
        try {
            Passageiro passageiro = new Passageiro("Breno", false);
            PessoaProxy pessoa = new PessoaProxy(2);

            pessoa.obterPontosDeViagem(passageiro);
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Apenas comissários podem acessar os pontos de viagem de outra pessoa.", e.getMessage());
        }
    }
}