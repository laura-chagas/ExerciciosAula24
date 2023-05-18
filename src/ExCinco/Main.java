package ExCinco;

public class Main {
    public static void main(String[] args) {

       Carro carro1 = new Carro(4, "Lancer", "Mitsubishi", 2.0);

        System.out.println("Quantidade de portas: " + carro1.getQtdePortas() + "\nModelo: " + carro1.getModelo() + "\nMarca: " + carro1.getMarca() + "\nPotência: " + carro1.getPotencia());


       carro1.ligarCarro();


    }
}
