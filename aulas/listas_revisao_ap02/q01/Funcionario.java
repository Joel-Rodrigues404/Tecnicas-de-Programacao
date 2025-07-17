// Crie uma classe Funcionario em Java com os atributos:
//
//     nome (String),
//
//     cargo (String),
//
//     salario (double, privado).
//
// Requisitos:
//
//     O atributo salario não deve ser acessado/modificado diretamente de fora da classe.
//
//     Implemente um construtor que inicialize todos os atributos.
//
//     Crie métodos públicos (getters) para todos os atributos.
//
//     Crie um método setSalario(double novoSalario) que só permita alteração se o valor for maior que zero.
//
//     No main, crie um objeto Funcionario, tente definir um salário negativo e depois um válido, mostrando o funcionamento do encapsulamento.

public class Funcionario {
    public String nome;
    public String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double novoSalario) {
        if (novoSalario >= 0) {
            this.salario = novoSalario;
        } else {
            System.out.println("O salario não deve ser menor do que zero!!!");
        }
    }
}
