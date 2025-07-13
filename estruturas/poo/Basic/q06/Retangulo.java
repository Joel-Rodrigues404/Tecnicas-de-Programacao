// Crie uma classe Retangulo com:
//
//     largura, altura (double)
//
// Métodos:
//
//     calcularArea()
//
//     calcularPerimetro()

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea() {
        return this.altura * this.largura;
    }

    public double calcularPerimetro() {
        return (this.altura + this.largura) * 2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
