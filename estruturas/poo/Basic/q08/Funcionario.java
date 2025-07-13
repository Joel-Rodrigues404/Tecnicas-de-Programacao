// Crie a classe Funcionario com:
//
//     nome (String)
//
//     salario (double)
//
// Método:
//
//     aumentarSalario(double porcentagem)
//
// Exemplo: aumentarSalario(10) aumenta 10% do salário.

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario = this.salario * (1 + (porcentagem / 100));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
