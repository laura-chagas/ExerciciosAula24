package ExSeis;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado1 = new Quadrado(5);

        System.out.println("O lado inicial do seu quadrado é: " + quadrado1.getLado());
        System.out.println("A área inicial do seu quadrado é: " + quadrado1.calcularArea());

        System.out.println("--------------------------------------------------");
        quadrado1.setLado(10);

        System.out.println("O lado do seu quadrado agora é: " + quadrado1.getLado());
        System.out.println("A área do seu quadrado agora é: " + quadrado1.calcularArea());
    }
}
