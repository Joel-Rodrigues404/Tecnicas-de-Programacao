public class Main {
    public static void main(String[] args) {
        ItemPedido produto1 = new Produto("arroz", 5);

        ItemPedido servico1 = new Servico("descricao", 5, 50);

        ProcessadorPedidos pp = new ProcessadorPedidos();

        System.out.println(pp.processar(produto1));
        System.out.println(pp.processar(servico1));

    }
}
