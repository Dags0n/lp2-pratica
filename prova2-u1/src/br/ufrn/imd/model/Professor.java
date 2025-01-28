package br.ufrn.imd.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Professor {
    private String nome;
    private String matricula;
    private Date dataNascimento;
    private double salario;
    private String nivelEscolaridade;
    private String disciplina;

    public Professor() {}

    public Professor(String nome, String matricula, Date dataNascimento, double salario, String nivelEscolaridade, String disciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.nivelEscolaridade = nivelEscolaridade;
        this.disciplina = disciplina;
    }

    public abstract double calcularSalario();

    public int lecionarTurmas() {
        return switch (nivelEscolaridade) {
            case "Doutorado" -> 1;
            case "Mestrado" -> 2;
            default -> 3;
        };
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getDataNascimentoFormatada() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        return formato.format(dataNascimento);
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(String nivelEscolaridade) {
        this.nivelEscolaridade = nivelEscolaridade;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
