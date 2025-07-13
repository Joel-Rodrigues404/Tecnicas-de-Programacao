// Crie a classe Circulo com:
//
//     raio (double)
//
// Constante:
//
//     PI = 3.14159
//
// Métodos:
//
//     calcularArea()
//
//     calcularCircunferencia()

public class Circulo {
    private double raio;
    static final double PI = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
