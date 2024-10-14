package RelatorioDeVendasMensal;

// Classe responsável por armazenar e processar as vendas do mês
public class VendasMes {
    private final double[] vendas;

    // Construtor que recebe o array de vendas
    public VendasMes(double[] vendas) {
        this.vendas = vendas;
    }

    // Método para calcular o total das vendas usando 'for'
    public double calcularTotalVendas() {
        double total = 0;

        // Estrutura 'for' para somar todas as vendas
        for (int i = 0; i < vendas.length; i++) {
            total += vendas[i]; // Somando cada valor ao total
        }

        // O 'for' é ideal aqui porque precisamos iterar por todas as vendas
        return total;
    }

    // Método para calcular a média das vendas
    public double calcularMediaVendas() {
        return calcularTotalVendas() / vendas.length;
    }
}
