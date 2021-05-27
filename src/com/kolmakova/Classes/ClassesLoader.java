package com.kolmakova.Classes;

public class ClassesLoader {

    Student[] student = new Student[9];

    public void fillStudents() {
        student[0] = new Student("Maria Kot", 29, new int[]{8, 9, 7, 10, 7, 8, 9, 10});
        student[1] = new Student("Ksenia Kolmakova", 29, new int[]{9, 10, 9, 10, 10});
        student[2] = new Student("Sasha Kolmakova", 33, new int[]{10, 5, 6, 8, 9});
        student[3] = new Student("Sasha Kazakevich", 34, new int[]{9, 8, 9, 6, 9});
        student[4] = new Student("Valya Kolmakova", 34, new int[]{10, 8, 9, 7, 7});
    }
}
