package br.ufrn.imd.controller;

import br.ufrn.imd.model.Lebre;
import java.util.ArrayList;
import java.util.List;

public class RaceControl {
    private final List<Lebre> ranking = new ArrayList<>();
    private final int totalLebres;

    public RaceControl(int totalLebres) {
        this.totalLebres = totalLebres;
    }

    public synchronized void chegada(Lebre lebre) {
        if (!ranking.contains(lebre)) {
            ranking.add(lebre);
            System.out.printf("%s chegou em %dº lugar!\n", lebre.getNome(), ranking.size());
        }

        if (ranking.size() == totalLebres) {
            finalizarCorrida();
        }
    }

    private void finalizarCorrida() {
        System.out.println("\n============ Ordem de chegada ============");
        for (int i = 0; i < ranking.size(); i++) {
            Lebre lebre = ranking.get(i);
            System.out.printf("%dº lugar: %s\t- Distancia: %d\t- Pulos: %d\n", i + 1, lebre.getNome(), lebre.getDistanciaPercorrida(), lebre.getPulosDados());
        }
        System.out.println("==========================================");
    }
}
