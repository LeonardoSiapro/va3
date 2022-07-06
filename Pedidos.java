import java.util.*;

public class Pedidos {
  int id;
  List<Produto> produto = new ArrayList<>();
  Entregador entregador;
  float total = 0;

  Pedidos(int id){
    this.id = id;
  }

  public void setEntregadorDeBike(String nome, int idade){
    entregador = new EntregadorDeBike(nome, idade);
  }

  public void setEntregadorDeMoto(String nome, int idade){
    entregador = new EntregadorDeMoto(nome, idade);
  }

  public void setEntregadorDeDrone(String nome, int idade){
    entregador = new EntregadorDeDrone(nome, idade);
  }

  public void addProduto (String nome, float valor, String nomeLoja, int distancia, String endereco){
    produto.add(new Produto(nome, valor));
    Produto x = produto.get(produto.size() -1);
    x.setLoja(nomeLoja, distancia, endereco);
  }

  public void exibirPedido() {
    System.out.println("\n\n-----Pedido nº: " + id + "---------");
    System.out.println("Entregador: " + entregador.nome);
    System.out.println("Lista de Produtos: ");
    produto.forEach(p -> {
      System.out.println(p.nome);
    });
    entregador.tempoDeEntrega(produto.get(0).loja.distancia);
    System.out.println("Valor Total do pedido: " + calcularTotal());
  }

  public float calcularTotal (){
    total = 0;
    produto.forEach(p -> {
      this.total = total + p.valor;
    });
    return total;
  }
}
