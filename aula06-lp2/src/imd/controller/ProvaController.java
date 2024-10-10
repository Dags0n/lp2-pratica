package imd.controller;

public class ProvaController {
    public Boolean verificarNota(double nota) {
        return nota <= 5 && nota >= 0;
    }
}
