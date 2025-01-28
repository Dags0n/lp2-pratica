package br.ufrn.imd.model;

import java.util.Date;

public class Mulher extends Pessoa {

    public Mulher(String nome, Date dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public String calcularIMC() {
        double imc = peso / (altura * altura);
        String classificacao;
        if (imc < 19) {
            classificacao = "abaixo do peso ideal";
        } else if (imc <= 25.8) {
            classificacao = "peso ideal";
        } else {
            classificacao = "acima do peso ideal";
        }
        return String.format("IMC: %.2f - %s", imc, classificacao);
    }
}
