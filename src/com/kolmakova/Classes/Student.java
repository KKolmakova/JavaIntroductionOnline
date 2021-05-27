package com.kolmakova.Classes;

public class Student {

    private String fullName;
    private int groupNumber;
    private int[] academicPerformance;

    Student(String fullName, int groupNumber, int[] academicPerformance) {
        this.fullName = fullName;
        this.groupNumber = groupNumber;
        this.academicPerformance = academicPerformance;
    }

//    public Student(String name, int group ,int ... marks) {
//        this.academicPerformance = marks;
//        this.fullName = name;
//        this.groupNumber = group;
//    }

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

    public void getStudentsWithExcellentGrades(){
        if (excellentStudent()) printStudentDossier();
    }

    private boolean excellentStudent(){
        for (int j : academicPerformance) {
            if (j < 9) return false;
        }
        return true;
    }

    private void printStudentDossier(){
        System.out.println("Student: " + fullName);
        System.out.println("Group: " + groupNumber);
    }
}
