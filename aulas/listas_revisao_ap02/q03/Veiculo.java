// Crie uma classe Veiculo com os atributos:
//
//     marca (String),
//
//     ano (int).
//
// Requisitos:
//
//     Implemente getters para os dois atributos.
//
//     Crie uma subclasse Carro com o atributo adicional numeroPortas (int).
//
//     O construtor de Carro deve inicializar os próprios atributos e chamar o construtor da superclasse Veiculo.
//
//     No main, crie um objeto Carro, atribua valores e imprima todos os atributos, demonstrando a herança.

public class Veiculo {
    public String marca;
    public int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

}
