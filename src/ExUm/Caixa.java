package ExUm;

public class Caixa {

    private double saldo;
    private double credito;
    private double debito;

    public Caixa(double saldo, double credito, double debito){ //construtor
        this.saldo = saldo;
        this.credito = credito;
        this.debito = debito;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double funCredito(){
        return saldo += credito;
    }
    public void setDebito(double debito) {
        this.debito = debito;
    }
    public double funDebito(){
        return saldo -= debito;
    }



}
