import java.util.GregorianCalendar;
public class Main {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println("Текущая дата: " + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" + (calendar.get(GregorianCalendar.MONTH) + 1) + "/" + calendar.get(GregorianCalendar.YEAR));
		calendar.setTimeInMillis(1234567898765L);
		System.out.println("Другая дата: " + calendar.get(GregorianCalendar.DAY_OF_MONTH) + "/" + calendar.get(GregorianCalendar.MONTH) + 1 + "/" + calendar.get(GregorianCalendar.YEAR));
	
	StopWatch sec = new StopWatch();
	int[] numbers = new int[10000];
	for (int i = 9999; i >= 0; i--) {
	    numbers[i] = i;
	}
	int d;
	for (int out = 9999; out >= 1; out--) {
        for (int in = 0; in < out; in++) {
            if(numbers[in] > numbers[in + 1]) {             
                d = numbers[in];     
                numbers[in] = numbers[in + 1];
                numbers[in + 1] = d;      
            }
        }
    }
    sec.stop();
    System.out.println("Затрачено времени: " + sec.getElapsedTime() + " милисекунд");
	}
}
