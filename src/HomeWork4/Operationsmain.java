package HomeWork4;

import java.util.HashSet;
import java.util.Set;

public class Operationsmain {
    public static void main(String[] args) {
        Collections setClass = new Collections();

        Set<Integer> setA = new HashSet<>();
        setA.add(5);
        setA.add(3);
        setA.add(65);
        setA.add(425);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(698);
        setB.add(149);
        setB.add(488);

        System.out.println("equals: " + setClass.equals(setA, setB));
        System.out.println("union: " + setClass.union(setA, setB));
        System.out.println("subtract: " + setClass.subtract(setA, setB));
        System.out.println("intersect: " + setClass.intersect(setA, setB));
        System.out.println("symmetricSubtract: " + setClass.symmetricSubtract(setA, setB));
    }
}