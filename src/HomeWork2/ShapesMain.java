package HomeWork2;

public class ShapesMain {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.calculateSquare();
        circle.calculatePerimetr();

        Shape square = new Square();
        square.calculateSquare();
        square.calculatePerimetr();

        Shape triangle = new Triangle();
        triangle.calculateSquare();
        triangle.calculatePerimetr();

        Shape rectangle = new Rectangle();
        rectangle.calculateSquare();
        rectangle.calculatePerimetr();
    }
}
