package br.ufrn.imd.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    protected double peso;
    protected double altura;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Pessoa(String nome, Date dataNascimento, double peso, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract String calcularIMC();

    @Override
    public String toString() {
        return "Nome: " + nome + "\nData de Nascimento: " + sdf.format(dataNascimento) + "\nPeso: " + peso + "\nAltura: " + altura;
    }
}
