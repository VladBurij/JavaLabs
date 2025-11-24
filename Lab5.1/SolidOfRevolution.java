public abstract class SolidOfRevolution extends Shape {
    private double radius = 0;

    protected SolidOfRevolution(double r) {
        radius = r;
    }
    
    public double getRadius() {
        return radius;
    }

    @Override
    public String toString(){
        return "Тело впащения с радиусом " + radius + ", объёмом " + getVolume();
    }
}