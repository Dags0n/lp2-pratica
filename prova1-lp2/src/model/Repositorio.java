package model;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Veiculo> veiculos;

    public Repositorio() {
        this.veiculos = new ArrayList<>();
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public String listarVeiculos() {
        System.out.println("Lista de Veículos");
        String lista = "";
        for (Veiculo veiculo : this.veiculos) {
            lista += veiculo.toString() + "\n";
        }
        return lista;
    }
}
