package CalculadorIMC;

import java.util.Scanner;

public class IMCAppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        // Cria uma instância de Pessoa
        Pessoa pessoa = new Pessoa(nome, peso, altura);

        // Calcula o IMC
        IMCCalculadora calculadora = new IMCCalculadora();
        double imc = calculadora.calcularIMC(pessoa.getPeso(), pessoa.getAltura());

        // Obtém a classificação do IMC
        ClassificacaoIMC classificacaoIMC = new ClassificacaoIMC();
        String classificacao = classificacaoIMC.obterClassificacao(imc);

        // Exibe o resultado final
        System.out.printf("Olá, %s! Seu IMC é %.2f. Você está na faixa: %s%n",
                pessoa.getNome(), imc, classificacao);

        scanner.close();
    }
}
