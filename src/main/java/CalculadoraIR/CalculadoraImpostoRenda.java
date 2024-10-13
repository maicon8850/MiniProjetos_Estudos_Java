package CalculadoraIR;

public class CalculadoraImpostoRenda {

    // Método para calcular o imposto de renda com base no salário
    public double calcularImposto(double salario) {
        if (salario <= 2000) {
            return 0;  // Isento
        } else if (salario <= 3500) {
            return salario * 0.075;  // 7,5%
        } else if (salario <= 5000) {
            return salario * 0.15;  // 15%
        } else {
            return salario * 0.225;  // 22,5%
        }
    }

    // Método para obter a alíquota correspondente
    public String obterAliquota(double salario) {
        if (salario <= 2000) {
            return "Isento";
        } else if (salario <= 3500) {
            return "7,5%";
        } else if (salario <= 5000) {
            return "15%";
        } else {
            return "22,5%";
        }
    }
}