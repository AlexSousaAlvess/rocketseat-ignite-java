package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    //Constructor
    public ContaBancaria(){
        saldo = 0.0;
    }

    //Getters e Setters
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    //depositar
    void depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Depósito de R$ "+valor+" meu saldo é de R$ "+saldo);
        }else{
            System.out.println("O valor de deposito é invalido");
        }
    }

    //sacar
    void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo = saldo -  valor;
            System.out.println("Saque de R$ "+valor+" saldo atual é R$ "+saldo);
        }else{
            System.out.println("O valor de saque é invalido");
        }
    }
}
