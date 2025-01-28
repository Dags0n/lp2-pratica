package br.ufrn.imd.controller;

import br.ufrn.imd.model.AcimaVelocidadeException;
import br.ufrn.imd.model.Automovel;

public class Pista {
    public void iniciar() throws PistaException {
        Automovel automovel = new Automovel();
        try {
            automovel.acelerar(90);
            automovel.acelerar(130);
        } catch (AcimaVelocidadeException e) {
            throw new PistaException("A pista está com problema", e);
        }
    }
}
