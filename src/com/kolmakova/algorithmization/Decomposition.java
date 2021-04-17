package com.kolmakova.algorithmization;

import com.kolmakova.utils.ConsoleUtils;

public class Decomposition {

    public void solveTheEquation(int a, int b) {
        int lcm = (a * b) / gcd(a, b);
        System.out.println("The smallest common multiple " + lcm);
        System.out.println("The greatest common divisor " + gcd(a, b));
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public void getGcdForFour(int a, int b, int c, int d) {
        int gcdAB = gcd(a, b);
        int gcdCD = gcd(c, d);
        int gcdABCD = gcd(gcdAB, gcdCD);

        System.out.printf("The greatest common divisor among numbers %d, %d, %d, %d : %d", a, b, c, d, gcdABCD);
        System.out.println();
    }

    public void getAreaOfHexagon(double a) {
        double s = getAreaOfTriangle(a) * 6;
        System.out.printf("Area of the hexagon with side %f : %f", a, s);
        System.out.println();
    }

    private double getAreaOfTriangle(double a) {
        return (3 * Math.sqrt(3) / 2) * Math.pow(a, 2);
    }

    public void getDistanceFromPoints(int n) {
        int[] x = new int[n];
        ConsoleUtils.fillArrayRandom(x, 10);

        int[] y = new int[n];
        ConsoleUtils.fillArrayRandom(y, 16);

        for (int i = 0; i < n; i++) {
            System.out.printf("Point %d: [%d;%d]", i + 1, x[i], y[i]);
            System.out.println();
        }
        System.out.println();

        int firstPoint = getMaxDistanceBetweenPoints(x,y,0);
        int secondPoint = getMaxDistanceBetweenPoints(x,y,1);

        System.out.println("Maximum distance between points " + firstPoint + " and " + secondPoint);
    }

    private int getMaxDistanceBetweenPoints(int[] x, int[] y, int numberOfOperation) {
        double mx = Math.sqrt(Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2));
        int imx = 0;
        int jmx = 1;
        for (int i = 1; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2)) > mx) {
                    mx = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    imx = i + 1;
                    jmx = j + 1;
                }
            }
        }
        if (numberOfOperation == 0) return imx;
        else return jmx;
    }

    public void getNumberBeforeMaximum(int n) {
        int[] array = new int[n];
        ConsoleUtils.fillArrayRandom(array, 10);

        ConsoleUtils.printIntArray("The array:", array);
        System.out.println("The max number: " + findMax(array));

        int max = array[0];
        for (int j : array) {
            if ((j != findMax(array)) && (j > max)) max = j;
        }

        System.out.println("Number less than max and bigger than others: " + max);
    }

    private int findMax(int[] array) {
        int max = array[0];

        for (int j : array)
            if (j > max) max = j;

        return max;
    }

    public void findMutuallyPrimeNumbers(int a, int b, int c) {
        System.out.printf("Numbers: %d, %d, %d", a, b, c);

        if ((gcd(a, b) == 1) && (gcd(a, c) == 1) && gcd(c, b) == 1)
            System.out.println("This numbers is mutually prime");
        else System.out.println("This numbers is not mutually prime");
    }

    public void getFactorialSum() {
        int last = 9;
        int sum = 0;

        for (int i = 1; i <= last; i += 2)
            sum += getFactorial(i);

        System.out.println("Sum of factorials of odd numbers in range [1..9]: " + sum);
    }

    public int getFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++)
            factorial = factorial * i;

        return factorial;
    }

    public void getSum() {
        int[] array = new int[6];
        ConsoleUtils.fillArrayRandom(array, 10);

        ConsoleUtils.printIntArray("The array:", array);

        int sum1 = getSumOfThree(array, 0, 2);
        System.out.println("Sum of elements 1..3 = " + sum1);
        int sum2 = getSumOfThree(array, 2, 4);
        System.out.println("Sum of elements 3..5 = " + sum2);
        int sum3 = getSumOfThree(array, 3, 5);
        System.out.println("Sum of elements 4..6 = " + sum3);
    }

    private int getSumOfThree(int[] array, int k, int m) {
        int sum = 0;
        for (int i = k; i <= m; i++) {
            sum += array[i];
        }
        return sum;
    }

    public void getSquareOfQuadrilateral(int x, int y, int z, int t) {
        System.out.printf("The sides: x=%d, y=%d, z=%d, t=%d", x, y, z, t);
        System.out.println();

        double diagonal = Math.sqrt(x * x + y * y);
        double sumOfCathets = Math.pow(x, 2) + Math.pow(y, 2);
        if (Math.pow(diagonal, 2) == (int) sumOfCathets) {
            double s = getSquareOfRectangularQuadrilateral(x, y, z, t);
            System.out.println("The square of quadrilateral: " + s);
        } else System.out.println("A quadrilateral has no straight angles!");
    }

    private double getSquareOfRectangularQuadrilateral(int x, int y, int z, int t) {
        double diagonal = Math.sqrt(x * x + y * y);
        double square1 = x * y * 0.5;
        double square2 = 0.25 * Math.sqrt((diagonal + z + t) * (diagonal + z - t) * (diagonal + t - z) * (z + t - diagonal));
        return square1 + square2;
    }

    public void writeDigitsOfNumberIntoArray(int number) {
        System.out.println("The number: " + number);

        String s = Integer.toString(number);

        int[] array = new int[s.length()];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = number % 10;
            number = number / 10;
        }

        ConsoleUtils.printIntArray("Digits of this number write into array: ", array);
    }

    public void compareLengthOfNumbers(int number1, int number2) {
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        int length1 = Integer.toString(number1).length();
        int length2 = Integer.toString(number2).length();

        if (length1 > length2) {
            System.out.printf("Length of number %d is bigger than %d", number1, number2);
            System.out.println();
        } else if (length1 < length2) {
            System.out.printf("Length of number %d is bigger than %d", number2, number1);
            System.out.println();
        } else System.out.println("Length of number is equals");
    }

    public void createArrayOfSpecialNumbers(int n, int k, int quantityOfNumbers) {
        int[] array = new int[quantityOfNumbers];

        for (int i = 0; i < array.length; i++) {
            while (true) {
                int number = (int) (Math.random() * 100) + 10;
                if ((getSumOfDigits(number) == k) && (number < n)) {
                    array[i] = number;
                    break;
                }
            }
        }

        System.out.printf("The array with number, the sum of the digits of which = %d and less than %d:", k, n);
        ConsoleUtils.printIntArray("", array);
    }

    private int getSumOfDigits(int number) {
        int i = 0;
        int sum = 0;
        String s = Integer.toString(number);

        while (i != s.length()) {
            sum = sum + (number % 10);
            number = number / 10;
            i++;
        }
        return sum;
    }

    public void getTwins(int n) {
        int last = n * 2;
        System.out.printf("All 'twins' in the range [ %d ; %d ] : ", n, last);
        System.out.println();

        do {
            System.out.println(n + " and " + (n + 2) + ";");
            n++;
        } while (n < last - 1);
    }

    public void getArmstrongNumbers(int k) {
        System.out.print("All Armstrong numbers from 1 to " + k + " : ");
        int number = 1;

        do {
            if (checkNumbersForBeArmstrong(number)) System.out.print(number + " ");
            number++;
        } while (number <= k);
        System.out.println();
    }

    private boolean checkNumbersForBeArmstrong(int number) {
        double sqr = Math.pow(getSumOfDigits(number), Integer.toString(number).length());
        return sqr == number;
    }

    public void getIncreasingSequence(int n) {
        System.out.print("Increasing sequence : ");
        for (double i = Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            if (checkNumberForIncreasing(i) == 0) System.out.print((int) i + ", ");
        }
        System.out.println();
    }

    private int checkNumberForIncreasing(double number) {
        double number1 = 0;
        double number2;
        int check = 0;

        for (int i = 0; i <= Double.toString(number).length(); i++) {
            if (i == 0) {
                number2 = number % 10;

            } else {
                number2 = number1;
            }
            number = number / 10;
            number1 = number % 10;
            if (number2 < number1) {
                check = 1;
                break;
            }
        }
        return check;
    }

    public void getSumOfOddNumbers(int n) {
        int sum = 0;
        double start = Math.pow(10, n - 1);

        for (double i = start; i < Math.pow(10, n); i++) {
            if (checkNumberForOddDigits((int) i) == 0) {
                sum = sum + (int) i;
            }
        }
        System.out.println("Sum of the all numbers with odd digits: " + sum);
        System.out.print("Even digits int the sum: ");
        int count = 0;

        do {
            int number1 = sum % 10;
            sum = sum / 10;
            if (number1 % 2 == 0) {
                System.out.print(number1 + ", ");
                count++;
            }
        } while (sum > 0);
        if (count == 0) System.out.println("there is no even digits in the sum");
    }

    private int checkNumberForOddDigits(int number) {
        int check = 0;

        do {
            int number1 = number % 10;
            number = number / 10;

            if (number1 % 2 == 0) {
                check = 1;
                break;
            }
        } while (number > 0);

        return check;
    }

    public void subtractSumOfDigitsFromNumber(int number) {
        System.out.println("The number: " + number);
        System.out.println();

        int count = 0;
        while (number != 0) {
            int sum = getSumOfDigits(number);
            int buf = number;
            number = number - sum;
            System.out.printf("new number = %d - %d = %d", buf, sum, number);
            System.out.println();
            count++;
        }

        System.out.println();
        System.out.println("Count of operations: " + count);
    }
}

