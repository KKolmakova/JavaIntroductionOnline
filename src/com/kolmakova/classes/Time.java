package com.kolmakova.classes;

public class Time {
//    Составьте описание класса для представления времени.
//    Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
//    с проверкой допустимости вводимых значений.
//    В случае недопустимых значений полей поле устанавливается в значение 0.
//    Создать методы изменения времени на заданное количество часов, минут и секунд.

    int hour = 0;
    int minute = 0;
    int second = 0;

    public void changeHour(int hour) {
        if ((hour >= 0) && (hour <= 23)) this.hour = hour;
        else this.hour = 0;
    }

    public void changeMinute(int minute) {
        if ((minute >= 0) && (minute <= 59)) this.minute = minute;
        else this.minute = 0;
    }

    public void changeSecond(int second) {
        if ((second >= 0) && (second <= 59)) this.second = second;
        else this.second = 0;
    }

    public void printTime() {
        System.out.println();
        System.out.println("Time: " + leadToDecimal(hour) + "." + leadToDecimal(minute) + "." + leadToDecimal(second));
        System.out.println();
    }

    private String leadToDecimal(int number) {
        if ((number / 10) < 1) return "0" + number;
        else return Integer.toString(number);
    }
}
