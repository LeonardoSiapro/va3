public class EntregadorDeMoto extends Entregador {

  EntregadorDeMoto(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  public int tempoDeEntrega (int tempo){
    int tempoGasto = tempo * 2;
    System.out.println("\n\nTempo gasto para entrega sera: " + tempoGasto);
    return tempoGasto;
  }
}
