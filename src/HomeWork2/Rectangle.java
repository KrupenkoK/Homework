package HomeWork2;

public class Rectangle extends AbstractShape {

    @Override
    public double calculateSquare() {
        double side1 = (a * b);
        System.out.println("Площадь прямоугольника: " + side1);
        return side1;
    }

    @Override
    public double calculatePerimetr() {
       double side2 = (a + b) * 2;
        System.out.println("Периметра прямоугольника: " + side2);
        return side2;
    }
}


