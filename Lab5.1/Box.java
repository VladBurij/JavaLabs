import java.util.ArrayList;

public class Box extends Shape {
    private ArrayList<Shape> shapes = new ArrayList<>();
    private double volume = 0;

    Box(double vol){
        volume = vol;
    }

    public boolean add(Shape obj){
        double now_volume = 0;
        for (int i = 0; i < shapes.size(); i++) {
            now_volume += shapes.get(i).getVolume();
        }
        if (now_volume + obj.getVolume() <= volume) {
            shapes.add(obj);
        }
        return now_volume + obj.getVolume() <= volume;
    }

    public void PrintList(){
        System.out.println("Фигуры в коробке:");
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(i + 1 + ") " + shapes.get(i).toString());
        }
    }

    @Override
    public double getVolume(){
        return volume;
    }

    @Override
    public String toString(){
        double now_volume = 0;
        for (int i = 0; i < shapes.size(); i++) {
            now_volume += shapes.get(i).getVolume();
        }
        return "Коробка с объёмом " + volume + ". Кол-во фигур в ней: " + shapes.size() + ", занимающие объём: " + now_volume;
    }
}
