package com.kolmakova.algorithmization;

import com.kolmakova.utils.ConsoleUtils;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {

    public void getOddColumns(int[][] matrix) {
        ConsoleUtils.printIntMatrix("The matrix", matrix);

        System.out.println("Even columns where the first element is larger than the last: ");
        for (int j = 1; j < matrix[0].length; j += 2) {
            if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                for (int[] ints : matrix) {
                    System.out.print(ints[j] + " ");
                }
                System.out.println();
            }
        }
    }

    public void findElementsOnDiagonal(int[][] matrix) {
        ConsoleUtils.printIntMatrix("The matrix", matrix);

        System.out.print("The element which located on the main diagonal: ");
        for (int i = 0; i < matrix.length; i++)
            System.out.print(matrix[i][i] + " ");
        System.out.println();
    }

    public void getCertainRowAndColumn(int[][] matrix, int k, int r) {
        ConsoleUtils.printIntMatrix("The matrix", matrix);

        System.out.println("Row " + k + ": " + Arrays.toString(matrix[k - 1]));

        System.out.print("Column " + r + ": [ ");
        for (int[] ints : matrix) {
            System.out.print(ints[r - 1] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public void formMatrixBySample1(int n) {
        int[][] matrix = new int[n][n];
        System.out.println("n = " + n);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) matrix[i][j] = j + 1;
                else matrix[i][j] = n - j;
            }
        ConsoleUtils.printIntMatrix("The matrix", matrix);
    }

    public void formMatrixBySample2(int n) {
        int[][] matrix = new int[n][n];
        System.out.println("n = " + n);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + 1;
            }
            n--;
        }
        ConsoleUtils.printIntMatrix("The matrix", matrix);
    }

    public void formMatrixBySample3(int n) {
        int[][] matrix = new int[n][n];
        System.out.println("n = " + n);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i <= matrix.length / 2)) {
                    if ((j >= i) && (j <= matrix.length - 1 - i)) {
                        matrix[i][j] = 1;
                    }
                } else {
                    if ((j >= matrix.length - 1 - i) && (j <= i)) {
                        matrix[i][j] = 1;
                    }
                }
            }
        }
        ConsoleUtils.printIntMatrix("The matrix", matrix);
    }

    public void formDoubleMatrix(int n) {
        double[][] matrix = new double[n][n];
        int countPositive = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (matrix[i][j] > 0) {
                    countPositive++;
                }
            }
        }
        ConsoleUtils.printDoubleMatrix("The matrix", matrix);
        System.out.println("There are " + countPositive + " positive numbers in matrix");
    }

    public void swapColumns(int[][] matrix) {
        ConsoleUtils.printIntMatrix("The matrix", matrix);
        int columnAmount = matrix[0].length - 1;

        int column1;
        while (true) {
            column1 = ConsoleUtils.readInt("Enter first column to swap(from 0 to " + columnAmount + "): ");
            if ((column1 < 0) || (column1 > columnAmount)) {
                System.err.println("you are out of range!");
            } else {
                break;
            }
        }

        int column2;
        while (true) {
            column2 = ConsoleUtils.readInt("Enter second column to swap(from 0 to " + columnAmount + "): ");
            if ((column2 < 0) || (column2 > columnAmount)) {
                System.err.println("you are out of range!");
            } else {
                break;
            }
        }

        int buff;
        for (int i = 0; i < matrix.length; i++) {
            buff = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = buff;
        }
        ConsoleUtils.printIntMatrix("Matrix with swap columns: ", matrix);
    }

    public void getMaxAmountAmongColumns(int[][] matrix) {
        ConsoleUtils.printIntMatrix("The matrix", matrix);

        int maxSum = -1;
        int index = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int[] ints : matrix) {
                sum = sum + ints[j];
                if (sum > maxSum) {
                    maxSum = sum;
                    index = j + 1;
                }
            }
        }
        System.out.println("Max sum = " + maxSum + " in column " + index);
    }

    public void sumPositiveValuesOnDiagonal(int[][] matrix) {
        ConsoleUtils.printIntMatrix("The matrix", matrix);

        System.out.print("Positive elements of the main diagonal of a square matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
        System.out.println();
    }

    public void findFivesInMatrix() {
        int[][] matrix = new int[10][20];

        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(15 + 1);
            }
        }
        ConsoleUtils.printIntMatrix("The matrix", matrix);

        System.out.print("The index of rows where five meet 3 or more once: ");
        int countFives = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    countFives++;
                }
            }
            if (countFives >= 3) {
                System.out.print(i + " ");
            }
            countFives = 0;
        }
        System.out.println();
    }

    public void sortMatrixByRows(int[][] matrix) {
        ConsoleUtils.printIntMatrix("Unsorted matrix", matrix);

        for (int[] ints : matrix) {
            sortMatrixRow(ints, true);
        }
        ConsoleUtils.printIntMatrix("With rows sorted in ascending order", matrix);

        for (int[] ints : matrix) {
            sortMatrixRow(ints, false);
        }
        ConsoleUtils.printIntMatrix("With rows sorted in descending order", matrix);
    }

    public void sortMatrixByColumns(int[][] matrix) {
        ConsoleUtils.printIntMatrix("Unsorted matrix", matrix);

        swapRowsAndColumns(matrix);
        for (int[] row : matrix) {
            sortMatrixRow(row, true);
        }
        swapRowsAndColumns(matrix);
        ConsoleUtils.printIntMatrix("With columns sorted in ascending order", matrix);

        swapRowsAndColumns(matrix);
        for (int[] row : matrix) {
            sortMatrixRow(row, false);
        }
        swapRowsAndColumns(matrix);
        ConsoleUtils.printIntMatrix("With columns sorted in descending order", matrix);
    }

    private void sortMatrixRow(int[] row, boolean isAscending) {
        while (true) {
            boolean isChanged = false;

            for (int i = 0; i < row.length - 1; i++) {
                boolean needAscendingSort = isAscending && row[i] > row[i + 1];
                boolean needDescendingSort = !isAscending && row[i] < row[i + 1];

                if (needAscendingSort || needDescendingSort) {
                    int buff = row[i];
                    row[i] = row[i + 1];
                    row[i + 1] = buff;
                    isChanged = true;
                }
            }

            if (!isChanged) {
                break;
            }
        }
    }

    private void swapRowsAndColumns(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int buff = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buff;
            }
        }
    }

    public void formMatrix() {
        int n = (int) (3 + Math.random() * 10);
        int m = (int) (n + Math.random() * 10);
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j > i) {
                    matrix[i][j] = 1;
                }
            }
        }
        ConsoleUtils.printIntMatrix("The matrix", matrix);
    }

    public void findMaxElement(int[][] matrix) {
        ConsoleUtils.printIntMatrix("The matrix", matrix);

        int maxElement = matrix[0][0];
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] > maxElement) {
                    maxElement = ints[j];
                }
            }
        }
        System.out.println("Max element in matrix = " + maxElement);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if ((matrix[i][j] % 2 == 1) || (matrix[i][j] % 2 == -1)) {
                    matrix[i][j] = maxElement;
                }
            }
        }
        ConsoleUtils.printIntMatrix("The matrix where odd elements replaced by max element (" + maxElement + "):", matrix);
    }

    public void createMagicSquare(int n) {
        int[][] matrix = new int[n][n];

        if (n % 2 != 0) {
            int x = n / 2;
            int y = matrix.length - 1;
            int count = 1;

            while (true) {
                matrix[(matrix.length - 1) - y][x] = count;
                count++;

                if (x == matrix.length - 1) x = -1;
                if (y >= matrix.length - 1) y = -1;
                y++;
                x++;
                if (matrix[matrix.length - 1 - y][x] != 0) y--;

                int countDiagonal = 0;
                for (int[] array : matrix) {
                    for (int z : array) {
                        if (z == 0) countDiagonal++;
                    }
                }
                if (countDiagonal == 0) break;
            }
        } else if (n % 4 == 0) {
            int count = 0;
            for (int i = 0; i < matrix.length / 2; i++) {
                int operation;
                if (i < matrix.length / 2) {
                    operation = matrix[i][i];
                    matrix[i][i] = matrix[matrix.length - 1 - count][matrix.length - 1 - count];
                    matrix[matrix.length - 1 - count][matrix.length - 1 - count] = operation;
                    count++;
                }
            }

            count = 0;
            for (int i = 0; i < matrix.length / 2; i++) {
                int operation;
                if (i < matrix.length / 2) {
                    operation = matrix[matrix.length - 1 - count][i];
                    matrix[matrix.length - 1 - count][i] = matrix[i][matrix.length - 1 - count];
                    matrix[i][matrix.length - 1 - count] = operation;
                    count++;
                }
            }
        } else if ((n == 0) || (n == 2) || (n % 4 != 0))
            System.out.println("Error, magic square size must be bigger than 2x2!");

        ConsoleUtils.printIntMatrix("Magic square: ", matrix);
    }
}

