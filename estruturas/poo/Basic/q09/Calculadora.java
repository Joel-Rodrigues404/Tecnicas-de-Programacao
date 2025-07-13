// Crie uma classe Calculadora com métodos:
//
// somar(int a, int b)
//
// subtrair(int a, int b)
//
// multiplicar(int a, int b)
//
// dividir(int a, int b) → verifique se b é diferente de 0

public class Calculadora {
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double dividir(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Erro divisão por zero");
            return 0.0;
        }
    }
}
