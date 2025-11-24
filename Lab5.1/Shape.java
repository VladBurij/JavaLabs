public abstract class Shape implements Comparable<Shape>{

    public abstract double getVolume();

    @Override
    public int compareTo(Shape other) {
        if (this.getVolume() > other.getVolume()) {
            return 1;
        }
        else if (this.getVolume() == other.getVolume()) {
            return 0;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString(){
        return "Геометрическая фигура с объёмом " + getVolume();
    }
}