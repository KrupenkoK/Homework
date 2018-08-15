package HomeWork2;

import java.util.Random;

public abstract class AbstractShape implements Shape {
    Random random = new Random();

    public double a = generationDouble();

    public double b = generationDouble();

    public double generationDouble() {
        double  j= random.nextDouble();
        return j;
    }
}
