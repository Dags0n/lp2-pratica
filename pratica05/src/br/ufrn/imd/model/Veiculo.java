package br.ufrn.imd.model;

public abstract class Veiculo {
    protected int kmMes;

    public Veiculo(int kmMes) {
        this.kmMes = kmMes;
    }

    public abstract double calcularCustoMensal();

    public abstract double getCarbonFootprint();
}
