package HomeWork2;

public class Circle extends AbstractShape {

    @Override
    public double calculateSquare() {
        double side1 = Math.PI * (a * a);
        //System.out.println("Площадь круга равна: " + side1);
        return side1;
    }

    @Override
    public double calculatePerimetr() {
        double side2 = Math.PI * Math.pow(a, 2);
       //System.out.println("Длины окружности равна: " + side2);
        return side2;
    }
}



