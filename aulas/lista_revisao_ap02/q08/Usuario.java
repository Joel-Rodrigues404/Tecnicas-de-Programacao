// Uma aplicação precisa gerenciar usuários com nome de usuário e senha, mas a
// senha nunca deve ser exposta diretamente. Crie uma classe Usuario com
// atributos privados nomeUsuario (String) e senha (String). O construtor deve
// receber ambos. Adicione um método público autenticar(String senhaDigitada)
// que retorna true se a senhaDigitada coincidir com a senha armazenada, e false
// caso contrário. Não adicione um getter para a senha. No main, crie um Usuario e
// teste o método autenticar com senhas corretas e incorretas, reforçando o
// encapsulamento.

public class Usuario {
    private String nomeUsuario;
    private String senha;

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public boolean autenticar(String senhaDigitada) {
        if (senhaDigitada.equals(this.senha)) {
            return true;
        }
        return false;
    }

    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String novoNomeUsuario) {
        this.nomeUsuario = novoNomeUsuario;
    }

}
