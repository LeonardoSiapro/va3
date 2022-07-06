public class EntregadorDeBike extends Entregador {

  EntregadorDeBike(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }
  
  public int tempoDeEntrega (int tempo){
    int tempoGasto = tempo * 4;
    System.out.println("\n\nTempo gasto para entrega sera: " + tempoGasto);
    return tempoGasto;
  }
}
