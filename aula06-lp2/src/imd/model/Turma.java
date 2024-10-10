package imd.model;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<Aluno>();
    }

    public void inserirAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno inserido com sucesso!");
    }

    public double calcularMedia() {
        double mediaTurma = 0;
        for (Aluno aluno : alunos) {
            mediaTurma += aluno.calcularMedia();
        }
        return mediaTurma / alunos.size();
    }
}
