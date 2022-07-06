import java.util.*;


public class Cliente {
  String nome;
  List<Pedidos> pedidos = new ArrayList<>();
  float total = 0;

  Cliente(String nome) {
    this.nome = nome;
  }

  public void relatorio (){
    System.out.println("\n\n-----Relatorio de Pedido-----");
    pedidos.forEach(p -> {
      p.exibirPedido();
    });
  }

  public void dinheiroGasto () {
    total = 0;
    pedidos.forEach(p -> {
      total += p.calcularTotal();
    });
    System.out.println("Total gasto foi de: " + total);
  }

  public void addPedido (int id) {
    pedidos.add(new Pedidos(id));
  }

  public void addProdutoNoPedido(int id, String nome, float valor, String nomeLoja, int distancia, String endereco) {
    Pedidos x = pedidos.get(id-1);
    x.addProduto(nome, valor, nomeLoja, distancia, endereco);
  }

  public void setEntregadorDeBike(int id, String nome, int idade) {
    Pedidos x = pedidos.get(id-1);
    x.setEntregadorDeBike(nome, idade);
  }
  public void setEntregadorDeMoto(int id, String nome, int idade) {
    Pedidos x = pedidos.get(id-1);
    x.setEntregadorDeMoto(nome, idade);
  }
  public void setEntregadorDeDrone(int id, String nome, int idade) {
    Pedidos x = pedidos.get(id-1);
    x.setEntregadorDeDrone(nome, idade);
  }
}
