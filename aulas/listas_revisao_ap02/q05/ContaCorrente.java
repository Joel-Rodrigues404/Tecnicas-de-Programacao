// Um sistema bancário precisa gerenciar contas correntes, onde o saldo não pode
// ser negativo. Crie uma classe ContaCorrente com um atributo privado saldo
// (double). Implemente um construtor que inicialize o saldo. Crie um método
// público depositar(double valor) que adicione o valor ao saldo. Crie um método
// público sacar(double valor) que subtraia o valor do saldo, mas apenas se o saldo
// for suficiente (o saldo não pode se tornar negativo). Se o saque não for possível,
// imprima uma mensagem de erro. Adicione um getter para o saldo. No main,
// simule operações de depósito e saque para testar as regras de negócio.

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Dinheiro insuficiente, pobre!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
