package model;

public class Carro extends Veiculo {
    private int portas;
    private int potencia;

    public Carro() {
        portas = 0;
        potencia = 0;
    }

    public Carro(String marca, String placa, double quilometragem, boolean alugado, double valorAluguel, int portas, int potencia) {
        super(marca, placa, quilometragem, alugado, valorAluguel);
        this.portas = portas;
        this.potencia = potencia;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
