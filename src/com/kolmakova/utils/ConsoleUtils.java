package com.kolmakova.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleUtils {
    private static final Integer SEPARATOR_LENGTH = 100;
    private static final String REMOVE_ARRAY_CHARACTERS_REGEX = "[,\\s\\[\\]]";

    public static final String SEPARATOR = ConsoleUtils.getSeparator('-', SEPARATOR_LENGTH);

    public static void printSections(String section) {
        System.out.println("////////////////////////////////// " + section + " //////////////////////////////////");
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

    public static void printStringArray(String message, String[] array){
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

    public static void fillArrayRandom(int[] array, int range) {
        for (int i = 0; i < array.length; i++)
            array[i] = ((int) (Math.random() * 100) + range);
    }

    public static void printArrayList(String message, List<Integer> list){
        System.out.print(message);
        for (Integer integer : list) {
            System.out.print(integer + ", ");
        }
        System.out.println();
    }
}
