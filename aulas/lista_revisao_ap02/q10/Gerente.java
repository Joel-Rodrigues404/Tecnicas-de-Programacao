public class Gerente extends Colaborador {
    public double salarioBase;
    public int quantidadeProjetosGerenciados;

    public Gerente(String nome, double salarioBase, int quantidadeProjetosGerenciados) {
        super(nome);
        this.salarioBase = salarioBase;
        this.quantidadeProjetosGerenciados = quantidadeProjetosGerenciados;
    }

    @Override
    public double calcularBonus() {
        return (salarioBase * 1.15) + (quantidadeProjetosGerenciados * 100);
    }
}
