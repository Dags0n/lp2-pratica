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

    public Veiculo getVeiculoMaiorAluguel() {
        Veiculo maiorAluguel = veiculos.get(0);
        for (Veiculo veiculo : veiculos) {
            if (veiculo.isAlugado()) {
                if (veiculo.getValorAluguel() > maiorAluguel.getValorAluguel()) {
                    maiorAluguel = veiculo;
                }
            }
        }
        return maiorAluguel;
    }

    public String listarVeiculos() {
        System.out.println("Lista de Veículos:");
        String lista = "";
        for (Veiculo veiculo : this.veiculos) {
            lista += veiculo + "\n";
        }
        return lista;
    }

    public String listarAlugados() {
        System.out.println("===============Lista de Alugados===============");
        String lista = "";
        double totalAluguel = 0;
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.isAlugado()) {
                lista += veiculo + "\n";
                totalAluguel += veiculo.getValorAluguel();
            }
        }
        lista += "Valor total dos Aluguel: " + totalAluguel + "\n";
        lista += "=================== Fim =======================\n";
        return lista;
    }

    public String listarDisponiveis() {
        System.out.println("=================Disponíveis===================");
        String lista = "";
        for (Veiculo veiculo : this.veiculos) {
            if (!veiculo.isAlugado()) {
                lista += veiculo + " Valor aluguel: " + veiculo.getValorAluguel() + "\n";
            }
        }
        lista += "Veículo com maior valor de aluguel: " + getVeiculoMaiorAluguel().getPlaca() + "\n";
        lista += "=================== Fim =======================\n";
        return lista;
    }

    public String listarManutencaoVeiculos() {
        System.out.println("=================Manutenção===================");
        String lista = "";
        for (Veiculo veiculo : this.veiculos) {
            if (veiculo.trocouOleo(veiculo)) {
                lista += "Veiculo: " + veiculo.getMarca() + " trocou óleo\n";
            }
        }
        lista += "=================== Fim =======================";
        return lista;
    }
}
