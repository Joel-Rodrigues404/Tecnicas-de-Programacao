public class Main {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria("010102", 500);

        System.out.println(cb.getSaldo());

        cb.sacar(600);
    }
}
