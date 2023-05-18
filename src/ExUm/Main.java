package ExUm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Caixa caixa = new Caixa(1000.0, 0, 0);

        System.out.println("Seu saldo atual é: " + caixa.getSaldo());

        System.out.println("Informe quantos lançamentos você deseja fazer: ");
        int lancamento = scan.nextInt();

        for (int i = 0; i < lancamento; i++) {
            System.out.println("Informe o valor: ");
            double valorDigitado = scan.nextDouble();

            System.out.println("Você deseja: \n 1- Crédito \n 2- Débito");
            switch (scan.nextInt()) {
                case 1:
                    caixa.setCredito(valorDigitado);
                    caixa.funCredito();
                    break;
                case 2:
                    caixa.setDebito(valorDigitado);
                    caixa.funDebito();
                    break;

                default:
                    System.out.println("ERROR");
                    System.exit(0);
            }

            System.out.println("Saldo atual: " + caixa.getSaldo());

        }


    }
}
