package br.ufrn.imd.view;

import br.ufrn.imd.dao.Repositorio;
import br.ufrn.imd.model.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ProgramaSaude {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Repositorio repositorio = new Repositorio();

        Homem homem = new Homem("Zé Lezin", sdf.parse("20/01/1945"), 74.8, 1.75);
        Mulher mulher = new Mulher("Frida Kahlo", sdf.parse("06/07/1907"), 50.2, 1.69);

        repositorio.adicionarPessoa(homem);
        repositorio.adicionarPessoa(mulher);

        repositorio.listarPessoas();

        scanner.close();
    }
}
