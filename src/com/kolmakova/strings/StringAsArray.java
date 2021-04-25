package com.kolmakova.strings;

import com.kolmakova.utils.ConsoleUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAsArray {

    public void convertToSnakeCase(String[] array) {
        ConsoleUtils.printStringArray("Array of strings in a camelCase:", array);

        Pattern p = Pattern.compile("\\B([A-Z])");

        for (int i = 0; i < array.length; i++) {
            Matcher matcher = p.matcher(array[i]);
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
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            count++;
        }

        System.out.println("Amount of digits: " + count);
    }

    public void getNumberOfNumbers(String message) {
        System.out.println("String: " + message);

        int count = 0;
        Pattern pattern = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            count++;
        }

        System.out.println("Amount of numbers: " + count);
    }

    public void removeDuplicateSpace(String message) {
        System.out.println("String: " + message);

        Pattern pattern = Pattern.compile("( )+");
        Matcher matcher = pattern.matcher(message.trim());
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()){
            matcher.appendReplacement(stringBuffer, " ");
        }

        System.out.println("String without duplicate spaces: " + stringBuffer);
    }
}
