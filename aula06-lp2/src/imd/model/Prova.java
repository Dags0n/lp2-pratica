package imd.model;

import imd.controller.ProvaController;

public class Prova {
    private double notaParte1;
    private double notaParte2;
    ProvaController provaController = new ProvaController();

    public Prova() {
        this.notaParte1 = 0.0;
        this.notaParte2 = 0.0;
    }

    public double getNotaParte1() {
        return notaParte1;
    }

    public void setNotaParte1(double notaParte1) {
        if (provaController.verificarNota(notaParte1)) {
            this.notaParte1 = notaParte1;
        }
        System.out.println("Nota Parte 1 - Inválida!");
    }

    public double getNotaParte2() {
        return notaParte2;
    }

    public void setNotaParte2(double notaParte2) {
        if (provaController.verificarNota(notaParte2)) {
            this.notaParte2 = notaParte2;
        }
        System.out.println("Nota Parte 2 - Inválida!");
    }

    public double calcularNotaTotal() {
        return (this.notaParte1 + this.notaParte2);
    }
}
