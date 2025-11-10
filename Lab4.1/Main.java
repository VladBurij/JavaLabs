import java.util.ArrayList;
import java.util.Random;
public class Main
{
  public static void main(String[] args)
  {
    ArrayList<Triangle> triangleList = new ArrayList<>(10);
    int err = 0;
    int i = 0;
    while (i < 10) {
      try {
        triangleList.add(new Triangle(Math.random() * 10, Math.random() * 10, Math.random() * 10));
        i++;
      } catch (IllegalTriangleException e) {
        System.out.println(e);
        err++;
      }
    }
    System.out.println("Массив из 10 случайных треугольников создан.");
    System.out.println("Всего неудачных попыток: " + err);
    
    int good = 0;
    int bad_m = 0;
    int bad_t = 0;
    for (int n = 0; n < 25; n++) {
      try {
        Bank.approveLoan(new LoanRequest(new Random().nextInt(100000), new Random().nextInt(36)));
        good++;
      } catch (InvalidAmountException e) {
        bad_m++;
      } catch (InvalidTermException e) {
        bad_t++;
      }
    }
    System.out.println("Из 25 заявок на кредиты:");
    System.out.println("Принято - " + good);
    System.out.println("Отклонено из-за маленькой суммы - " + bad_m);
    System.out.println("Отклонено из-за малого периода возрата - " + bad_t);
  }
}