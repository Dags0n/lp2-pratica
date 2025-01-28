package br.ufrn.imd.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Animal {
    protected String nome;
    protected LocalDate dataNascimento;
    protected double peso;
    protected String tipoAlimentacao;
    protected boolean alimentado;

    public Animal(String nome, LocalDate dataNascimento, double peso, String tipoAlimentacao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.tipoAlimentacao = tipoAlimentacao;
        this.alimentado = false;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public boolean isAlimentado() {
        return alimentado;
    }

    public void setAlimentado(boolean alimentado) {
        this.alimentado = alimentado;
    }

    public abstract double calcularAlimentoDiario();

    public void alimentar() {
        this.alimentado = true;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome: %s, Idade: %d anos, Peso: %.2f kg, Alimentação: %s, Alimentado: %s",
                nome, getIdade(), peso, tipoAlimentacao, alimentado ? "Sim" : "Não"
        );
    }
}
