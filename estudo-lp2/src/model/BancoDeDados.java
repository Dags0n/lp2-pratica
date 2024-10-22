package model;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Funcionario> funcionarios;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public BancoDeDados() {
        this.funcionarios = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removeFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void gerarRelatorioFuncionarios() {
        System.out.println("######################### Funcionários ###################################");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
        System.out.println("##########################################################################\n");
    }

    public void gerarRelatorioAtividades() {
        System.out.println("########################## Atividades ####################################");
        for (Professor p : professores) {
            System.out.println("Professor [" + p.getNome() + "]");
            for (Aluno a : alunos) {
                for (Aluno b : p.getAlunos()) {
                    if (a.getNome().equals(p.getAlunosNome(b))) {
                        System.out.print("Aluno >>> " + a.getNome() + " {");
                        List<Treino> treinos = a.getTreinos();
                        boolean primeiro = true;
                        for (Treino t : treinos) {
                            if (!primeiro) {
                                System.out.print(", ");
                            }
                            System.out.print(t);
                            primeiro = false;
                        }
                        System.out.println("}");
                    }
                }
            }
        }
        System.out.println("##########################################################################\n");
    }

    public void gerarRelatorioAlunos() {
        System.out.println("############################ Alunos ######################################");
        for (Aluno a : alunos) {
            System.out.println(a);
        }
        System.out.println("##########################################################################");
    }
}
