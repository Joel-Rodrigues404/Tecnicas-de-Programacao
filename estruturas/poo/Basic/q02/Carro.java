// Crie a classe Carro com os atributos:
//
// modelo (String)
//
// velocidade (int)
//
// E os métodos:
//
// acelerar() → aumenta a velocidade em 10
//
// frear() → diminui a velocidade em 10
//
// exibirVelocidade() → imprime a velocidade atual

public class Carro {

    private String modelo;
    private int velocidade;

    public Carro(String modelo, int velocidade) {
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar() {
        this.velocidade = this.velocidade + 10;
    }

    public void frear() {
        this.velocidade = this.velocidade - 10;
        if (velocidade < 0)
            velocidade = 0;
    }

    public void exibirVelocidade() {
        System.out.println("A velocidade e: " + this.velocidade);
    }

    // getters e setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
