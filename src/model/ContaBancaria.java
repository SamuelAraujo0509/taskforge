package model;

public class ContaBancaria {

    String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        this.saldo += valor;
        return saldo;
    }

    public void imprimir() {
        IO.print("Saldo de " + titular + ": R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
