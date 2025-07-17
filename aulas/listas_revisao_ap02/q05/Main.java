public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(300);

        cc.depositar(100);
        System.out.println(cc.getSaldo());

        cc.sacar(300);
        System.out.println(cc.getSaldo());

        cc.sacar(150);
        System.out.println(cc.getSaldo());
    }
}
