package br.ufrn.imd.dao;

import br.ufrn.imd.model.Professor;
import br.ufrn.imd.model.ProfessorHorista;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Repositorio {
    private List<Professor> professores = new ArrayList<>();

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        professores.remove(professor);
    }

    public void listarProfessores() {
        System.out.println("********************** Professores ***********************************");
        for (Professor p : professores) {
            System.out.println("Nome: " + p.getNome() + "    Disciplina: " + p.getDisciplina() + "    Turmas: " + p.lecionarTurmas());
        }
        System.out.println("**********************************************************************\n");
    }

    public Professor professorMaiorSalario() {
        Professor maior = null;
        for (Professor p : professores) {
            if (maior == null || p.calcularSalario() > maior.calcularSalario()) {
                maior = p;
            }
        }
        return maior;
    }

    public Professor professorMaisJovem() {
        Professor maisJovem = null;
        for (Professor p : professores) {
            if (maisJovem == null || p.getDataNascimento().after(maisJovem.getDataNascimento())) {
                maisJovem = p;
            }
        }
        return maisJovem;
    }

    public double totalSalarios() {
        double total = 0;
        for (Professor p : professores) {
            total += p.calcularSalario();
        }
        return total;
    }

    public double mediaHorasTrabalhadas() {
        int totalHoras = 0;
        int count = 0;
        for (Professor p : professores) {
            if (p instanceof ProfessorHorista) {
                totalHoras += ((ProfessorHorista) p).getHorasTrabalhadas();
                count++;
            }
        }
        return count > 0 ? (double) totalHoras / count : 0;
    }

    public List<Professor> professoresPortOuMat() {
        List<Professor> professoresPortOuMat = new ArrayList<>();
        for (Professor p : professores) {
            if (Objects.equals(p.getDisciplina(), "Portugues") || Objects.equals(p.getDisciplina(), "Matematica")) {
                professoresPortOuMat.add(p);
            }
        }
        return professoresPortOuMat;
    }

    public List<Professor> professoresComMestradoOuDoutorado() {
        List<Professor> professoresComMestradoOuDoutorado = new ArrayList<>();
        for (Professor p : professores) {
            if (Objects.equals(p.getNivelEscolaridade(), "Mestrado") || Objects.equals(p.getNivelEscolaridade(), "Doutorado")) {
                professoresComMestradoOuDoutorado.add(p);
            }
        }
        return professoresComMestradoOuDoutorado;
    }
}
