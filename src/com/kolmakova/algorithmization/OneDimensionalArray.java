package com.kolmakova.algorithmization;

import com.kolmakova.utils.ConsoleUtils;

import java.util.Arrays;

public class OneDimensionalArray {

    public void getSumMultiplesK(int k, int[] array) {
        int sum = 0;

        ConsoleUtils.printIntArray("The array ", array);
        for (int j : array) {
            if (j % k == 0) {
                sum = sum + j;
            }
        }
        System.out.println("The sum of the numbers in the array equal to " + k + " = " + sum);
    }

    public void replaceNumberInArray(float z, double[] array) {
        int count = 0;

        ConsoleUtils.printDoubleArray("The array", array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.print("New array where elements greater than " + z + " are replaced with this number");
        ConsoleUtils.printDoubleArray("", array);
        System.out.println("Number of replaced elements: " + count);
    }

    public void countNumberOfElements(double[] array) {
        int contPositive = 0;
        int contNegative = 0;
        int countZero = 0;

        ConsoleUtils.printDoubleArray("The array", array);
        for (double v : array) {
            if (v > 0) {
                contPositive++;
            } else if (v < 0) {
                contNegative++;
            } else {
                countZero++;
            }
        }
        System.out.println("Count of positive values: " + contPositive);
        System.out.println("Count of negative values: " + contNegative);
        System.out.println("Count of zero values: " + countZero);
    }

    public void swapMinMaxValues(double[] array) {
        double max = array[0];
        double min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        ConsoleUtils.printDoubleArray("The array", array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

        array[maxIndex] = min;
        array[minIndex] = max;

        ConsoleUtils.printDoubleArray("Swap max and min values in array", array);
    }

    public void getElementsWithSpecificIndex(int[] array) {
        int numberOfElements = 0;

        ConsoleUtils.printIntArray("The array", array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                numberOfElements++;
            }
        }

        int[] newArray = new int[numberOfElements];
        int indexNewArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                newArray[indexNewArray] = array[i];
                indexNewArray++;
            }
        }
        ConsoleUtils.printIntArray("Elements where the index is less than the value", newArray);
    }

    public void getPrimeNumbers(double[] array) {
        double sum = 0;

        ConsoleUtils.printDoubleArray("The array", array);

        System.out.print("Elements with prime index: ");
        for (int i = 0; i < array.length; i++) {
            if (getPrimeNumber(i)) {
                sum += array[i];
                System.out.print(array[i] + "[" + i + "] ");
            }
        }
        System.out.println("\nSum of elements with a prime index: " + sum);
    }

    public void getMaxSum(int[] array) {
        int maxSum = array[0] + array[array.length - 1];

        ConsoleUtils.printIntArray("The array", array);
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        System.out.println("Maximum sum of the left and right parts pair: " + maxSum);
    }

    public void deleteMinValues(int[] array) {
        int minCount = 0;
        int min = array[0];

        ConsoleUtils.printIntArray("The array", array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }

        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }

        int[] newArray = new int[array.length - minCount];
        int indexNewArray = 0;

        for (int j : array) {
            if (j != min) {
                newArray[indexNewArray] = j;
                indexNewArray++;
            }
        }
        ConsoleUtils.printIntArray("Array without minimum value (" + min + "):", newArray);
    }

    public void getMostFrequentNumber(int[] array) {
        int[] frequent = new int[array.length];

        ConsoleUtils.printIntArray("The array", array);
        for (int i = 0; i < array.length; i++) {
            for (int k : array) {
                if (array[i] == k) {
                    frequent[i]++;
                }
            }
        }

        int valueRes = array[0];
        int frequentRes = frequent[0];

        for (int i = 0; i < frequent.length; i++) {
            if (frequent[i] > frequentRes) {
                frequentRes = frequent[i];
                valueRes = array[i];
            }
            if ((frequentRes == frequent[i]) && (array[i] < valueRes)) {
                valueRes = array[i];
            }
        }
        System.out.println("Minimum of most frequent number is: " + valueRes);
    }

    public void compressArray(int[] array) {
        ConsoleUtils.printIntArray("The array", array);
        if (array.length < 2)
            System.out.println("Array is too short to compress!");
        ;
        int numberCut = array.length / 2;

        int count = 1;
        if (array.length > 2) {
            for (int i = 2; i < array.length; i += 2) {
                array[count] = array[i];
                count++;
            }
            if (array.length % 2 == 0) {
                array = Arrays.copyOf(array, array.length / 2);
            } else {
                array = Arrays.copyOf(array, array.length / 2 + 1);
            }
        } else {
            array = Arrays.copyOf(array, array.length / 2);
        }
        ConsoleUtils.printIntArray("Compressed array:", array);
    }

    public boolean getPrimeNumber(int x) {
        if (x < 2) return false;
        int remainder;
        for (int i = 2; i <= x / 2; i++) {
            remainder = x % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}
