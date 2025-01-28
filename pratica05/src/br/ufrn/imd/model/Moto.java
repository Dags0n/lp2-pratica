package br.ufrn.imd.model;

public class Moto extends Veiculo implements ICarbonFootprint {
    private int cilindrada;

    public Moto(int kmMes, int cilindrada) {
        super(kmMes);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCustoMensal() {
        return 0;
    }

    @Override
    public double getCarbonFootprint() {
        if (cilindrada > 650) {
            return kmMes * 0.65;
        } else if (cilindrada < 150) {
            return kmMes * 0.20;
        } else {
            return kmMes * 0.50;
        }
    }
}
