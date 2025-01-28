package br.ufrn.imd.model;

import java.time.LocalDate;

public class Elefante extends Animal {
    private double tamanhoTromba;

    public Elefante(String nome, LocalDate dataNascimento, double peso, double tamanhoTromba) {
        super(nome, dataNascimento, peso, "Herbívoro");
        this.tamanhoTromba = tamanhoTromba;
    }

    @Override
    public double calcularAlimentoDiario() {
        return peso * 0.15;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tamanho da Tromba: " + tamanhoTromba + " m\n";
    }
}
