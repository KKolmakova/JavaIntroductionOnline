package com.kolmakova.utils;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleUtils {
    private static final Integer SEPARATOR_LENGTH = 100;
    private static final String REMOVE_ARRAY_CHARACTERS_REGEX = "[,\\s\\[\\]]";

    public static final String SEPARATOR = ConsoleUtils.getSeparator('-', SEPARATOR_LENGTH);

    public static void printArraysHeader(String arrayNumber) {
        System.out.println(getSeparator('+', 70));
        System.out.println("+++++++++++++++++++++++ " + arrayNumber + " Dimensional Arrays +++++++++++++++++++++++");
        System.out.println(getSeparator('+', 70));
    }

    public static int readInt(String message) {
        while (true) {
            System.out.println(message);
            try {
                return new Scanner(System.in).nextInt();
            } catch (Exception ex) {
                System.err.println("Enter number!!!");
            }
        }
    }

    public static void separator(String message) {
        System.out.println();
        System.out.println(message + getSeparator('-', SEPARATOR_LENGTH));
        System.out.println();
    }

    public static void printIntArray(String message, int[] array) {
        System.out.println(message + " " + Arrays.toString(array));
    }

    public static void printDoubleArray(String message, double[] array) {
        System.out.println(message + " " + Arrays.toString(array));
    }

    public static void printIntMatrix(String message, int[][] array) {
        System.out.println(message + " ");
        for (int[] row : array) {
            for (int element : row) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }
    }

    public static void printDoubleMatrix(String message, double[][] array) {
        System.out.println(message);

        for (double[] doubles : array) {
            System.out.print("[");
            for (double element : doubles) {
                System.out.printf("%7.2f ", element);
            }
            System.out.println("]");
        }
    }

    public static String getSeparator(char symbol, int length) {
        char[] separator = new char[length];
        Arrays.fill(separator, symbol);
        return Arrays.toString(separator).replaceAll(REMOVE_ARRAY_CHARACTERS_REGEX, "");
    }
}
