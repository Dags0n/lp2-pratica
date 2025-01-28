package br.ufrn.imd.view;

import br.ufrn.imd.model.*;
import br.ufrn.imd.dao.RepositorioVeiculos;

public class CarboonFootprint {
    public static void main(String[] args) {
        RepositorioVeiculos repositorio = new RepositorioVeiculos();

        Carro carro1 = new Carro(1000, 2.5);
        Carro carro2 = new Carro(1500, 1.5);
        Moto moto1 = new Moto(500, 700);
        Moto moto2 = new Moto(750, 100);
        Taxi taxi1 = new Taxi(1200, 4);
        Taxi taxi2 = new Taxi(2000, 3);

        repositorio.adicionarVeiculo(carro1);
        repositorio.adicionarVeiculo(carro2);
        repositorio.adicionarVeiculo(moto1);
        repositorio.adicionarVeiculo(moto2);
        repositorio.adicionarVeiculo(taxi1);
        repositorio.adicionarVeiculo(taxi2);

        repositorio.exibirCarbonFootprints();
    }
}
