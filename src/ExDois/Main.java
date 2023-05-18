package ExDois;

public class Main {
    public static void main(String[] args) {

        Bola bolaFutebol = new Bola(68, 129, "Azul", "Liverpool", "Couro");
        Bola bolaVolei = new Bola(65, 117, "Amarelo", "Penalty", "Microfibra");

        System.out.println("A COR DA BOLA DE VOLEI É:  " + bolaVolei.getCor());

        System.out.println("A COR DA BOLA DE FUTEBOL É: " + bolaFutebol.getCor());

        System.out.println("---------------------------------------");

        bolaVolei.setCor("Preto");

        bolaFutebol.setCor("Rosa");

        System.out.println("A COR ATUAL DA BOLA DE VOLEI É:  " + bolaVolei.getCor());

        System.out.println("A COR ATUAL DA BOLA DE FUTEBOL É: " + bolaFutebol.getCor());
    }
}
