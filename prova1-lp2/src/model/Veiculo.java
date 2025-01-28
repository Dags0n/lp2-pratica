package model;

public class Veiculo {
    private String marca;
    private String placa;
    private double quilometragem;
    private boolean alugado;
    private double valorAluguel;

    public Veiculo() {
        this.marca = "";
        this.placa = "";
        this.quilometragem = 0;
        this.alugado = false;
        this.valorAluguel = 0;
    }

    public Veiculo(String marca, String placa, double quilometragem, boolean alugado, double valorAluguel) {
        this.marca = marca;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.alugado = alugado;
        this.valorAluguel = valorAluguel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    @Override
    public String toString() {
        return "Veículo: " + getClass() + "    Marca: " + marca + "    Placa: " + placa;
    }
}
