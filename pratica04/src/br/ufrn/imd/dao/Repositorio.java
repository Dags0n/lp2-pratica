package br.ufrn.imd.dao;

import br.ufrn.imd.model.*;
import java.util.ArrayList;

public class Repositorio {
    private ArrayList<Pessoa> pessoas;

    public Repositorio() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("------------------------------------------------------------------");
            System.out.println(pessoa);
            System.out.println(pessoa.calcularIMC());
        }
        System.out.println("------------------------------------------------------------------");
    }
}
