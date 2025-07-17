public class Desenvolvedor extends Colaborador {
    public double salarioBase;

    public Desenvolvedor(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularBonus() {
        return this.salarioBase * 1.1;
    }
}
