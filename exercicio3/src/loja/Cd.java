package loja;

public class Cd extends Produto {
  private int nFaixas;

  public Cd(String nome, float preco, int nFaixas) {
    super(nome, preco);
    this.nFaixas = nFaixas;
  }

  @Override
  public String toString() {
    return "Nome:" + this.nome + " Preço: " + this.preco + " faixas: " + this.nFaixas;
  }
}
