package br.ufrn.imd.dao;

import br.ufrn.imd.model.Animal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ZooDao {
    private List<Animal> jaulas;

    public ZooDao() {
        jaulas = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        jaulas.add(animal);
    }

    public List<Animal> listarAnimais() {
        return jaulas;
    }

    public double calcularTotalAlimento(String tipoAlimentacao) {
        return jaulas.stream()
                .filter(animal -> animal.getTipoAlimentacao().equals(tipoAlimentacao))
                .mapToDouble(Animal::calcularAlimentoDiario)
                .sum();
    }

    public List<Animal> listarPorIdade(boolean maisNovo) {
        return jaulas.stream()
                .sorted(maisNovo ? Comparator.comparing(Animal::getIdade) : Comparator.comparing(Animal::getIdade).reversed())
                .toList();
    }
}
