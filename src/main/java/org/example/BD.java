package org.example;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Pessoa> pessoas = new HashMap<>();

    public static Pessoa getPessoa(Integer id) {
        return pessoas.get(id);
    }

    public static void addPessoa(Pessoa pessoa) {
        pessoas.put(pessoa.getId(), pessoa);
    }
}
