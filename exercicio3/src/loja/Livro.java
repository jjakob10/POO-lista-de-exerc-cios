package loja;

public class Livro extends Produto {
  private String autor;

  public Livro(String nome, float preco, String autor) {
    super(nome, preco);
    this.autor = autor;
  }

  @Override
  public String toString() {
    return "Nome:" + this.nome + " Preço: " + this.preco + " Autor: " + this.autor;
  }

}
