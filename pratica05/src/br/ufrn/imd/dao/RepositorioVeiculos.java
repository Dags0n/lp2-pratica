package br.ufrn.imd.dao;

import br.ufrn.imd.model.*;
import java.util.ArrayList;
import java.util.List;

public class RepositorioVeiculos {
    private List<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void exibirCarbonFootprints() {
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof ICarbonFootprint) {
                System.out.println("Carbon Footprint [" + veiculo.getClass() + "]: " + ((ICarbonFootprint) veiculo).getCarbonFootprint());
            }
        }
    }
}
