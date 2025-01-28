package br.ufrn.imd.model;

import java.time.LocalDate;

public class Tigre extends Animal {
    private String tipoTigre;

    public Tigre(String nome, LocalDate dataNascimento, double peso, String tipoTigre) {
        super(nome, dataNascimento, peso, "Carnívoro");
        this.tipoTigre = tipoTigre;
    }

    @Override
    public double calcularAlimentoDiario() {
        return peso * 0.04;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Tigre: " + tipoTigre + "\n";
    }
}
