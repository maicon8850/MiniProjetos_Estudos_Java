package RelatorioDeVendasMensal;

import java.util.Scanner;

public class RelatorioVendasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DIAS_DO_MES = 30; // Definindo o número de dias para o relatório

        double[] vendas = new double[DIAS_DO_MES]; // Array para armazenar as vendas de cada dia

        System.out.println("=== Relatório de Vendas Mensal ===");

        // Estrutura 'for' para solicitar o valor das vendas diariamente
        for (int i = 0; i < DIAS_DO_MES; i++) {
            // 'for' é ideal aqui porque sabemos o número exato de dias
            System.out.printf("Digite o valor da venda do dia %d: ", i + 1);
            vendas[i] = scanner.nextDouble();
        }

        // Criação das instâncias das classes
        VendasMes vendasMes = new VendasMes(vendas);
        EstatisticasVendas estatisticas = new EstatisticasVendas(vendas);

        // Calcular os resultados principais
        double total = vendasMes.calcularTotalVendas();
        double media = vendasMes.calcularMediaVendas();
        double menorVenda = estatisticas.obterMenorVenda();
        double maiorVenda = estatisticas.obterMaiorVenda();

        // Exibir o relatório consolidado
        RelatorioFinal.exibirRelatorio(total, media, menorVenda, maiorVenda);

        scanner.close(); // Fechando o Scanner para liberar recursos
    }
}