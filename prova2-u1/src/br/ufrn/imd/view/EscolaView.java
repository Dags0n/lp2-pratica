package br.ufrn.imd.view;

import br.ufrn.imd.dao.Repositorio;
import br.ufrn.imd.model.Professor;
import br.ufrn.imd.model.ProfessorHorista;
import br.ufrn.imd.model.ProfessorIntegral;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EscolaView {
    public static void main(String[] args) throws ParseException {
        Repositorio repositorio = new Repositorio();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date dt, dt2;

        ProfessorHorista prof1 = new ProfessorHorista();
        prof1.setMatricula("20150234");
        prof1.setNome("Joao Fernandes Silva");
        dt = formato.parse("16-06-1975");
        prof1.setDataNascimento(dt);
        prof1.setHorasTrabalhadas(200);
        prof1.setSalario(prof1.getHorasTrabalhadas());
        prof1.setDisciplina("Portugues");
        prof1.setNivelEscolaridade("Mestrado");

        ProfessorIntegral prof2 = new ProfessorIntegral();
        dt = formato.parse("05-02-2001");
        prof2.setDataNascimento(dt);
        dt2 = formato.parse("15-10-2019");
        prof2.setDataInicio(dt2);
        prof2.setMatricula("20110001");
        prof2.setNome("Francisco Silva Lopes");
        prof2.setSalario(4800);
        prof2.setDisciplina("Fisica");
        prof2.setNivelEscolaridade("Doutorado");

        ProfessorHorista prof3 = new ProfessorHorista();
        dt = formato.parse("05-03-1999");
        prof3.setDataNascimento(dt);
        prof3.setMatricula("20161254");
        prof3.setNome("Maria das Virtudes");
        prof3.setHorasTrabalhadas(150);
        prof3.setSalario(prof3.getHorasTrabalhadas());
        prof3.setDisciplina("Matematica");
        prof3.setNivelEscolaridade("Mestrado");

        ProfessorIntegral prof4 = new ProfessorIntegral();
        dt = formato.parse("10-05-1989");
        dt2 = formato.parse("30-09-2015");
        prof4.setDataNascimento(dt);
        prof4.setDataInicio(dt2);
        prof4.setMatricula("20180102");
        prof4.setNome("Ana Maria dos Santos");
        prof4.setSalario(4800);
        prof4.setDisciplina("Portugues");
        prof4.setNivelEscolaridade("Mestrado");

        ProfessorIntegral prof5 = new ProfessorIntegral();
        dt = formato.parse("25-05-1971");
        dt2 = formato.parse("25-05-2018");
        prof5.setDataNascimento(dt);
        prof5.setDataInicio(dt2);
        prof5.setMatricula("19800001");
        prof5.setNome("Raimundo Chico Nonato");
        prof5.setSalario(11500);
        prof5.setDisciplina("Biologia");
        prof5.setNivelEscolaridade("Doutorado");

        repositorio.adicionarProfessor(prof1);
        repositorio.adicionarProfessor(prof2);
        repositorio.adicionarProfessor(prof3);
        repositorio.adicionarProfessor(prof4);
        repositorio.adicionarProfessor(prof5);

        repositorio.listarProfessores();

        System.out.println("*************** Professor com Maior Salario **************************");
        System.out.println("Nome: " + repositorio.professorMaiorSalario().getNome());
        System.out.println("Salario: " + repositorio.professorMaiorSalario().getSalario());
        System.out.println("**********************************************************************\n");

        System.out.println("*************** Professor mais Jovem *********************************");
        System.out.print("Nome: " + repositorio.professorMaisJovem().getNome());
        System.out.println("    Dt. Nascimento: " + repositorio.professorMaisJovem().getDataNascimentoFormatada());
        System.out.println("**********************************************************************\n");

        System.out.println("*************** Total de Salários ************************************");
        System.out.println("Total de salários pagos: R$ " + repositorio.totalSalarios());
        System.out.println("**********************************************************************\n");

        System.out.println("*************** Média de Horas ***************************************");
        System.out.println("Média dos Professores Horistas: " + repositorio.mediaHorasTrabalhadas());
        System.out.println("**********************************************************************\n");

        System.out.println("*************** Professores que lecionam Portugues e Matematica ******");
        for (Professor prof : repositorio.professoresPortOuMat()) {
            System.out.println(prof.getNome() + " - " + prof.getDisciplina() + " (" + prof.getMatricula() + ")");
        }
        System.out.println("**********************************************************************\n");

        System.out.println("*************** Professores com Mestrado e Doutorado *****************");
        for (Professor prof : repositorio.professoresComMestradoOuDoutorado()) {
            System.out.println(prof.getNome() + " - " + prof.getNivelEscolaridade() + " (" + prof.getMatricula() + ")");
        }
        System.out.println("**********************************************************************\n");
    }
}
