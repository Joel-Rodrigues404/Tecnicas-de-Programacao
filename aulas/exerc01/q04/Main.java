public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis");

        System.out.println(livro.titulo);
        System.out.println(livro2.anoPublicacao);
    }
}
