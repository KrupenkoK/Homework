package HomeWork12;

import java.util.Scanner;

public class PhoneNumberValidator {
    public static void validator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the phone number:");
        String number = scanner.next();
        if ((number.length() > 13) || (number.length() < 10) || (number.matches("[\\D]+"))) {
            System.out.println("Number is not correct!");
        } else {
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                if (Character.isDigit(number.charAt(i)))
                    sum += Integer.parseInt(Character.toString(number.charAt(i)));
            }
            System.out.println("Sum of number = " + sum);

            String resSum = String.valueOf(sum);
            int sum1 = 0;
            while (resSum.length() > 1) {
                sum1 = 0;
                for (int j = 0; j < resSum.length(); j++) {
                    sum1 += Integer.parseInt(Character.toString(resSum.charAt(j)));
                }
                resSum = Integer.toString(sum1);
                System.out.println("Sum of values = " + resSum);
            }
        }
    }
}

