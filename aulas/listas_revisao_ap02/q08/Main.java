import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("ricardo", "123456");

        Scanner input = new Scanner(System.in);

        String senhaDigitada = input.next();

        System.out.println(user.autenticar(senhaDigitada));

        input.close();
    }
}
