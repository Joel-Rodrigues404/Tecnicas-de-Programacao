// Um sistema de processamento de pedidos pode lidar com diferentes tipos de
// itens. Crie uma classe base ItemPedido com um método calcularPreco() que
// retorna 0.0. Crie duas subclasses: Produto (com atributos nome e precoUnitario)
// e Servico (com atributos descricao e horasTrabalhadas e valorHora). Ambas as
// subclasses devem sobrescrever calcularPreco() para retornar o preço total
// (precoUnitario para Produto e horasTrabalhadas * valorHora para Servico). Crie
// uma classe ProcessadorPedidos com um método público processar(ItemPedido
// item) que recebe um ItemPedido e imprime seu preço, demonstrando o
// polimorfismo em parâmetros. No main, crie instâncias de Produto e Servico e
// passe-as para o método processar().

public class ItemPedido {
    public double calcularPreco() {
        return 0.0;
    }

}
