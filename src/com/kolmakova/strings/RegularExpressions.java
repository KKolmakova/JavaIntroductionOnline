package com.kolmakova.strings;

import com.kolmakova.utils.ConsoleUtils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Comparator.comparingInt;

public class RegularExpressions {

    public void task1(String text, String symbol) {
        System.out.println("Text: \n" + text);
        getOperation(text, symbol);
    }

    private void menu() {
        System.out.println();
        System.out.println("Choose the operation: \n" +
                "[0] Exit \n" +
                "[1] Sort paragraphs by number of sentences \n" +
                "[2] Sort words in a sentence in descending order \n" +
                "[3] Find words with a specific letter \n");
        System.out.print("Operation number: ");
    }

    private void getOperation(String text, String symbol) {
        int operation = -1;
        while (operation != 0) {
            menu();
            while (true) {
                operation = ConsoleUtils.readInt("");
                if ((operation > 4) || (operation < 0)) System.out.println("There is no such operation!");
                else break;
            }
            switch (operation) {
                case 0:
                    break;
                case 1:
                    getSortedParagraphs(text);
                    break;
                case 2:
                    sortWordsInDescendingOrder(text);
                    break;
                case 3:
                    sortingTokensInDescendingOrder(text, symbol);
                    break;
            }
        }
    }

    private void getSortedParagraphs(String text) {
        String[] paragraphs = text.split(Pattern.compile("\\n").toString());

        for (int i = 0; i < paragraphs.length - 1; i++) {
            String[] sentences = paragraphs[i].split("[.!?]");
            String[] sentencesNext = paragraphs[i + 1].split("[.!?]");
            for (int j = 0; j < paragraphs.length - i - 1; j++) {
                if (sentences.length < sentencesNext.length) {
                    String buf = paragraphs[j];
                    paragraphs[j] = paragraphs[j + 1];
                    paragraphs[j + 1] = buf;
                }
            }
        }

        System.out.println();
        System.out.println("Paragraphs in increasing order sequence: ");
        for (String paragraph : paragraphs) {
            System.out.println(paragraph);
        }
    }

    private void sortWordsInDescendingOrder(String text) {
        String[] sentences = text.split("[.!?]");

        System.out.println();
        System.out.println("Words in descending order: ");

        for (int i = 0; i < sentences.length; i++) {
            System.out.print("Sentence [" + (i + 1) + "]: ");
            for (int j = sentences[i].length(); j > 0; j--) {
                Matcher matcher = Pattern.compile("\\b\\w{" + j + "}\\b").matcher(sentences[i]);
                while (matcher.find()) {
                    System.out.print(matcher.group(0) + " ");
                }
            }
            System.out.println();
        }
    }

    private void sortingTokensInDescendingOrder(String text, String symbol) {
        Map<Integer, List<String>> wordMap = new TreeMap<>(comparingInt(o -> o));

        Arrays.stream(text.split("\\W+"))
                .filter(s -> wordContainsCharacter(s, symbol))
                .forEach(s -> putToMap(s, symbol, wordMap));

        List<String> sortedList = convertToSortedList(wordMap);

        System.out.println(sortedList);
    }

    private void putToMap(String word, String symbol, Map<Integer, List<String>> wordMap) {
        int key = characterCounter(word, symbol);
        List<String> values;

        if (wordMap.containsKey(key)) {
            values = wordMap.get(key);
        } else {
            values = new ArrayList<>();
        }

        values.add(word);
        values.sort(String::compareToIgnoreCase);

        wordMap.put(key,values);
    }

    private List<String> convertToSortedList(Map<Integer, List<String>> wordMap) {
        List<String> result = new ArrayList<>();
        wordMap.values()
                .forEach(result::addAll);

        return result;
    }

    private boolean wordContainsCharacter(String word, String symbol) {
        return word.contains(symbol);
    }

    private int characterCounter(String word, String letter) {
        return (int) word.toLowerCase().chars().filter(varChar -> varChar == letter.toLowerCase().charAt(0)).count();
    }

    public void task2(String text){
        System.out.println("XML-document: " + text);
        System.out.println();

        Matcher m = Pattern.compile("\\<(/?[^\\>]+)\\>").matcher(text);

        while(m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }
    }
}
