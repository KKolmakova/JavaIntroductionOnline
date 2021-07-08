package com.kolmakova.classes;

public class Student {

    private String fullName;
    private int groupNumber;
    private int[] academicPerformance;

    Student(String fullName, int groupNumber, int[] academicPerformance) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getAcademicPerformance() {
        return academicPerformance;
    }

    public void setAcademicPerformance(int[] academicPerformance) {
        this.academicPerformance = academicPerformance;
    }
}
