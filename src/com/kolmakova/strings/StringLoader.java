package com.kolmakova.strings;

import com.kolmakova.utils.ConsoleUtils;

import static com.kolmakova.utils.ConsoleUtils.separator;

public class StringLoader {

    public static void start() {
        ConsoleUtils.printSections("String as an array");
        StringAsArray stringAsArray = new StringAsArray();

        String[] array = new String[]{"stringFirst","stringSecond","stringThird"};
        separator("Task 1 ");
        stringAsArray.convertToSnakeCase(array);

        String input1 = "Many times word was wrong!";
        separator("Task 2 ");
        stringAsArray.replaceWordWithAnother(input1);

        String input2 = "I'm have 1 mobile and 2 sims slot in it.";
        separator("Task 3 ");
        stringAsArray.getNumberOfDigits(input2);

        String input3 = "The Word War 2 begun 22 of June in 1941.";
        separator("Task 4 ");
        stringAsArray.getNumberOfNumbers(input3);

        String input4 = " Follow  the white    rabbit ";
        separator("Task 5 ");
        stringAsArray.removeDuplicateSpace(input4);
    }
}
