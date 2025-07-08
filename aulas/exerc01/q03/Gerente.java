public class Gerente extends Funcionario {
    public Gerente(String nome, float salario) {
        super(nome, salario);
    }

    public String exibirBonus() {
        return "O bonus e " + this.salario * 1.2f;
    }
}
