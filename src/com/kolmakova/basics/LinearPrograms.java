package com.kolmakova.basics;

import java.util.concurrent.TimeUnit;

public class LinearPrograms {

    public void calculateFunctionValue(int a, int b, int c, int x, int y) {
        int f1 = ((a - 3) * b) + c;
        double f2 = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        double f3 = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

        System.out.printf("a = %d, b = %d, c = %d \n", a, b, c);
        System.out.println("Z = ((a - 3) * b) + c = " + f1);
        System.out.println("f = ((b + sqrt(b^2 + 4 * a * c) / 2 * a) - a^3) * c + b^-2 = " + f2);
        System.out.printf("x = %d, y = %d \n", x, y);
        System.out.println("f = (sin(x) + cos(y) / (cos(x) - sin(y) * tan(x * y) = " + f3);
    }

    public void swapDigits(double r) {
        double reverseR = (r * 1000) % 1000 + (int) r / 1000.0;
        System.out.printf("Reverse number %f is: %f \n", r, reverseR);
    }

    public void convertSeconds(long t) {
        long hours = TimeUnit.SECONDS.toHours(t);
        long minute = TimeUnit.SECONDS.toMinutes(t) - TimeUnit.HOURS.toMinutes(hours);
        long second = TimeUnit.SECONDS.toSeconds(t) - TimeUnit.HOURS.toSeconds(hours) - TimeUnit.MINUTES.toSeconds(minute);
        System.out.printf("%d seconds there is: %d hours %d minutes %d seconds \n", t, hours, minute, second);
    }

    public void findInRange(int x, int y) {
        boolean firstRange = (-3 < x) && (x < 3) && (-4 < y) && (y < 5);
        boolean secondRange = (-5 < x) && (x < 5) && (-4 < y) && (y < 0);
        System.out.println("The point with coordinates (" + x + ";" + y + ") is belongs to the shaded area: " + (firstRange || secondRange));
    }
}
