class Shape{
    public double getArea() {
        return 0;
    }
}

class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}

class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
}

class areashape {
    public static void main(String args[]) {
        Shape[] shape=new Shape[2];
    }
}