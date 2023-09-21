package loja;

public class Dvd extends Produto {
  private float duracao;

  public Dvd(String nome, float preco, float duracao) {
    super(nome, preco);
    this.duracao = duracao;
  }

  @Override
  public String toString() {
    return "Nome:" + this.nome + " Preço: " + this.preco + " Duração: " + this.duracao;
  }

}
