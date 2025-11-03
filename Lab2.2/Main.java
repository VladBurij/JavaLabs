public class Main
{
	public static void main(String[] args) {
		double[][] numbers = {{23, 41}, {15, 105}, {-5, 1}};
	
	  Location loc = Location.locateLargest(numbers);
	  System.out.println("Наибольшее значение: " + loc.maxValue +" на позиции [" + loc.row + ", " + loc.column + "]");
	  
	  MyTime time1 = new MyTime();
	  System.out.println("Прошло времени с 1 января 1970 года в часах, минутах и секундах: " + time1.getHour() +":" + time1.getMinute() + ":" + time1.getSecond());
	  MyTime time2 = new MyTime(555550000L);
	  System.out.println("В часах, минутах и секундах это будет: " + time2.getHour() +":" + time2.getMinute() + ":" + time2.getSecond());
	  MyTime time3 = new MyTime(5, 23, 55);
	  System.out.println("Часы, минуты, секунды: " + time3.getHour() +":" + time3.getMinute() + ":" + time3.getSecond());
	}
}
