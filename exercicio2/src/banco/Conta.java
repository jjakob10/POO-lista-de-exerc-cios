package banco;

public class Conta {
  private String proprietario;

  protected double saldo;

  public String getProprietario() {
    return proprietario;
  }

  public Conta(String nome) {
    proprietario = nome;
  }

  public double getSaldo() {
    return saldo;
  }

  public void deposito(double deposito) {
    this.saldo += deposito;
  }

  public void saque(double valor) throws SaldoInsuficienteExeption {
    if (valor * 1.005 <= this.saldo)
      this.saldo -= valor * 1.005;
    else
      throw new SaldoInsuficienteExeption();
  }
}
