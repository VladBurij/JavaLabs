public class Triangle {
    public double A = 0;
    public double B = 0;
    public double C = 0;

    Triangle() {
        A = 1;
        B = 1;
        C = 1;
    }

    Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
        try {
            if (s1 >= s2 + s3 || s2 >= s1 + s3 || s3 >= s1 + s2) {
                throw new IllegalTriangleException("Треугольник с такими сторонами не может сущестовать. Длина каждой стороны не должна превышать сумму двух других.")
            }
            else {
                A = s1;
                B = s2;
                C = s3;
            }
        }
    } 
}
