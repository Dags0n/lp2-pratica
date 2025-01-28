package br.ufrn.imd.model;

import java.util.Date;

public class ProfessorHorista extends Professor {
    private int horasTrabalhadas;
    private static final double VALOR_HORA = 55.0;

    public ProfessorHorista() {}

    public ProfessorHorista(String nome, String matricula, Date dataNascimento, double salario, String nivelEscolaridade, String disciplina, int horasTrabalhadas) {
        super(nome, matricula, dataNascimento, salario, nivelEscolaridade, disciplina);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * VALOR_HORA;
    }

    @Override
    public int lecionarTurmas() {
        return 4;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
