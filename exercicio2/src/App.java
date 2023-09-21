import banco.Conta;
import banco.ContaEspecial;
import banco.SaldoInsuficienteExeption;

public class App {
    public static void main(String[] args) throws Exception {
        Conta c = new Conta("Fulano");
        ContaEspecial c2 = new ContaEspecial("Johann");

        c.deposito(1000);
        c2.deposito(1000);

        try {
            c.saque(200);
            c2.saque(200);
        } catch (SaldoInsuficienteExeption e) {
            System.out.println("Saldo insuficiente!");
        }
        System.out.println(c.getProprietario() + ": " + c.getSaldo());

        System.out.println(c2.getProprietario() + ": " + c2.getSaldo());
    }
}
