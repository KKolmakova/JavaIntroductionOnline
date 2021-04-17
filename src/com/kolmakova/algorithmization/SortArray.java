package com.kolmakova.algorithmization;

import com.kolmakova.utils.ConsoleUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArray {

    public void concatenateArrays(int[] array1, int[] array2, int k) {
        ConsoleUtils.printIntArray("First array", array1);
        ConsoleUtils.printIntArray("Second array", array2);
        System.out.println("Merged from position " + (++k));

        int[] concatArray = new int[(array1.length + array2.length)];
        int indexArray2 = 0;

        for (int i = 0; i < concatArray.length; i++) {
            if (k > i)
                concatArray[i] = array1[i];
            else if (indexArray2 < k) {
                concatArray[i] = array2[indexArray2];
                indexArray2++;
            } else
                concatArray[i] = array1[i - k - 1];
        }

        ConsoleUtils.printIntArray("Combined  array:", concatArray);
    }

    public void concatenateSequences(int[] array1, int[] array2) {
        ConsoleUtils.printIntArray("First sequence of numbers", array1);
        ConsoleUtils.printIntArray("Second sequence of numbers", array2);

        int[] concatArray = new int[(array1.length + array2.length)];
        int index = 0;

        for (int i = 0; i < concatArray.length; i++) {
            if (i < array1.length)
                concatArray[i] = array1[i];
            else {
                concatArray[i] = array2[index];
                index++;
            }
        }

        for (int i = concatArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (concatArray[j] > concatArray[j + 1]) {
                    int tmp = concatArray[j];
                    concatArray[j] = concatArray[j + 1];
                    concatArray[j + 1] = tmp;
                }
            }
        }

        ConsoleUtils.printIntArray("Combined  sorted array:", concatArray);
    }

    public void sortByChoice(int[] array) {
        ConsoleUtils.printIntArray("The array:", array);

        int indexFromEnd = array.length - 1;
        int buf;
        for (int i = 0; i < array.length; i++) {
            if (i < indexFromEnd) {
                buf = array[i];
                array[i] = array[indexFromEnd];
                array[indexFromEnd] = buf;
                indexFromEnd--;
            }
        }

        ConsoleUtils.printIntArray("The array is sorted in descending order:", array);
    }

    public void sortByExchanges(int[] array) {
        ConsoleUtils.printIntArray("Unsorted array:", array);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                    count++;
                }
            }
        }

        ConsoleUtils.printIntArray("Sorted array:", array);
        System.out.println("Number of permutations " + count);
    }

    public void sortByInserts(int[] array) {
        ConsoleUtils.printIntArray("Unsorted array:", array);

        for (int i = 1; i < array.length; ++i) {
            int j = i - 1;
            int buff = array[i];
            int index = binarySearch(array, buff, 0, j);

            while (j >= index) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = buff;
        }
        ConsoleUtils.printIntArray("Sorted array:", array);
    }

    private int binarySearch(int[] array, int item, int low, int high) {
        if (high <= low)
            return (item > array[low]) ?
                    (low + 1) : low;

        int mid = (low + high) / 2;

        if (item == array[mid])
            return mid + 1;

        if (item > array[mid])
            return binarySearch(array, item, mid + 1, high);
        return binarySearch(array, item, low, mid - 1);
    }

    public void sortOfShell(int[] array) {
        ConsoleUtils.printIntArray("Unsorted array:", array);

        int step, j;
        int buf;

        for (step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                buf = array[i];
                for (j = i; j >= step; j -= step) {
                    if (buf < array[j - step])
                        array[j] = array[j - step];
                    else
                        break;
                }
                array[j] = buf;
            }
        }

        ConsoleUtils.printIntArray("Sorted array:", array);
    }

    public void insertArrayIntoArray(List<Integer> in, List<Integer> from) {
        ConsoleUtils.printArrayList("First sorted sequence: ", in);
        ConsoleUtils.printArrayList("Second sorted sequence: ", from);

        List<Integer> indexes = getIndexes(in, from);

        for (int i = 0; i < indexes.size(); i++) in.add(indexes.get(i), from.get(i));
        System.out.println("Coupled sequence " + in);
    }

    private List<Integer> getIndexes(List<Integer> in, List<Integer> from) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < from.size(); i++) {
            int dex = Collections.binarySearch(in, from.get(i));
            if (dex < 0) result.add(-(dex + 1) + i);
            else result.add(dex + i);
        }
        return result;
    }

    public void bringFractionsToCommonDenominator(int n) {
        int[] p = new int[n];
        ConsoleUtils.fillArrayRandom(p, 1);

        int[] q = new int[n];
        ConsoleUtils.fillArrayRandom(q, 1);

        System.out.print("Fractions: ");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + q[i] + ", ");
        }
        System.out.println();

        int lcm = (q[0] * q[1]) / gcd(q[0], q[1]);
        int buf;
        for (int i = 2; i < n; i++) {
            if (i == n - 1) {
                buf = q[i];
            } else
                buf = (q[i] * q[i + 1]) / gcd(q[i], q[i + 1]);
            lcm = (lcm * buf) / gcd(lcm, buf);
        }
        System.out.println("Common denominator: " + lcm);

        for (int i = 0; i < n; i++) {
            int mul = lcm / q[i];
            p[i] = p[i] * mul;
        }
        System.out.print("Fractions: ");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + lcm + ", ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int buff = p[i];
            int j;
            for (j = i - 1; j >= 0 && p[j] > buff; --j)
                p[j + 1] = p[j];
            p[j + 1] = buff;
        }
        System.out.print("Sorted fractions: ");
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + "/" + lcm + ", ");
        }
        System.out.println();
    }

    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
