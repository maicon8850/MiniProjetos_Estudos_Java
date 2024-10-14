package RelatorioDeVendasMensal;

// Classe para obter estatísticas das vendas (menor e maior valor)
public class EstatisticasVendas {
    private final double[] vendas;

    // Construtor que recebe o array de vendas
    public EstatisticasVendas(double[] vendas) {
        this.vendas = vendas;
    }

    // Método para obter a menor venda do mês
    public double obterMenorVenda() {
        double menor = vendas[0]; // Inicializa com o primeiro valor

        // Estrutura 'for' para comparar todas as vendas
        for (int i = 1; i < vendas.length; i++) {
            if (vendas[i] < menor) { // Verificando se a venda atual é menor
                menor = vendas[i];
            }
        }

        return menor;
    }

    // Método para obter a maior venda do mês
    public double obterMaiorVenda() {
        double maior = vendas[0]; // Inicializa com o primeiro valor

        // Estrutura 'for' para encontrar a maior venda
        for (int i = 1; i < vendas.length; i++) {
            if (vendas[i] > maior) { // Verificando se a venda atual é maior
                maior = vendas[i];
            }
        }

        return maior;
    }
}