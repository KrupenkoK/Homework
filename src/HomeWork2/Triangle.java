package HomeWork2;

public class Triangle extends AbstractShape {

    @Override
    public double calculateSquare() {
        double side1 = (a * b)/2;
        System.out.println("Площадь треугольника: " +side1);
        return side1;
    }

    @Override
    public double calculatePerimetr() {
        double side2 = a + b + Math.sqrt(a * a + b * b);
        System.out.println("Периметр треугольника: " +side2);
        return side2;

    }
}