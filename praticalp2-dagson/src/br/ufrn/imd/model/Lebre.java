package br.ufrn.imd.model;

import br.ufrn.imd.controller.RaceControl;
import java.util.Random;

public class Lebre implements Runnable {
    private final String nome;
    private int distanciaPercorrida = 0;
    private int pulosDados = 0;
    private static final int DISTANCIA_TOTAL = 20;
    private final Random random = new Random();
    private final RaceControl raceControl;

    public Lebre(String nome, RaceControl raceControl) {
        this.nome = nome;
        this.raceControl = raceControl;
    }

    public String getNome() {
        return nome;
    }

    public int getPulosDados() {
        return pulosDados;
    }

    public int getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    @Override
    public void run() {
        while (distanciaPercorrida < DISTANCIA_TOTAL) {
            int salto = random.nextInt(3) + 1;
            distanciaPercorrida += salto;
            pulosDados++;
            System.out.printf("%s pulou %d metros (Total: %d metros)\n", nome, salto, distanciaPercorrida);

            if (distanciaPercorrida >= DISTANCIA_TOTAL) {
                raceControl.chegada(this);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
