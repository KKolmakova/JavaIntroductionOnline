package com.kolmakova.basics;

import com.kolmakova.utils.ConsoleUtils;

import java.util.ArrayList;
import java.util.List;

public class Loop {

    private static final String SQUARE_BRACKETS_REGEX = "^\\[|\\]$";

    public void countSimpleOperations() {
        int sum = 0;
        int number;

        do {
            number = ConsoleUtils.readInt("Enter enter a positive number: ");
        } while (number < 1);

        for (byte i = 0; i <= number; i++) {
            sum = sum + i;
        }

        System.out.printf("Sum of numbers from 1 to %d = %d \n", number, sum);

        double sumOfSquares = 0;
        for (byte i = 1; i <= 100; i++) {
            sumOfSquares = sumOfSquares + Math.pow(i, 2);
        }
        System.out.println("Sum of squares of numbers from 1 to 100 = " + sumOfSquares);

        double multiplyOfSquares = 1;
        for (int i = 1; i <= 200; i++) {
            multiplyOfSquares = multiplyOfSquares * Math.pow(i, 2);
        }
        System.out.println("Multiply of squares of numbers from 1 to 200 = " + multiplyOfSquares);
    }

    public void getFunctionValue(int a, int b, int h) {
        int x = a;
        int y;
        while (x <= b) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.printf("Function y(x = %d) = %d \n", x, y);
            x = x + h;
        }
    }

    public void sumNumberSeries(int n, int e) {
        double sum = 0.0;

        System.out.print("The sum of the members of a number series = ");
        for (int i = 1; i <= n; i++) {
            double an = 1 / Math.pow(i, 2) + 1 / Math.pow(i, 3);
            if (Math.abs(an) <= e) {
                System.out.print(an + " + ");
                sum += an;
            }
        }
        System.out.println(" = " + sum);
    }

    public void findDivisors(int m, int n) {
        int divisors = 0;
        System.out.printf("The interval [%d,%d] \n", m, n);
        System.out.println("Divisors: ");
        for (int i = m; (m <= i) && (i <= n); i++) {
            System.out.print(i + ":");
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    System.out.print(" " + j + " ");
                    divisors = 1;
                }
            }
            if (divisors == 0) {
                System.out.print(" There is no divisors");
            }
            System.out.println();
            divisors = 0;
        }
    }

    public void printDuplicateDigits(long number1, long number2) {
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        List<Long> numbers = new ArrayList<>();

        long numberToSearch;

        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        while (number1 > 0) {
            numberToSearch = number1 % 10;
            number1 = number1 / 10;
            while (number2 > 0) {
                if (number2 % 10 == numberToSearch) {
                    if (!numbers.contains(numberToSearch)) {
                        numbers.add(numberToSearch);
                    }
                    break;
                }
                number2 = number2 / 10;
            }
        }
        System.out.println("General figures: " + numbers.toString().replaceAll(SQUARE_BRACKETS_REGEX, ""));
    }

    public void printASCIISymbols() {
        System.out.println("Correspondence between symbols and their numerical designations in computer memory: ");
        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }
    }
}
