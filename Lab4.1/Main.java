public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Triangle> triangleList = new ArrayList<>(10);
        int err = 0;
        int i = 0;
        System.out.println("Массив из 10 случайных треугольников создан.");
        while (i <= 10) {
            try {
                triangleList.add(new Triangle(Math.random() * 10, Math.random() * 10, Math.random() * 10));
                i++;
            } catch (IllegalTriangleException e) {
                err++;
            }
        }
        System.out.println("Массив из 10 случайных треугольников создан.");
        System.out.println("Всего неудачных попыток: " + err);
    }
}
