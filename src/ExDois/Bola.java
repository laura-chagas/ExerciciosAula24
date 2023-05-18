package ExDois;

import java.util.Scanner;

public class Bola {
    private double circunferencia;
    private double velocidade;
    private String cor;
    private String marca;
    private String material;

    public Bola(double circunferencia, double velocidade, String cor, String marca, String material) {
        this.circunferencia = circunferencia;
        this.velocidade = velocidade;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

}
