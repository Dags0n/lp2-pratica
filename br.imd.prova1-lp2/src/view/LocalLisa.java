package view;

import model.*;

public class LocalLisa {
    public static void main(String[] args) {
        Repositorio repo = new Repositorio();

        Carro c1 = new Carro();
        c1.setAlugado(true);
        c1.setMarca("Ford");
        c1.setPlaca("AAA-8888");
        c1.setPortas(4);
        c1.setPotencia(1600);
        c1.setValorAluguel(5 * 115.5);
        c1.setQuilometragem(21000);

        Carro c2 = new Carro();
        c2.setAlugado(true);
        c2.setMarca("Fiat");
        c2.setPlaca("ABB-1000");
        c2.setPortas(4);
        c2.setPotencia(1000);
        c2.setValorAluguel(3 * 75.0);
        c2.setQuilometragem(15000);

        Carro c3 = new Carro();
        c3.setAlugado(false);
        c3.setMarca("Fiat");
        c3.setPlaca("ABC-5501");
        c3.setPortas(2);
        c3.setPotencia(1200);
        c3.setValorAluguel(1 * 75.0);
        c3.setQuilometragem(14000);

        Moto m1 = new Moto();
        m1.setAlugado(false);
        m1.setMarca("Honda");
        m1.setPlaca("BBB-2019");
        m1.setCilindradas(850);
        m1.setTipoPartida("Elétrica");
        m1.setValorAluguel(1 * 55.25);
        m1.setQuilometragem(3500);

        Moto m2 = new Moto();
        m2.setAlugado(true);
        m2.setMarca("Yamaha");
        m2.setPlaca("XYZ-2019");
        m2.setCilindradas(250);
        m2.setTipoPartida("Elétrica");
        m2.setValorAluguel(2 * 55.25);
        m2.setQuilometragem(4500);

        repo.adicionarVeiculo(c1);
        repo.adicionarVeiculo(c2);
        repo.adicionarVeiculo(c3);
        repo.adicionarVeiculo(m1);
        repo.adicionarVeiculo(m2);

        System.out.println(repo.listarVeiculos());
        System.out.println(repo.listarAlugados());
        System.out.println(repo.listarDisponiveis());
        System.out.println(repo.listarManutencaoVeiculos());
    }
}
