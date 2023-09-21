import cartesiano.Ponto;
import cartesiano.Triangulo;

public class App {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("São necessários 3 pontos (x y)");
            System.exit(1);
        }
        Ponto p1, p2, p3;
        try {
            p1 = new Ponto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
            p2 = new Ponto(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
            p3 = new Ponto(Double.parseDouble(args[4]), Double.parseDouble(args[5]));

            Triangulo t = new Triangulo(p1, p2, p3);

            double p = t.calculaPerimetro();
            System.out.println("O perimetro é: " + p);
        } catch (NumberFormatException e) {
            System.out.println("Todos os argumentos devem ser do tipo double");
            System.exit(1);
        }

    }
}
