// Crie a classe ContaBancaria com:
//
// numeroConta (String)
//
// saldo (double, privado)
//
// Métodos:
//
// depositar(double valor)
//
// sacar(double valor) → verifica se há saldo suficiente
//
// getSaldo() → retorna o saldo
//
// Use private e crie os métodos para manipular o saldo de forma segura.

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        if (this.saldo - valor > 0) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Não tem saldo para sacar: " + valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
