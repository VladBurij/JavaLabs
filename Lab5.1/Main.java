public class Main {
  public static void main(String[] args) {
      Box box = new Box(500);
      box.add(new Cylinder(4, 2));
      box.add(new Ball(5));
      box.add(new Pyramid(5, 9));
      System.out.println(box.toString());
      box.PrintList();
      Pyramid p = new Pyramid(5, 9);
      System.out.println(p.toString());

      MyStack stack = new MyStack();
      stack.push(new Cylinder(2, 4));
      stack.push(new Ball(3));
      stack.push(new Pyramid(5, 49));
      stack.sort();
      System.out.println(stack.toString());
  }
}