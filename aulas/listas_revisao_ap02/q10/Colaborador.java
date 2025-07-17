// Um sistema de gerenciamento de recursos humanos precisa calcular o bônus de
// diferentes tipos de colaboradores. Crie uma classe base Colaborador com um
// atributo nome (String) e um método abstrato calcularBonus() que retorna um
// double. Crie duas subclasses concretas: Desenvolvedor (com atributo
// salarioBase)
// e
// Gerente
// (com
// atributo
// salarioBase
// e
// quantidadeProjetosGerenciados).
// Desenvolvedor deve sobrescrever calcularBonus() para retornar 10% do
// salarioBase.
// Gerente deve sobrescrever calcularBonus() para retornar 15% do salarioBase
// mais R$ 100 por quantidadeProjetosGerenciados.
// No método main, crie um array ou ArrayList de Colaborador e adicione
// instâncias de
// Desenvolvedor e Gerente. Itere sobre a coleção e imprima o nome e o bônus de
// cada
// colaborador, demonstrando o polimorfismo com coleções.

public class Colaborador {
    public String nome;

    public Colaborador(String nome) {
        this.nome = nome;
    }

    public double calcularBonus() {
        return 0.0;
    }

}
