public class Copo {
    public int tamanho;
    public String cor;
    private String senha;

    public Copo(int tamanho, String cor, String senha) {
        this.tamanho = tamanho;
        this.cor = cor;
        this.senha = senha;
    }

    public void encherCopo() {
        System.out.println("Voce encheu o copo");
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String nova_senha) {
        this.senha = nova_senha;
    }
}
