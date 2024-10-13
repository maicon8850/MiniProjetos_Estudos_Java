package CalculadorIMC;
// Esta classe é responsável por calcular o IMC com base no peso e na altura.
public class IMCCalculadora {

    //metodo para calcular o IMC
    public double calcularIMC (double peso, double altura){
        return peso / (altura * altura);
    }
}
