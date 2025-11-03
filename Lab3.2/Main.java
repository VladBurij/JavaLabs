import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<>(5);
		movieList.add(new Movie("Лучший фильм", 120, 10.0));
		movieList.add(new FeatureFilm("Хохотун", 146, 7.4, "Хоррор"));
		movieList.add(new Documentary("Жизнь птиц", 99, 8.1, "Лебовски Боб"));
		movieList.add(new FeatureFilm("Повар на заказ", 131, 6.8, "Комедия"));
		movieList.add(new Movie("Обычный фильм", 93, 7.2));
		for (Movie movie:movieList) {
		  System.out.println(movie.toString());
      if (movie instanceof Documentary) {
        System.out.println(((Documentary) movie).uniqueShots());
      }
      else if (movie instanceof FeatureFilm) {
        System.out.println("Полагаю, этот фильм жанра " + ((FeatureFilm) movie).genre + " вам зайдёт.");
      }
      else {
        System.out.println("Этот фильм не художественный и не документальный");
      }
    }
    
    double sumMiles = 0;
    ArrayList<Vehicle> vehicleList = new ArrayList<>(4);
		vehicleList.add(new Car("ТАЗ", 100, 1234, 147000, 4, 25));
		vehicleList.add(new Truck("Мэни", 95, 15002, 330000, 8000, 'С'));
		vehicleList.add(new Car("УАЗ", 120, 7064, 172000, 4, 15));
		vehicleList.add(new Truck("Мэни", 87, 2054, 400000, 10000, 'D'));
		for (Vehicle vehicle:vehicleList) {
		  if (vehicle instanceof Car) {
        System.out.println("Легковушка");
      }
      else if (vehicle instanceof Truck) {
        System.out.println("Грузовик");
      }
      else {
        System.out.println("Иное");
      }
		  System.out.println(vehicle.toString());
      System.out.println("Расход топлива составляет: " + String.format("%.3f", vehicle.calculateFuelConsumption()) + "л/км");
      sumMiles += vehicle.mileage;
    }
    System.out.println("Общий пробег автопарка: " + sumMiles + "км.");
	}
}
