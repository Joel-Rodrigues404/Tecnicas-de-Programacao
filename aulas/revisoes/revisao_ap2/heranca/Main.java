public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("azul", 4, "sonic");

        Cachorro cachorro1 = new Cachorro("preto", "noturno", "grande");

        System.out.println(cachorro1.porte);

        cachorro1.comer();
        cachorro1.abanarRabo();
    }
}
