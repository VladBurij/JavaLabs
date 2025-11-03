import java.util.Random;
public class Documentary extends Movie {
  public String director = "";
  
  Documentary(String name, int dur, double rait, String dir) {
    super(name, dur, rait);
    this.director = dir;
  }
  
  public String uniqueShots() {
    return "Данный фильм использует метод съёмки №" + new Random().nextInt(10);
  }
  
  public String toString() {
    return "Название: " + title + ", Продолжительность: " + duration + ", Рейтинг: " + rating + ", Режисёр: " + director;
  }
}
