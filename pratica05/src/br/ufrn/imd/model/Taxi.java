package br.ufrn.imd.model;

public class Taxi extends Veiculo implements ICarbonFootprint {
    private int quantidadePessoas;

    public Taxi(int kmMes, int quantidadePessoas) {
        super(kmMes);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double calcularCustoMensal() {
        return 0;
    }

    @Override
    public double getCarbonFootprint() {
        return kmMes * 1.10;
    }
}
