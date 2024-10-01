public class Pessoa {
    private double altura;
    private double peso;

    public Pessoa(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double calcularIMC() {
        return peso/(altura*altura);
    }

    public String avaliaIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Pessoa Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Pessoa com Peso normal";
        } else if (imc >= 24.9 && imc < 29.9) {
            return "Pessoa com Pré-obesidade";
        } else if (imc >= 29.9 && imc < 34.9) {
            return "Pessoa com Obesidade Grau 1";
        } else if (imc >= 34.9 && imc < 39.9) {
            return "Pessoa com Obesidade Grau 2";
        } else {
            return "Pessoa com Obesidade Grau 3";
        }
    }
}
