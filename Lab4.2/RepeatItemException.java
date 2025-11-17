public class RepeatItemException extends Exception {
    public Object obj = null;

    public RepeatItemException(Object o) {
        super("Объект дублируется в массиве");
        this.obj = o;
    }
}