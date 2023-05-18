package ExTres;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Laura", 4, 51, 1.20);


            System.out.println("Altura inicial de "+ pessoa1.getNome() + " é: " + pessoa1.getAltura());
            System.out.println("Idade inicial de " + pessoa1.getNome() + " é: " + pessoa1.getIdade() + " anos");

        for (int i = 1; pessoa1.getIdade() < 21; i++) {
            pessoa1.setAltura(0.5);
            System.out.println("----------------");
            pessoa1.setIdade(1);
            if (!(pessoa1.getIdade() == 22)) {
                System.out.println(pessoa1.getNome());
                System.out.println(pessoa1.getIdade() + " anos");
                System.out.println(pessoa1.getAltura() + "m");
                System.out.println(pessoa1.getPeso() + "kg");
            }
        }




    }
}

