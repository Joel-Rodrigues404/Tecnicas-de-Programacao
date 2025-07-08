public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[2];

        animais[0] = new Leao();
        animais[1] = new Elefante();

        for (int i = 0; i < animais.length; i++) {
            animais[i].emitirSom();
        }
    }
}
