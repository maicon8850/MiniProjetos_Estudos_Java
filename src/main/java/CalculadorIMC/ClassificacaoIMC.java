package CalculadorIMC;

//Esta classe avalia o valor do IMC e retorna a faixa correspondente (Abaixo do peso, Normal, Sobrepeso, ou Obesidade).

public class ClassificacaoIMC {

    // Método para obter a classificação com base no IMC
    public String obterClassificacao(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25.0 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}