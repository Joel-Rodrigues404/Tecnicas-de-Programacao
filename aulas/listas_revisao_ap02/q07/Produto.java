public class Produto extends ItemPedido {
    public String nome;
    public double precoUnitario;

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPreco() {
        return this.precoUnitario;
    }
}
