public class Main {
    public static void main(String[] args) {
        Animal cachorro1 = new Cachorro();
        cachorro1.nome = "auau";

        Animal gato1 = new Gato();
        gato1.nome = "miaumiau";

        Animal[] animais = new Animal[2];

        animais[0] = cachorro1;
        animais[1] = gato1;

        for (int i = 0; i < 2; i++) {
            animais[i].emitirSom();
        }
    }
}
