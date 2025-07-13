public class Main {
    public static void main(String[] args) {
        Funcionario fc = new Funcionario("ricardo", "gerente", 5000);

        fc.setSalario(-1000);

        fc.setSalario(10000);

        System.out.println(fc.getSalario());
    }
}
