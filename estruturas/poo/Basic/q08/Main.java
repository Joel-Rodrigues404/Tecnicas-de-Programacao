public class Main {

    public static void main(String[] args) {
        Funcionario fc = new Funcionario("joel", 100);

        fc.aumentarSalario(10);

        System.out.println(fc.getSalario());
    }
}
