package ExCinco;

public class Carro {
    private int qtdePortas;
    private String modelo;
    private String marca;
    private double potencia;

    public Carro(int qtdePortas, String modelo, String marca, double potencia){

        this.qtdePortas = qtdePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;

    }
    public boolean ligarCarro(){
        System.out.println("\nCarro ligado!");
        return true;
    }
    public int getQtdePortas(){
        return qtdePortas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPotencia() {
        return potencia;
    }
}
