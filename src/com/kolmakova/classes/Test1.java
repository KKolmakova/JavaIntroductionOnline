package com.kolmakova.classes;

public class Test1 {

    int firstNumber;
    int secondNumber;

    private void printNumbers() {
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }

    private void sumOfNumbers() {
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of this numbers: " + sum);
    }

    private void getMaxAmongNumbers() {
        int max = Math.max(firstNumber, secondNumber);
        System.out.println("Greatest value: " + max);
    }
}
