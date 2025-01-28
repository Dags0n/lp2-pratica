package br.ufrn.imd.model;

public class Automovel {
    public static final int VELOCIDADE_MAXIMA = 120;
    private int velocidadeAtual;

    public Automovel() {
        this.velocidadeAtual = 0;
    }

    public void acelerar(int velocidade) throws AcimaVelocidadeException {
        if (velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
            throw new AcimaVelocidadeException("Excedeu a velocidade máxima!");
        }
        this.velocidadeAtual += velocidade;
    }
}
