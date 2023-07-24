import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Shape {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double sideLength, String shape) {
        if (shape.equalsIgnoreCase("square")) {
            return sideLength * sideLength;
        } else {
            return 0.0; // Return 0 for unsupported shapes
        }
    }
}

public class Overload {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Shape shape = new Shape();

            System.out.print("Enter the radius of the circle: ");
            double radius = Double.parseDouble(reader.readLine());
            double circleArea = shape.calculateArea(radius);
            System.out.println("Area of the circle: " + circleArea);

            System.out.print("Enter the side length of the square: ");
            double sideLength = Double.parseDouble(reader.readLine());
            double squareArea = shape.calculateArea(sideLength, "square");
            System.out.println("Area of the square: " + squareArea);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
