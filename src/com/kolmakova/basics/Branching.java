package com.kolmakova.basics;

public class Branching {

    public void inspectTriangle(float angle1, float angle2) {
        float angle3 = 180 - (angle1 + angle2);
        float sumOfAngle = angle1 + angle2 + angle3;
        System.out.printf("angle 1 = %f, angle 2 = %f \n", angle1, angle2);

        boolean triangleExists = (sumOfAngle == 180) && (angle1 != 0) && (angle2 != 0) && (angle3 != 0);
        boolean rectangleTriangle = (angle1 == 90) || (angle2 == 90) || (angle3 == 90);

        if (triangleExists) {
            if (rectangleTriangle) {
                System.out.println("A triangle with such angles exists, it is rectangular");
            } else {
                System.out.println("A triangle with such angles exists");
            }
        } else {
            System.out.println("A triangle with such angles not exists");
        }
    }

    public void findMax(int a, int b, int c, int d) {
        System.out.printf("a = %d, b = %d, c = %d, d = %d \n", a, b, c, d);
        System.out.println("Minimum of a & b = " + Math.min(a, b));
        System.out.println("Minimum of c & d = " + Math.min(c, d));
        System.out.printf("The maximum of %d & %d = %d \n", Math.min(a, b), Math.min(c, d), Math.max(Math.min(a, b), Math.min(c, d)));
    }

    public void compareCoordinates(int x1, int y1, int x2, int y2, int x3, int y3) {
        System.out.printf("(%d;%d) (%d;%d) (%d;%d) \n", x1, y1, x2, y2, x3, y3);
        boolean allXAreEquals = (x1 == x2) && (x2 == x3);
        boolean allYAreEquals = (y1 == y2) && (y2 == y3);
        if (allXAreEquals || allYAreEquals) {
            System.out.println("Points are located on one straight line");
        } else {
            System.out.println("Points are not located on one straight line");
        }
    }

    public void inspectBrick(int a, int b, int x, int y, int z) {
        System.out.printf("Hole parameters: %d, %d \n", a, b);
        System.out.printf("Brick parameters: %d, %d, %d \n", x, y, z);
        if (brickPassIntoHole(a, b, x, y, z)) {
            System.out.println("A brick with such parameters will pass through the hole");
        } else {
            System.out.println("A brick with such parameters will not pass through the hole");
        }
    }

    public void calculateFunctionValue(int x) {
        double f;
        System.out.println("x = " + x);

        if (x <= 3) {
            f = Math.pow(x, 3) - 3 * x + 9;
            System.out.println("Fx = x^3 - 3 * x + 9 = " + f);
        } else {
            f = 1 / (Math.pow(x, 3) + 6);
            System.out.println("Fx = x^3 + 6 = " + f);
        }
    }

    private boolean brickPassIntoHole(int a, int b, int x, int y, int z) {
        return
                x <= a && y <= b || y <= a && x <= b ||
                        x <= a && z <= b || z <= a && x <= b ||
                        z <= a && y <= b || y <= a && z <= b;
    }
}
