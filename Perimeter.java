interface Shape {
    double calculatePerimeter();
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Perimeter {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        double squarePerimeter = square.calculatePerimeter();
        System.out.println("Perimeter of the square: " + squarePerimeter);

        Circle circle = new Circle(3.0);
        double circlePerimeter = circle.calculatePerimeter();
        System.out.println("Perimeter of the circle: " + circlePerimeter);
    }
}
