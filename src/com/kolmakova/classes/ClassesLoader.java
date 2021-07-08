package com.kolmakova.classes;

public class ClassesLoader {

    public static void start() {
        InitializationOfClasses initialization = new InitializationOfClasses();

        initialization.setStudent();
        System.out.println("////////////////////////////////////////");
        initialization.setTrain();
        System.out.println("////////////////////////////////////////");
        initialization.setCounter();
        System.out.println("////////////////////////////////////////");
        initialization.setTime();
    }
}
