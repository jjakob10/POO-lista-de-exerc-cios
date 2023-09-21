package cartesiano;

public class Ponto {
  private double X;

  private double Y;

  public Ponto(double X, double Y) {
    this.X = X;
    this.Y = Y;
  }

  public double getY() {
    return Y;
  }

  public double getX() {
    return X;
  }

  public double distancia(Ponto p2) {
    return Math
        .sqrt((X - p2.getX()) * (X - p2.getX()) + (Y - p2.getY()) * (Y - p2.getY()));

  }

}
