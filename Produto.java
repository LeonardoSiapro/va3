public class Produto {
  String nome;
  Loja loja;
  float valor;

  Produto(String nome, float valor) {
    this.nome = nome;
    this.valor = valor;
  }

  public void setLoja (String nome, int distancia, String endereco){
    loja = new Loja(nome, distancia, endereco);
  }
}
