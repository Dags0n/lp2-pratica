package model;

public class Moto extends Veiculo {
    private int cilindradas;
    private String tipoPartida;

    public Moto() {
        this.cilindradas = 0;
        this.tipoPartida = "";
    }

    @Override
    public boolean trocouOleo(Carro carro) {
        return false;
    }

    public Moto(String marca, String placa, double quilometragem, boolean alugado, double valorAluguel, int cilindradas, String tipoPartida) {
        super(marca, placa, quilometragem, alugado, valorAluguel);
        this.cilindradas = cilindradas;
        this.tipoPartida = tipoPartida;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }

    public void setTipoPartida(String tipoPartida) {
        this.tipoPartida = tipoPartida;
    }

    @Override
    public boolean trocouOleo(Moto moto) {
        return this.getQuilometragem() % 3500 == 0;
    }

    @Override
    public String toString() {
        return "Moto: " + getMarca() + "  Placa: " + getPlaca() + "  Partida: " + getTipoPartida() + "  Cilindradas: " + getCilindradas();
    }
}
