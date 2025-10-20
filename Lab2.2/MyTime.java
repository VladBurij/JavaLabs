public class MyTime {
    public int hour = 0;
    public int minute = 0;
    public int second = 0;
    
    MyTime() {
        
    }
    
    Location(int x, int y, double value) {
        row = x;
        column = y;
        maxValue = value;
    }
    
    public static Location locateLargest(double[][] a) {
        double val = -1000000;
        int r = 0;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > val) {
                    val = a[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        return new Location((r + 1), (c + 1), val);
    }
}