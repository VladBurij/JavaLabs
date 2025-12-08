import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        ArrayList<Fraction> fractions = new ArrayList<>();
        fractions.add(new Fraction(4, 6));
        fractions.add(new Fraction(-1, 2));
        fractions.add(new Fraction(6, -2));
        fractions.add(new Fraction(4, 3));
        Comparator comp = new FractionSortMaxMin();
        Collections.sort(fractions, comp);
        System.out.println(fractions);
    }
}
