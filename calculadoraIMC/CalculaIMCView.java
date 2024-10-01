import java.util.Scanner;

public class CalculaIMCView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite o Altura: ");
        double altura = sc.nextDouble();

        Pessoa pessoa = new Pessoa(altura, peso);

        System.out.println("Peso   => " + pessoa.getPeso());
        System.out.println("Altura => " + pessoa.getAltura());
        System.out.printf("IMC = %.2f%n", pessoa.calcularIMC());
        System.out.println(pessoa.avaliaIMC());
    }
}
