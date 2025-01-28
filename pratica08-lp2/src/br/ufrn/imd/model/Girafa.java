package br.ufrn.imd.model;

import java.time.LocalDate;

public class Girafa extends Animal {
    private double tamanhoLingua;

    public Girafa(String nome, LocalDate dataNascimento, double peso, double tamanhoLingua) {
        super(nome, dataNascimento, peso, "Herbívoro");
        this.tamanhoLingua = tamanhoLingua;
    }

    @Override
    public double calcularAlimentoDiario() {
        return peso * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamanho da Língua: " + tamanhoLingua + " cm\n";
    }
}
