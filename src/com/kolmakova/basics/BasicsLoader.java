package com.kolmakova.basics;

import static com.kolmakova.utils.ConsoleUtils.separator;

public class BasicsLoader {

    public static void Start() {
        LinearPrograms linearPrograms = new LinearPrograms();
        Branching branching = new Branching();
        Loop loop = new Loop();

        System.out.println("*************** Linear Programs ***************");

        separator("Task 1 - 3 ");
        linearPrograms.calculateFunctionValue(1, 1, 1, 1, 1);

        separator("Task 4 ");
        linearPrograms.swapDigits(123.456);

        separator("Task 5 ");
        linearPrograms.convertSeconds(2324);

        separator("Task 6 ");
        linearPrograms.findInRange(-3, 2);

        System.out.println();

        System.out.println("*************** Branching ***************");

        separator("Task 1 ");
        branching.inspectTriangle(0, 56);

        separator("Task 2 ");
        branching.findMax(2, 3, 6, 1);

        separator("Task 3 ");
        branching.compareCoordinates(1, 4, 1, 3, 1, 3);

        separator("Task 4 ");
        branching.inspectBrick(5, 7, 4, 7, 4);

        separator("Task 5 ");
        branching.calculateFunctionValue(1);
        System.out.println();

        System.out.println("*************** Round ***************");

        separator("Task 1, 3, 4 ");
        loop.countSimpleOperations();

        separator("Task 2 ");
        loop.getFunctionValue(2, 7, 1);

        separator("Task 2 ");
        loop.sumNumberSeries(6, 3);

        separator("Task 6 ");
        loop.printASCIISymbols();

        separator("Task 7 ");
        loop.findDivisors(2, 10);

        separator("Task 8 ");
        loop.printDuplicateDigits(-122333444, -9384595);
    }
}
