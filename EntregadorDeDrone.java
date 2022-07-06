public class EntregadorDeDrone extends Entregador {

  EntregadorDeDrone(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  public int tempoDeEntrega (int tempo){
    System.out.println("\n\nTempo gasto para entrega sera: " + tempo);
    return tempo;
  }
}
