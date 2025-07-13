// Crie a classe Livro com:
//
//     titulo (String)
//
//     autor (String)
//
//     numeroPaginas (int, privado)
//
// Adicione getters e setters para o número de páginas, validando para que não seja menor que 1.

public class Livro {
    public String titulo;
    public String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas < 1) {
            System.out.println("O numero Paginas não deve ser menor que 1");
        } else {
            this.numeroPaginas = numeroPaginas;
        }
    }
}
