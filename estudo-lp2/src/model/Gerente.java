package model;

public class Gerente extends Funcionario {
    private double salario;

    public Gerente(String matricula, String nome, double salario) {
        super(matricula, nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "  Tipo.: " + getClass();
    }
}
