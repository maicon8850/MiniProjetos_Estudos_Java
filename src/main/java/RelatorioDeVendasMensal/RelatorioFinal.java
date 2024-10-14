package RelatorioDeVendasMensal;

// Classe responsável por exibir o relatório final
public class RelatorioFinal {

    // Método estático para exibir os resultados consolidados
    public static void exibirRelatorio(double total, double media, double menorVenda, double maiorVenda) {
        System.out.println("\n=== Relatório Final ===");
        System.out.printf("Total das Vendas: R$%.2f%n", total);
        System.out.printf("Média das Vendas Diárias: R$%.2f%n", media);
        System.out.printf("Menor Venda: R$%.2f%n", menorVenda);
        System.out.printf("Maior Venda: R$%.2f%n", maiorVenda);
    }
}