class Rectangle {
  double width = -1;
  double height = -1;
  
  Rectangle() {
    width = -1;
    height = -1;
  }

  Rectangle(double x, double y) {
    width = x;
    height = y;
  }

  double getArea() {
    return width * height;
  }

  double getPerimeter() {
    return 2 * (width + height);
  }
}