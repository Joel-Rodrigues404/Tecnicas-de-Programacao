public class Livro {
    public String titulo;
    public String autor;
    public int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 2020;
    }
}
