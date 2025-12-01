import java.util.Arrays;
public class Main {
    public static Comparable[] MaxAndMin(Comparable[] array) throws Exception {
        if (array.length > 1) {
            Arrays.sort(array, 0, array.length - 1);
            return new Comparable[] {array[array.length - 1], array[0]};
        }
        else {
            throw new Exception("В массиве недостаточно элементов для сортировки");
        }
    }
    
    public static void main(String args[]) {
        int[] integers = {2, 1, 5, 8, 9, 3};
        System.out.println(toString(MaxAndMin(integers)));
    }
}
