public class Triangle {
  public double A;
  public double B;
  public double C;

  Triangle() {
    A = 1;
    B = 1;
    C = 1;
  }

  Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
    if (s1 >= s2 + s3) {
      throw new IllegalTriangleException("Треугольник с такими сторонами не может существовать. Длина 1-й стороны больше суммы двух других.");
    }
    else if (s2 >= s1 + s3) {
      throw new IllegalTriangleException("Треугольник с такими сторонами не может существовать. Длина 2-й стороны больше суммы двух других.");
    }
    else if (s3 >= s1 + s2) {
      throw new IllegalTriangleException("Треугольник с такими сторонами не может существовать. Длина 3-й стороны больше суммы двух других.");
    }
    else {
      A = s1;
      B = s2;
      C = s3;
    }
  }
}
