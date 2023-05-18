package ExQuatro;

public class ContaCorrente {

    private String nomeCorrentista;
    private int numConta;
    private double saldo;

    public ContaCorrente(String nomeCorrentista, int numConta, double saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    public double getSaldo(){
            return saldo;
    }
    public void setSaldo(double saldo){
            this.saldo = saldo;
    }

    public double depositoConta(double valor){
         return saldo += valor;

    }
    public double saqueConta(double valor){

           if (valor > saldo){
                   System.out.println("Não foi possível realizar o saque. ");
                   System.out.println("Seu saldo: " + saldo + "\nValor desejado: " + valor);
                   System.exit(0);
           }

                   return saldo -= valor;


    }

}
