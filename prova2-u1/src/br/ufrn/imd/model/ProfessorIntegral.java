package br.ufrn.imd.model;

import java.util.Date;

public class ProfessorIntegral extends Professor {
    private Date dataInicio;

    public ProfessorIntegral() {}

    public ProfessorIntegral(String nome, String matricula, Date dataNascimento, double salario, String nivelEscolaridade, String disciplina, Date dataInicio) {
        super(nome, matricula, dataNascimento, salario, nivelEscolaridade, disciplina);
        this.dataInicio = dataInicio;
    }

    @Override
    public double calcularSalario() {
        return super.getSalario();
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
}
