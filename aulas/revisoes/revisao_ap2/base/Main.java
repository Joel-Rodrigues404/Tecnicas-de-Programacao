public class Main {
    public static void main(String[] args) {
        Copo copo1 = new Copo(10, "vermelho", "1234");

        // System.out.println(copo1.cor);
        // System.out.println(copo1.tamanho);

        System.out.println(copo1.getSenha());

        copo1.setSenha("12345");

        System.out.println(copo1.getSenha());

    }
}
