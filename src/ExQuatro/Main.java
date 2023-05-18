package ExQuatro;

public class Main {
    public static void main(String[] args) {

        ContaCorrente acc1  = new ContaCorrente("Laura", 123321, 0);

        System.out.println("Seu saldo atual: " + acc1.getSaldo());
        acc1.depositoConta(500);
        System.out.println("---------------------------------");
        System.out.println("Seu saldo atual: " + acc1.getSaldo());
        System.out.println("---------------------------------");
        acc1.saqueConta(250);

        System.out.println("Seu saldo atual: " + acc1.getSaldo());

    }
}
