package com.kolmakova.classes;

public class Counter {
//    Опишите класс, реализующий десятичный счетчик,
//    который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
//    Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
//    Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
//    Написать код, демонстрирующий все возможности класса.

    int currentStatus;
    int lowerLimit;
    int upperLimit;

    public Counter() {
        currentStatus = 2;
        lowerLimit = 1;
        upperLimit = 20;
    }

    public Counter(int lowerLimit, int upperLimit, int currentStatus) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;

        if ((currentStatus < lowerLimit) || (currentStatus > upperLimit))
            throw new IllegalArgumentException("Current status out of range!");
        else this.currentStatus = currentStatus;
    }

    public void increment() {
        if (currentStatus >= upperLimit) System.err.println("You are out of range!");
        else currentStatus += 1;
    }

    public void decrement() {
        if (currentStatus <= lowerLimit) System.err.println("You are out of range!");
        else currentStatus -= 1;
    }

    public void getCurrentStatus() {
        System.out.println();
        System.out.println("Current status of count: " + currentStatus);
        System.out.println("The range: [ " + lowerLimit + " ... " + upperLimit + " ]");
        System.out.println();
    }
}
