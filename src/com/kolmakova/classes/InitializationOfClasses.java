package com.kolmakova.classes;

import com.kolmakova.utils.ConsoleUtils;

public class InitializationOfClasses {

    public void setStudent() {
        Student[] student = new Student[10];

        student[0] = new Student("Maria Kot", 29, new int[]{8, 9, 7, 10, 7, 8, 9, 10});
        student[1] = new Student("Ksenia Kolmakova", 29, new int[]{9, 10, 9, 10, 10});
        student[2] = new Student("Sasha Kolmakova", 33, new int[]{10, 5, 6, 8, 9});
        student[3] = new Student("Sasha Kazakevich", 34, new int[]{9, 8, 9, 6, 9});
        student[4] = new Student("Valya Kolmakova", 34, new int[]{10, 8, 9, 7, 7});
        student[5] = new Student("Sasha Petrov", 29, new int[]{9, 9, 9, 10, 9, 9, 9, 10});
        student[6] = new Student("Tanya Kozlova", 29, new int[]{9, 10, 9, 10, 10});
        student[7] = new Student("Atrem Pavlov", 33, new int[]{10, 5, 6, 8, 9});
        student[8] = new Student("Sasha Porataev", 34, new int[]{9, 8, 9, 6, 9});
        student[9] = new Student("Misha Darin", 34, new int[]{10, 10, 9, 9, 9});

        getOperationStudents(student);
    }

    private void menuStudents() {
        System.out.println("Choose the operation:");
        System.out.println("0) exit;");
        System.out.println("1) print all students;");
        System.out.println("2) print excellent students;");
        System.out.println();
    }

    private void getOperationStudents(Student[] students) {
        int operation = -1;

        while (operation != 0) {
            menuStudents();
            operation = ConsoleUtils.readInt("Operation: ");

            switch (operation) {
                case 0:
                    break;
                case 1:
                    printStudentDossier(students);
                    break;
                case 2:
                    getExcellentStudents(students);
                    break;
                default:
                    System.err.println("There is no such operation!");
                    break;
            }
        }
    }

    private boolean excellentStudent(Student students) {
        boolean isExcellent = true;

        for (int j = 0; j < students.getAcademicPerformance().length; j++) {
            if (students.getAcademicPerformance()[j] < 9) {
                isExcellent = false;
                break;
            }
        }

        return isExcellent;
    }

    private void printStudentDossier(Student[] students) {
        for (Student s : students
        ) {
            System.out.println("Student: " + s.getFullName() + ", group: " + s.getGroupNumber());
        }
    }

    private void printExcellentStudentDossier(Student students) {
        if (excellentStudent(students))
            System.out.println("Student: " + students.getFullName() + ", group: " + students.getGroupNumber());
    }

    private void getExcellentStudents(Student[] students) {
        System.out.println("Excellent students: ");

        for (Student s : students
        ) {
            if (excellentStudent(s)) printExcellentStudentDossier(s);
        }
    }

    public void setTrain() {
        Train[] trains = new Train[5];

        trains[0] = new Train("Moscow", 14, "12:45");
        trains[1] = new Train("Berlin", 5, "19:03");
        trains[2] = new Train("Monaco", 7, "7:39");
        trains[3] = new Train("Riga", 14, "23:56");
        trains[4] = new Train("Riga", 1, "4:17");

        getOperationTrains(trains);
    }

    private void menuTrains() {
        System.out.println("Choose operation: ");
        System.out.println("0) Exit");
        System.out.println("1) Print trains with a specific number");
        System.out.println("2) Sort all trains by number");
        System.out.println("3) Sort all trains by destination");
    }

    private void getOperationTrains(Train[] trains) {
        int operation = -1;
        while (operation != 0) {
            menuTrains();
            operation = ConsoleUtils.readInt("Operation: ");

            switch (operation) {
                case 0:
                    break;
                case 1:
                    int numberOfTrain = ConsoleUtils.readInt("Enter number of train: ");
                    printTrainByNumber(trains, numberOfTrain);
                    break;
                case 2:
                    printAllTrains(sortTrainsByNumber(trains));
                    break;
                case 3:
                    printAllTrains(sortTrainsByDestination(trains));
                    break;
                default:
                    System.err.println("There is no such operation!");
                    break;
            }
        }
    }

    private void printTrainByNumber(Train[] trains, int number) {
        int findTrains = 0;
        for (Train t : trains
        ) {
            if (t.getTrainNumber() == number) {
                System.out.println("Train number: " + t.getTrainNumber());
                System.out.println("Train destination: " + t.getDestination());
                System.out.println("Train departure time: " + t.getDepartureTime());
                System.out.println();

                findTrains += 1;
            }
        }
        if (findTrains == 0) System.out.println("There is no train with such number! \n");

    }

    private void printAllTrains(Train[] trains) {
        for (Train t : trains
        ) {
            System.out.println("Train number: " + t.getTrainNumber());
            System.out.println("Train destination: " + t.getDestination());
            System.out.println("Train departure time: " + t.getDepartureTime());
            System.out.println();
        }
    }

    private Train[] sortTrainsByNumber(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length - i - 1; j++) {
                if (trains[j].getTrainNumber() > trains[j + 1].getTrainNumber()) {
                    Train buf = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = buf;
                }
            }
        }

        return trains;
    }

    public int compareByDestination(Train left, Train right) {
        if (left.getDestination().equalsIgnoreCase(right.getDestination()))
            return left.getDepartureTime().compareTo(right.getDepartureTime());
        return left.getDestination().compareTo(right.getDestination());
    }

    private Train[] sortTrainsByDestination(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length - i - 1; j++) {
                if (compareByDestination(trains[j], trains[j + 1]) > 0) {
                    Train buf = trains[j];
                    trains[j] = trains[j + 1];
                    trains[j + 1] = buf;
                }
            }
        }

        return trains;
    }

    public void setCounter() {
        getOperationCounter();
    }

    private void menuCounter() {
        System.out.println("Choose operation: ");
        System.out.println("0) Exit");
        System.out.println("1) Create new counter with custom values");
        System.out.println("2) Create counter with default values");
        System.out.println("3) Increment counter");
        System.out.println("4) Decrement counter");
    }

    private void getOperationCounter() {
        int operation = -1;
        Counter counter = new Counter();

        while (operation != 0) {
            menuCounter();
            operation = ConsoleUtils.readInt("Operation: ");

            switch (operation) {
                case 0:
                    break;
                case 1:
                    counter = fillCounter();
                    counter.getCurrentStatus();
                    break;
                case 2:
                    counter.getCurrentStatus();
                    break;
                case 3:
                    counter.increment();
                    counter.getCurrentStatus();
                    break;
                case 4:
                    counter.decrement();
                    counter.getCurrentStatus();
                    break;
                default:
                    System.err.println("There is no such operation!");
                    break;
            }
        }
    }

    private Counter fillCounter() {
        int current;
        int min = ConsoleUtils.readInt("Enter lowest limit of counter: ");
        int max = ConsoleUtils.readInt("Enter highest limit of counter: ");

        while (true) {
            current = ConsoleUtils.readInt("Enter current status of counter: ");
            if ((current < min) || (current > max))
                System.err.println("Current status out of range!");
            else break;
        }

        return new Counter(min, max, current);
    }

    public void setTime(){
        getOperationTime();
    }

    private void menuCTime() {
        System.out.println("Choose operation: ");
        System.out.println("0) Exit");
        System.out.println("1) Print time");
        System.out.println("2) Change hour");
        System.out.println("3) Change minute");
        System.out.println("4) Change seconds");
    }

    private void getOperationTime() {
        int operation = -1;
        Time time = new Time();

        while (operation != 0) {
            menuCTime();
            operation = ConsoleUtils.readInt("Operation: ");

            switch (operation) {
                case 0:
                    break;
                case 1:
                    time.printTime();
                    break;
                case 2:
                    time.changeHour(ConsoleUtils.readInt("Enter new hours: "));
                    time.printTime();
                    break;
                case 3:
                    time.changeMinute(ConsoleUtils.readInt("Enter new minutes: "));
                    time.printTime();
                    break;
                case 4:
                    time.changeSecond(ConsoleUtils.readInt("Enter new seconds: "));
                    time.printTime();
                    break;
                default:
                    System.err.println("There is no such operation!");
                    break;
            }
        }
    }
}
