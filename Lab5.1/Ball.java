public class Ball extends SolidOfRevolution {
    
    Ball(double r) {
        super(r);
    }

    @Override
    public double getVolume(){
        return (4 / 3) * Math.PI * Math.pow(this.getRadius(), 3);
    }

    @Override
    public String toString(){
        return "Шар с радиусом " + this.getRadius() + ", объёмом " + getVolume();
    }
}