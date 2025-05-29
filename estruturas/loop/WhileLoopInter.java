public class WhileLoopInter {
    public static void main(String[] args) {
        System.out.println("\n\nMultiplos de 3 entre 0 e 100\n");

        int num = 0;

        while (num <= 100) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
            num = num + 1;
        }
    }
}
