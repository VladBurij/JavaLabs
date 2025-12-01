import java.util.Arrays;
public class Main {
    public static Comparable[] MaxAndMin(Comparable[] array) throws Exception {
        if (array.length > 1) {
            Arrays.sort(array, 0, array.length);
            return new Comparable[] {array[array.length - 1], array[0]};
        }
        else {
            throw new Exception("В массиве недостаточно элементов для сортировки");
        }
    }
    
    public static void main(String args[]) {
        try {
            Integer[] integers = {2, 1, 5, 8, 9, 13, -2, 3};
            Comparable[] maxmin1 = MaxAndMin(integers);
            String[] strings = {"корабль", "якорь", "листва", "акварель", "сова", "улица"};
            Comparable[] maxmin2 = MaxAndMin(strings);
            System.out.println(maxmin1[0] + ", " + maxmin1[1]);
            System.out.println(maxmin2[0] + ", " + maxmin2[1]);
        } catch (Exception e) {
            System.out.println(e);
        }

        MyStack stack1 = new MyStack();
        stack1.push(3);
        stack1.push(6);
        MyStack stack2 = stack1.clone();
        stack2.push(20);
        stack1.pop();
        System.out.println(stack1.toString());
        System.out.println(stack2.toString());
    }
}
