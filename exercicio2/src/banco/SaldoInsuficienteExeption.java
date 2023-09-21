package banco;

public class SaldoInsuficienteExeption extends Exception {

  @Override
  public String toString() {
    return "Saldo insuficiente";
  }

}
