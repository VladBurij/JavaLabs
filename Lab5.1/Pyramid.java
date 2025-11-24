public class Pyramid extends Shape{
    private double height = 0;
    private double space = 0;
    
    Pyramid(double h, double s) {
        height = h;
        space = s;
    }
    
    public double getHeight() {
        return height;
    }
    public double getSpase() {
        return space;
    }

    @Override
    public double getVolume() {
        return height * space / 3;
    }

    @Override
    public String toString(){
        return "Пирамида с высотой " + height + ", площадью основания " + space + ", объёмом " + getVolume();
    }
}