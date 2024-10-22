package view;

import model.*;

public class NatalFitness {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados();

        Gerente gerente = new Gerente("001", "Bernardo", 5000.0);
        Professor professor1 = new Professor("002", "Popeye", "Musculação");
        Professor professor2 = new Professor("003", "Phelps", "Natação");
        Professor professor3 = new Professor( "004", "Arnold", "Musculação");

        bd.addFuncionario(gerente);
        bd.addFuncionario(professor1);
        bd.addFuncionario(professor2);
        bd.addFuncionario(professor3);

        Aluno aluno1 = new Aluno("Neymar", "584.659.745-62", "07/04/1995");
        Aluno aluno2 = new Aluno("Marta", "234.897.954-78", "13/01/1989");
        Aluno aluno3 = new Aluno("Bruninho do Volei", "345.234.954-13", "26/12/1988");

        aluno1.addTreino(new Treino("10:00", "Hipertrofia"));
        aluno1.addTreino(new Treino("11:00", "Ergometria"));
        aluno2.addTreino(new Treino("08:00", "Nado de Costas"));
        aluno2.addTreino(new Treino("09:00", "Nado Livre"));
        aluno3.addTreino(new Treino("11:00", "Hipertrofia"));
        aluno3.addTreino(new Treino("07:00", "Ergometria"));

        professor1.addAluno(aluno1);
        professor2.addAluno(aluno2);
        professor3.addAluno(aluno3);

        bd.addAluno(aluno1);
        bd.addAluno(aluno2);
        bd.addAluno(aluno3);
        bd.addProfessor(professor1);
        bd.addProfessor(professor2);
        bd.addProfessor(professor3);

        bd.gerarRelatorioFuncionarios();
        bd.gerarRelatorioAtividades();
        bd.gerarRelatorioAlunos();
    }
}
