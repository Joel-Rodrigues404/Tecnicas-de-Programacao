// Em um sistema de gerenciamento de biblioteca, tanto livros quanto revistas são
// publicações e compartilham algumas características. Crie uma classe base
// Publicacao com atributos titulo (String) e anoPublicacao (int), e um método
// exibirDetalhes() que imprime esses detalhes. Crie uma subclasse Livro que
// herde de Publicacao e adicione um atributo autor (String). A subclasse Livro
// deve reutilizar o método exibirDetalhes() da superclasse e adicionar a impressão
// do autor. No main, instancie um Livro e chame exibirDetalhes(), mostrando a
// reutilização e extensão.

public class Publicacao {
    public String titulo;
    public int anoPublicacao;

    public Publicacao(String titulo, int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
    }

    public String exibirDetalhes() {
        return "Ano de publicação: " + this.anoPublicacao + " titulo: " + this.titulo;
    }

}
