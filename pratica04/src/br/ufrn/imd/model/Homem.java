package br.ufrn.imd.model;

import java.util.Date;

public class Homem extends Pessoa {

    public Homem(String nome, Date dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public String calcularIMC() {
        double imc = peso / (altura * altura);
        String classificacao;
        if (imc < 20.7) {
            classificacao = "abaixo do peso ideal";
        } else if (imc <= 26.4) {
            classificacao = "peso ideal";
        } else {
            classificacao = "acima do peso ideal";
        }
        return String.format("IMC: %.2f - %s", imc, classificacao);
    }
}