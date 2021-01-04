package com.kolmakova.algorithmization;

import static com.kolmakova.utils.ConsoleUtils.printArraysHeader;
import static com.kolmakova.utils.ConsoleUtils.separator;

public class AlgorithmizationLoader {

    public static void start() {
        // One dimensional arrays
        System.out.println();
        printArraysHeader("One");
        OneDimensionalArray oneDimensionalArray = new OneDimensionalArray();
        int[] arrayInt = {-1, 1, 0, 5, 6, 10, -3, 34, 5, 8, -1, 9};
        double[] arrayDouble = {-3, 1.1, 5, 0, 6, 10, 34, -6.6, 5.9, 8};

        separator("Task 1 ");
        oneDimensionalArray.getSumMultiplesK(3, arrayInt);

        separator("Task 2 ");
        oneDimensionalArray.replaceNumberInArray(30, arrayDouble);

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

        // Two dimensional arrays
        printArraysHeader("Two");
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int k = 3;
        int r = 6;
        int[][] matrixInt = {{-1, 2, 6, 8, 5, 9}, {9, 5, -9, 3, 6, 4}, {0, -3, 8, 5, 7, 1}, {0, -5, 0, 9, 0, 0}};
        int[][] matrixPositiveInt = {{1, 2, 1, 3}, {5, 6, 8, 2}, {1, 5, 9, 3,}, {5, 1, 7, 4}};
        int[][] matrixSquareInt = {{1, 2, -1, 3}, {5, -6, 8, 2}, {-1, 5, 9, 3,}, {5, 1, -7, 4}};

        separator("Task 1 ");
        twoDimensionalArray.getOddColumns(matrixInt);

        separator("Task 2 ");
        twoDimensionalArray.findElementsOnDiagonal(matrixInt);

        separator("Task 3 ");
        twoDimensionalArray.getCertainRowAndColumn(matrixInt, k, r);

        separator("Task 4 ");
        twoDimensionalArray.formMatrixBySample1(7);

        separator("Task 5 ");
        twoDimensionalArray.formMatrixBySample2(7);

        separator("Task 6 ");
        twoDimensionalArray.formMatrixBySample3(7);

        separator("Task 7 ");
        twoDimensionalArray.formDoubleMatrix(4);

        separator("Task 8 ");
        twoDimensionalArray.swapColumns(matrixInt);

        separator("Task 9 ");
        twoDimensionalArray.getMaxAmountAmongColumns(matrixPositiveInt);

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
    }
}
