package com.kolmakova.strings;

import com.kolmakova.utils.ConsoleUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAsArray {

    public void convertToSnakeCase(String[] array) {
        ConsoleUtils.printStringArray("Array of strings in a camelCase:", array);

        for (int i = 0; i < array.length; i++) {
            Matcher matcher = Pattern.compile("\\B([A-Z])").matcher(array[i]);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, "_$0");
            }
            matcher.appendTail(stringBuffer);
            array[i] = stringBuffer.toString().toLowerCase();
        }

        ConsoleUtils.printStringArray("Array of strings in a snake_case:", array);
    }

    public void replaceWordWithAnother(String message) {
        System.out.println("String before replace word: " + message);
        String newMessage = message.replaceAll("word", "letter");
        System.out.println("String after replace word: " + newMessage);
    }

    public void getNumberOfDigits(String message) {
        System.out.println("String: " + message);

        int count = 0;
        Matcher matcher = Pattern.compile("\\d").matcher(message);
        while (matcher.find()) {
            count++;
        }

        System.out.println("Amount of digits: " + count);
    }

    public void getNumberOfNumbers(String message) {
        System.out.println("String: " + message);

        int count = 0;
        Matcher matcher = Pattern.compile("[-]?[0-9]+(.[0-9]+)?").matcher(message);
        while (matcher.find()) {
            count++;
        }

        System.out.println("Amount of numbers: " + count);
    }

    public void removeDuplicateSpace(String message) {
        System.out.println("String: " + message);

        Matcher matcher = Pattern.compile("( )+").matcher(message);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()){
            matcher.appendReplacement(stringBuffer, " ");
        }

        System.out.println("String without duplicate spaces: " + stringBuffer.toString().trim());
        System.out.println();
    }
}
