package CalculadorIMC;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    //construtor
    public Pessoa ( String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    // get para retorna valor
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

}
