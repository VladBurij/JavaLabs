import java.util.ArrayList;
public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        try {
            Object o = list.get(getSize() - 1);
            list.remove(getSize() - 1);
            return o;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив пустой, из него нельзя убрать элемент.");
            return e;
        }
    }

    public void push(Object o) {
        try {
            int detection = 0;
            for (int i = 0; i < list.size(); i++) {
                if (o.equals(list.get(i))) {
                    detection++;
                }
            }
            if (detection > 0) {
                throw new Exception("Элемент не добавлен, поскольку он уже есть в массиве.");
            }
            else {
                list.add(o);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void pushWithRepeat(Object o) { 
        list.add(o);
    }

    public boolean search(Object o) {
        try {
            if (list.isEmpty()) {
                throw new Exception("В массиве нет элементов для поиска.");
            }
            int detection = 0;
            for (int i = 0; i < list.size(); i++) {
                if (o.equals(list.get(i))) {
                    detection++;
                }
            }
            if (detection > 1) {
                throw new RepeatItemException(o);
            }
            else if (detection == 1) {
                return true;
            }
            return false;
        } catch (RepeatItemException e) {
            System.out.println(e);
            return false;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    @Override /** Переопределяет метод toString класса Object */
    public String toString() {
        return "стек: " + list.toString();
    }

}