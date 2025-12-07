public class Fraction implements Comparable<Fraction>, Comparator<Fraction>{ {
    private int numerator = 1;
    private int denominator = 1;
  
    public Fractions(int num, int den) {
        numerator = num;
        denominator = dem;
    }
    
    public int getNum() {
        return numerator;
    }
    
    public int getDen() {
        return denominator;
    }
    
    @Override
    public int compareTo(Fraction f) {
        return this.numerator/this.denominator - s.getNum()/s.getDen();
    }
}
