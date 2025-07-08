public class Cliente {
    public String nome;
    public String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String exibirDados() {
        return "Nome " + this.nome + " cpf " + this.cpf;
    }
}
