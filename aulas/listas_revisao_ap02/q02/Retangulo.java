// Crie uma classe Retangulo com os atributos:
//
//     largura (double),
//
//     altura (double).
//
// Requisitos:
//
//     Implemente um construtor para os dois atributos.
//
//     Crie um método público calcularArea() que retorne a área do retângulo.
//
//     No main, crie um objeto Retangulo, defina os valores e imprima a área calculada.

public class Retangulo {
    public double largura;
    public double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.altura * this.largura;
    }

}
