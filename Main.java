public class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Leonardo Liz");
    cliente.addPedido(1);
    float valor = (float) 35.00;
    cliente.addProdutoNoPedido(1, "Produto 1", valor, "loja 1", 100, "Rua 1");
    cliente.addProdutoNoPedido(1, "Produto 2", valor, "loja 1", 100, "Rua 1");
    cliente.addProdutoNoPedido(1, "Produto 3", valor, "loja 1", 100, "Rua 1");
    cliente.setEntregadorDeBike(1, "entregador 1", 25);

    cliente.addPedido(2);
    valor = (float) 22.55;
    cliente.addProdutoNoPedido(2, "Produto 1", valor, "loja 1", 100, "Rua 1");
    cliente.addProdutoNoPedido(2, "Produto 2", valor, "loja 1", 100, "Rua 1");
    cliente.addProdutoNoPedido(2, "Produto 3", valor, "loja 1", 100, "Rua 1");
    cliente.setEntregadorDeMoto(2, "entregador 2", 25);

    cliente.addPedido(3);
    valor = (float) 1.50;
    cliente.addProdutoNoPedido(3, "Produto 1", valor, "loja 1", 100, "Rua 1");
    cliente.addProdutoNoPedido(3, "Produto 2", valor, "loja 1", 100, "Rua 1");
    cliente.addProdutoNoPedido(3, "Produto 3", valor, "loja 1", 100, "Rua 1");
    cliente.setEntregadorDeDrone(3, "entregador 3", 25);

    cliente.relatorio();
    cliente.dinheiroGasto();
  }
}
