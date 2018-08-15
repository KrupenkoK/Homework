package HomeWork2;

public class Square extends AbstractShape {

    @Override
    public double calculateSquare() {
        double side1 = a * a;
        System.out.println("Площадь квадрата: " + side1);
        return side1;
    }

    @Override
    public double calculatePerimetr() {
        double side2 = a*4;
        System.out.println("Периметра квадрата: "+side2);
        return side2;
    }
}