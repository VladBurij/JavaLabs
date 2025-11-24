public class Cylinder extends SolidOfRevolution {
    private double height = 0;
    
    Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }
    
    public double getHeight() {
        return height;
    }

    @Override
    public double getVolume(){
        return height * Math.PI * Math.pow(this.getRadius(), 2);
    }

    @Override
    public String toString(){
        return "Цилиндр с радиусом " + this.getRadius() + ", высотой " + height + ", объёмом " + getVolume();
    }
}