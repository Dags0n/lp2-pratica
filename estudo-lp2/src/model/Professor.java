package model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private String tipo;
    private List<Aluno> alunos;

    public Professor(String matricula, String nome, String tipo) {
        super(matricula, nome);
        this.tipo = tipo;
        alunos = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getAlunosNome(Aluno aluno) {
        return aluno.getNome();
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    @Override
    public String toString() {
        return super.toString() + "   Tipo.: " + getClass() + " [" + tipo + "]";
    }
}
