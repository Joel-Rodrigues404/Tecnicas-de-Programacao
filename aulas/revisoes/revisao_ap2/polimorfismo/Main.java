public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("azul", 4, "sonic");

        Animal cachorro1 = new Cachorro("preto", "noturno", "grande");

        System.out.println(((Cachorro) cachorro1).getPorte());

        cachorro1.fazerSom();
    }
}
