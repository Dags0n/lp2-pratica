package br.ufrn.imd.view;

import br.ufrn.imd.controller.RaceControl;
import br.ufrn.imd.model.Lebre;

public class RaceView {
    public static void main(String[] args) {
        String[] nomesLebres = {"Tobias", "Frida", "Tom", "Luke", "Elsa"};
        final int TOTAL_LEBRES = nomesLebres.length;
        RaceControl raceControl = new RaceControl(TOTAL_LEBRES);
        Thread[] threads = new Thread[TOTAL_LEBRES];

        System.out.println("Iniciando a corrida de lebres!\n");

        for (int i = 0; i < TOTAL_LEBRES; i++) {
            Lebre lebre = new Lebre(nomesLebres[i], raceControl);
            threads[i] = new Thread(lebre);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
