public class Cylinder extends SolidOfRevolution {
    private double height = 0;
    
    Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }
    
    public double getHeight() {
        return height;
    }
}