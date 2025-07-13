// Crie a classe Produto com:
//
//     nome (String)
//
//     preco (double)
//
// Crie um construtor que recebe os dois valores.
// Adicione um método exibirInformacoes().

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String exibirInformacoes() {
        return "Preço: " + this.preco + " nome: " + this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(double preco) {
        this.preco = preco;
    }
}
