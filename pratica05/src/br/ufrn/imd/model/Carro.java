package br.ufrn.imd.model;

public class Carro extends Veiculo implements ICarbonFootprint {
    private double motor;

    public Carro(int kmMes, double motor) {
        super(kmMes);
        this.motor = motor;
    }

    @Override
    public double calcularCustoMensal() {
        return 0;
    }

    @Override
    public double getCarbonFootprint() {
        if (motor > 2.0) {
            return kmMes * 1.85;
        } else if (motor < 1.0) {
            return kmMes * 0.13;
        } else {
            return kmMes * 1.22;
        }
    }
}
