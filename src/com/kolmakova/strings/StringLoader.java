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

        String input4 = " Follow  the white   rabbit ";
        separator("Task 5 ");
        stringAsArray.removeDuplicateSpace(input4);

        ConsoleUtils.printSections("String as an object");
        StringAsObject stringAsObject = new StringAsObject();

        String message1 = "Never   give up  !";
        separator("Task 1 ");
        stringAsObject.maximumNumberOfSpaces(message1);

        String message2 = "There are to much stuff on the table";
        separator("Task 2 ");
        stringAsObject.insertSymbol(message2);

        String message3 = "Level";
        separator("Task 3");
        stringAsObject.checkStringForPalindrome(message3);

        separator("Task 4 ");
        stringAsObject.rebuiltWord();

        String message5 = "Keep calm and code on.";
        separator("Task 5 ");
        stringAsObject.countNumberOfLetters(message5);

        String message6 = "Diary";
        separator("Task 6 ");
        stringAsObject.doubleLetters(message6);

        String message7 = "See you at home";
        separator("Task 7 ");
        stringAsObject.removeDoubledLettersAndSpaces(message7);

        String message8 = "The longest word is here";
        separator("Task 8 ");
        stringAsObject.getLongestWord(message8);

        String message9 = "World Wide Web";
        separator("Task 9 ");
        stringAsObject.countUppercaseAndLowercaseLetters(message9);

        String message10 = "Today is monday. What a beautiful weather! A you agree with me?";
        separator("Task 10 ");
        stringAsObject.getAmountOfSentences(message10);
    }
}
