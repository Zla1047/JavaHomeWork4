package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients a, b, c separated by spaces: ");
        String coefficientsInput = scanner.nextLine();
        String[] coefficients = coefficientsInput.split(" ");

        double a = Double.parseDouble(coefficients[0]);
        double b = Double.parseDouble(coefficients[1]);
        double c = Double.parseDouble(coefficients[2]);

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots of the equation: x1= " + x1 + " ,x2= " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("The equation has a single root; x= " + x);
        } else {
            System.out.println("The equation has no real roots!");
        }


        System.out.println("Enter numbers separated by spaces:");
        String num = scanner.nextLine();
        String[] numbersAsString = num.split(" ");
        int[] numbers = new int[numbersAsString.length];


        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        Arrays.sort(numbers);

        System.out.println("Min number: " + numbers[0]);
        System.out.println("Max number: " + numbers[numbers.length - 1]);

        scanner.close();


        String string = "Роняє ліс багряний свій убір, Срібне мороз, що в'януло поле, Прогляне день ніби мимоволі І сховається за край окружних гір.";
        String[] value = string.split(" ");

        for (int i = 0; i < value.length; i++) {
            if (value[i].startsWith("Про")) {
                System.out.println("Result: " + value[i]);
            }
        }
    }
}