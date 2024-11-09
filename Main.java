import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
    }
}
/**
 * Represents a rectangle with width and height.
 */
class Rectangle {

    private double width;
    private double height;

    /**
     * Constructs a new Rectangle object with the specified width and height.
     * @param width The width of the rectangle.  Must be non-negative.
     * @param height The height of the rectangle. Must be non-negative.
     * @throws IllegalArgumentException if width or height is negative.
     */
     Rectangle(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Width and height must be non-negative.");
        }
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     * @return The area of the rectangle.
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * @return The perimeter of the rectangle.
     */
    public double getPerimeter() {
        return 2 * (width + height);
    }
}


/**
 * Represents a circle with a radius.
 */
class Circle {
    private double radius;

    /**
     * Constructs a new Circle object with the specified radius.
     * @param radius The radius of the circle. Must be non-negative.
     * @throws IllegalArgumentException if radius is negative.
     */
    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be non-negative.");
        }
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     * @return The area of the circle.
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the circumference of the circle.
     * @return The circumference of the circle.
     */
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
