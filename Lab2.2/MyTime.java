public class MyTime {
  private int hour = 0;
  private int minute = 0;
  private int second = 0;
    
  MyTime() {
    hour = (int)(System.currentTimeMillis() / 3600000);
    minute = (int)(System.currentTimeMillis() % 3600000 / 60000);
    second = (int)(System.currentTimeMillis() % 3600000 % 60000 / 1000);
  }
    
  MyTime(long ms) {
    hour = (int)(ms / 3600000);
    ms %= 3600000;
    minute = (int)(ms / 60000);
    ms %= 60000;
    second = (int)(ms / 1000);
  }
    
  MyTime(int h, int m, int s) {
    hour = h;
    minute = m;
    second = s;
  }
    
  public int getHour() {
    return hour;
  }
  
  public int getMinute() {
    return minute;
  }
  
  public int getSecond() {
    return second;
  }
  
  public void setTime(long ms) {
    hour = (int)(ms / 3600000);
    ms %= 3600000;
    minute = (int)(ms / 60000);
    ms %= 60000;
    second = (int)(ms / 1000);
  }
}
