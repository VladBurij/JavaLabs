public class Main
{
	public static void main(String[] args) {
		double[][] numbers = {{23, 41}, {15, 105}, {-5, 1}};
	
	Location loc = Location.locateLargest(numbers);
	System.out.println("Наибольшее значение: " + loc.maxValue +" на позиции [" + loc.row + ", " + loc.column + "]");
	}
}
