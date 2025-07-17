public class Main {
    public static void main(String[] args) {
        Colaborador dev1 = new Desenvolvedor("joel", 10000000);
        Colaborador dev2 = new Desenvolvedor("ricardo", 10000000);

        Colaborador ger1 = new Gerente("joel", 10000000, 4);
        Colaborador ger2 = new Gerente("ricardo", 10000000, 6);

        Colaborador[] listaColaboradores = { dev1, dev2, ger1, ger2 };

        for (int i = 0; i < 4; i++) {
            System.out.println(listaColaboradores[i].nome);
            System.out.println(listaColaboradores[i].calcularBonus());
            System.out.printf("%s: %.2f%n", listaColaboradores[i].nome, listaColaboradores[i].calcularBonus());
        }
    }
}
