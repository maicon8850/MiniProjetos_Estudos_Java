package CalculadoraIR;
import java.util.Scanner;

public class AppImpostoRendaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraImpostoRenda calculadora = new CalculadoraImpostoRenda();

        // Solicita o salário do usuário
        System.out.print("Digite seu salário mensal: R$ ");
        double salario = scanner.nextDouble();

        // Calcula o imposto e obtém a alíquota correspondente
        double imposto = calculadora.calcularImposto(salario);
        String aliquota = calculadora.obterAliquota(salario);

        // Exibe o resultado
        if (imposto == 0) {
            System.out.println("Você está isento de pagar imposto de renda.");
        } else {
            System.out.printf("Alíquota: %s%n", aliquota);
            System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
        }

        scanner.close();
    }
}

