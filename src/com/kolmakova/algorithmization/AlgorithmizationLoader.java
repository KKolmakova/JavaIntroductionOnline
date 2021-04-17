package com.kolmakova.algorithmization;

import com.kolmakova.utils.ConsoleUtils;

import java.util.ArrayList;
import java.util.List;

import static com.kolmakova.utils.ConsoleUtils.separator;

public class AlgorithmizationLoader {

    public static void start() {
        ConsoleUtils.printSections("One dimensional array");
        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();

        int[] arrayInt = {-1, 1, 0, 5, 6, 10, -3, 34, 5, 8, -1, 9};
        double[] arrayDouble = {-3, 1.1, 5, 0, 6, 10, 34, -6.6, 5.9, 8};

        int multiple = 3;
        separator("Task 1 ");
        oneDimensionalArray.getSumMultiplesK(multiple, arrayInt);

        int arraySize = 18;
        separator("Task 2 ");
        oneDimensionalArray.replaceNumberInArray(arraySize, arrayDouble);

        separator("Task 3 ");
        oneDimensionalArray.countNumberOfElements(arrayDouble);

        separator("Task 4 ");
        oneDimensionalArray.swapMinMaxValues(arrayDouble);

        separator("Task 5 ");
        oneDimensionalArray.getElementsWithSpecificIndex(arrayInt);

        separator("Task 6 ");
        oneDimensionalArray.getPrimeNumbers(arrayDouble);

        separator("Task 7 ");
        oneDimensionalArray.getMaxSum(arrayInt);

        separator("Task 8 ");
        oneDimensionalArray.deleteMinValues(arrayInt);

        separator("Task 9 ");
        oneDimensionalArray.getMostFrequentNumber(arrayInt);

        separator("Task 10 ");
        oneDimensionalArray.compressArray(arrayInt);
        System.out.println();

        ConsoleUtils.printSections("Two dimensional array");
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] matrixInt = {{-1, 2, 6, 8, 5, 9}, {9, 5, -9, 3, 6, 4}, {0, -3, 8, 5, 7, 1}, {0, -5, 0, 9, 0, 0}};
        int[][] matrixPositiveInt = {{1, 2, 1, 3}, {5, 6, 8, 2}, {1, 5, 9, 3,}, {5, 1, 7, 4}};

        separator("Task 1 ");
        twoDimensionalArray.getOddColumns(matrixInt);

        separator("Task 2 ");
        twoDimensionalArray.findElementsOnDiagonal(matrixInt);

        int k = 3;
        int r = 6;
        separator("Task 3 ");
        twoDimensionalArray.getCertainRowAndColumn(matrixInt, k, r);

        int n = 7;
        separator("Task 4 ");
        twoDimensionalArray.formMatrixBySample1(n);

        separator("Task 5 ");
        twoDimensionalArray.formMatrixBySample2(n);

        separator("Task 6 ");
        twoDimensionalArray.formMatrixBySample3(n);

        separator("Task 7 ");
        twoDimensionalArray.formDoubleMatrix(n);

        separator("Task 8 ");
        twoDimensionalArray.swapColumns(matrixInt);

        separator("Task 9 ");
        twoDimensionalArray.getMaxAmountAmongColumns(matrixPositiveInt);

        int[][] matrixSquareInt = {{1, 2, -1, 3}, {5, -6, 8, 2}, {-1, 5, 9, 3,}, {5, 1, -7, 4}};
        separator("Task 10 ");
        twoDimensionalArray.sumPositiveValuesOnDiagonal(matrixSquareInt);

        separator("Task 11 ");
        twoDimensionalArray.findFivesInMatrix();

        separator("Task 12 ");
        twoDimensionalArray.sortMatrixByRows(matrixPositiveInt);

        separator("Task 13 ");
        twoDimensionalArray.sortMatrixByColumns(matrixPositiveInt);

        separator("Task 14 ");
        twoDimensionalArray.formMatrix();

        separator("Task 15 ");
        twoDimensionalArray.findMaxElement(matrixInt);

        int magicSquareSize = 5;
        separator("Task 16 ");
        twoDimensionalArray.createMagicSquare(magicSquareSize);
        System.out.println();

        ConsoleUtils.printSections("Sort array");
        SortArray sortArray = new SortArray();

        int[] array1 = {-1, 1, 3, 5, 10, 15};
        int[] array2 = {-5, -3, 0, 4, 7};
        int position = 3;
        separator("Task 1 ");
        sortArray.concatenateArrays(array1, array2, position);

        separator("Task 2 ");
        sortArray.concatenateSequences(array1, array2);

        separator("Task 3 ");
        sortArray.sortByChoice(array1);

        int[] array = {3, -9, 7, 0, 5, 4, 0, -6};
        separator("Task 4 ");
        sortArray.sortByExchanges(array.clone());

        separator("Task 5 ");
        sortArray.sortByInserts(array.clone());

        separator("Task 6 ");
        sortArray.sortOfShell(array.clone());

        List<Integer> in = new ArrayList<Integer>() {
            {
                add(-10);
                add(2);
                add(2);
                add(5);
                add(10);
                add(88);
            }
        };
        List<Integer> from = new ArrayList<Integer>() {
            {
                add(-1);
                add(3);
                add(4);
                add(7);
                add(99);
            }
        };
        separator("Task 7 ");
        sortArray.insertArrayIntoArray(in, from);

        int numberOfFractions = 5;
        separator("Task 8 ");
        sortArray.bringFractionsToCommonDenominator(numberOfFractions);
        System.out.println();

        ConsoleUtils.printSections("Decomposition");
        Decomposition decomposition = new Decomposition();

        int a = 30;
        int b = 10;
        int c = 5;
        int d = 45;
        separator("Task 1 ");
        decomposition.solveTheEquation(a, b);

        separator("Task 2 ");
        decomposition.getGcdForFour(a, b, c, d);

        separator("Task 3 ");
        decomposition.getAreaOfHexagon(a);

        int countOfPoints = 8;
        separator("Task 4 ");
        decomposition.getDistanceFromPoints(countOfPoints);

        int size = 10;
        separator("Task 5 ");
        decomposition.getNumberBeforeMaximum(size);

        separator("Task 6 ");
        decomposition.findMutuallyPrimeNumbers(2, 7, 8);

        separator("Task 7 ");
        decomposition.getFactorialSum();

        separator("Task 8 ");
        decomposition.getSum();

        int x = 1;
        int y = 2;
        int z = 6;
        int t = 4;
        separator("Task 9 ");
        decomposition.getSquareOfQuadrilateral(x, y, z, t);

        int number = 845031774;
        separator("Task 10 ");
        decomposition.writeDigitsOfNumberIntoArray(number);

        int number1 = 55;
        int number2 = 798456;
        separator("Task 11 ");
        decomposition.compareLengthOfNumbers(number1, number2);

        int firstNumber = 200;
        int lastNumber = 9;
        int quantity = 10;
        separator("Task 12 ");
        decomposition.createArrayOfSpecialNumbers(firstNumber, lastNumber, quantity);

        int interval = 7;
        separator("Task 13 ");
        decomposition.getTwins(interval);

        int number3 = 1000;
        separator("Task 14 ");
        decomposition.getArmstrongNumbers(number3);

        int numberLength = 2;
        separator("Task 15 ");
        decomposition.getIncreasingSequence(numberLength);

        int number4 = 2;
        separator("Task 16 ");
        decomposition.getSumOfOddNumbers(number4);

        int number5 = 91;
        separator("Task 17 ");
        decomposition.subtractSumOfDigitsFromNumber(number5);
    }
}
