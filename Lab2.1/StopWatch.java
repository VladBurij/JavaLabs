import java.util.GregorianCalendar;
public class StopWatch {
	private long startTime = 0L;
	private long endTime = 0L;
	
	StopWatch() {
	    startTime = System.nanoTime();
	}
	
	long getStartTime() {
	    return startTime;
	}
	long getEndTime() {
	    return endTime;
	}
	
	void start() {
	    startTime = System.nanoTime();
	}
	void stop() {
	    endTime = System.nanoTime();
	}
	
	long getElapsedTime() {
	    return (endTime - startTime) / 1000000;
	}
}