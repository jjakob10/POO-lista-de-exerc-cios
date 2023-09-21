package banco;

public class ContaEspecial extends Conta {

  public ContaEspecial(String nome) {
    super(nome);
  }

  @Override
  public void saque(double valor) throws SaldoInsuficienteExeption {
    if (valor * 1.001 <= this.saldo)
      this.saldo -= valor * 1.001;
    else
      throw new SaldoInsuficienteExeption();
  }
}
