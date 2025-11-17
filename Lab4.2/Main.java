public class Main {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.pop();
        st.push(3);
        st.push("Надпись");
        System.out.println(st.search(4));
        System.out.println(st.search("Надпись"));
        MyStack cars = new MyStack();
        cars.push(new Vehicle("Автомобиль", 100, 15000, 340));
        cars.push(new Vehicle("Автомобиль", 100, 15000, 340));

        cars.pushWithRepeat(new Vehicle("Автомобиль", 100, 15000, 340));
        cars.search(new Vehicle("Автомобиль", 100, 15000, 340));
    }
}
