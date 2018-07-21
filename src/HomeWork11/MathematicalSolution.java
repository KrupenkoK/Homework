
package HomeWork11;

import java.util.Random;

public class MathematicalSolution {


    public static void average() {
        Random rn = new Random();
        int[] numbers = new int[10];
        int result = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = rn.nextInt(10);
            result = result + numbers[i];
        }
        result = result / 10;
        System.out.println("Среднее арифметическое:" + result); //Среднее аврефметическое
    }

    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i<=n; i++){
            result = result*i;
        }
        return result;
    }
    public static void factor() {
        System.out.println("Факториал 10 = " + factorial(10));  //факториал числа
    }

    public static void fibon(){

        int n0 = 1, n1 = 1, n2;
        System.out.print(n0+" "+n1+" ");
        for(int i = 0; i < 10; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println(); //Ряд Фибоначчи
    }
}
