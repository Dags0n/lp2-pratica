package br.ufrn.imd.view;

import br.ufrn.imd.controller.Pista;
import br.ufrn.imd.controller.PistaException;

public class Aplicacao {
    public static void main(String[] args) {
        Pista pista = new Pista();
        try {
            pista.iniciar();
        } catch (PistaException e) {
            // e.printStackTrace();
            System.out.println("Pista foi bloqueada.");
        }
    }
}
