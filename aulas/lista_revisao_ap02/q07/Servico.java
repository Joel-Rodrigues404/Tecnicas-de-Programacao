public class Servico extends ItemPedido {
    public String descricao;
    public double HorasTrabalhadas;
    public double valorHora;

    public Servico(String descricao, double HorasTrabalhadas, double valorHora) {
        this.descricao = descricao;
        this.HorasTrabalhadas = HorasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPreco() {
        return this.HorasTrabalhadas * this.valorHora;
    }

}
