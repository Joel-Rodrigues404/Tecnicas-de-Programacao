public class Animal {
    public String cor;
    public int qtdPatas;
    public String nome;

    public Animal(String cor, int qtdPatas, String nome) {
        this.cor = cor;
        this.qtdPatas = qtdPatas;
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println(this.nome + " faz som generico");
    }
}
