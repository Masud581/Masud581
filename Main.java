abstract class Shape {
    abstract double calculateArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5.0);
        double squareArea = square.calculateArea();
        System.out.println("Area of the square: " + squareArea);

        Shape circle = new Circle(3.0);
        double circleArea = circle.calculateArea();
        System.out.println("Area of the circle: " + circleArea);
    }
}
