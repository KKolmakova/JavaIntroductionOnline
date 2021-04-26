package com.kolmakova.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAsObject {

    public void maximumNumberOfSpaces(String message) {
        System.out.println("String: " + message);

        int maxCount = 0;
        int count = 0;
        for (char symbol : message.toCharArray()) {
            if (symbol == ' ') {
                count++;
                if (count > maxCount) maxCount = count;
            } else count = 0;
        }
        System.out.println("Maximum number of consecutive spaces: " + maxCount);
    }

    public void insertSymbol(String message) {
        System.out.println("String before insert: " + message);
        System.out.println("String after insert: " + message.replaceAll("a", "ab"));
    }

    public void checkStringForPalindrome(String message) {
        System.out.println("String: " + message);

        StringBuffer reverse = new StringBuffer(message).reverse();
        String reverseString = reverse.toString();
        if (message.equalsIgnoreCase(reverseString)) System.out.println("The word is a palindrome");
        else System.out.println("The word isn't a palindrome");
    }

    public void rebuiltWord() {
        String word = "информатика";
        System.out.println("The word: " + word);

        StringBuilder builder = new StringBuilder();
        StringBuilder newWord = builder.append(word.charAt(7)).append(word.charAt(3)).append(word.charAt(4)).append(word.charAt(7));
        System.out.println("New word: " + newWord.toString());
    }

    public void countNumberOfLetters(String message) {
        System.out.println("String: " + message);

        int count = 0;
        for (char symbol : message.toCharArray()) {
            if (symbol == 'a') count++;
        }

        System.out.println("Count of letters 'a' in string: " + count);
    }

    public void doubleLetters(String message) {
        System.out.println("String: " + message);

        StringBuilder builder = new StringBuilder(message.length() * 2);
        for (int i = 0; i < message.length(); i++) {
            builder.append(message.charAt(i)).append(message.charAt(i));
        }

        System.out.println("String with doubled letters: " + builder.toString());
    }

    public void removeDoubledLettersAndSpaces(String message) {
        System.out.println("String: " + message);

        message = message.replaceAll(" ", "");
        message = new StringBuilder(message).reverse().toString().replaceAll("(.)(?=.*\\1)", "");
        message = new StringBuilder(message).reverse().toString();
        System.out.println("String without duplicates: " + message);
    }

    public void getLongestWord(String message) {
        System.out.println("String: " + message);

        String[] words = message.split(" ");
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) longestWord = word;
        }

        System.out.println("The longest word: " + longestWord);
    }

    public void countUppercaseAndLowercaseLetters(String message) {
        System.out.println("String: " + message);

        Pattern patternUp = Pattern.compile("[A-Z]");
        Matcher matcherUp = patternUp.matcher(message);
        Pattern patternLow = Pattern.compile("[a-z]");
        Matcher matcherLow = patternLow.matcher(message);

        int up = 0, low = 0;
        for (int i = 0; i < message.length(); i++) {
            if (matcherUp.find()) up++;
            if (matcherLow.find()) low++;
        }
        System.out.println("Count of uppercase letters: " + up);
        System.out.println("Count of lowercase letters: " + low);
    }

    public void getAmountOfSentences(String message) {
        System.out.println("String: " + message);

        int count = 0;
        Pattern pattern = Pattern.compile("[.!?\\-]");
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()){
            count++;
        }

        System.out.println("Count of sentences: " + count);
    }
}
