public class Livro extends Publicacao {
    public String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public String exibirDetalhes() {
        return "Ano de publicação: " + this.anoPublicacao + " titulo: " + this.titulo + " Autor: " + this.autor;
    }

}
