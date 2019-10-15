package Homeworks.hw4.com.Task4_PersonCharacteristics;

import java.util.Scanner;

public class Person {

    private String firstName;
    private String secondName;
    private int year;
    private char gender;
    private double weight;
    private int height;
    private String prof;
    private double[] grades = new double[4];

    public Person(String firstName, String secondName, int year, char gender, double weight, int height, String prof, double[] grades) {
        setFirstName(firstName);
        setSecondName(secondName);
        setYear(year);
        setGender(gender);
        setWeight(weight);
        setHeight(height);
        setProf(prof);
        setGrades(grades);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0) {
            throw new IllegalArgumentException("Invalid First Name!");
        }
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if (secondName == null || secondName.length() == 0) {
            throw new IllegalArgumentException("Invalid Second Name!");
        }
        this.secondName = secondName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Invalid Age!");
        }
        this.year = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            throw new IllegalArgumentException("Invalid Gender!");
        }
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Invalid Weight!");
        }
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 0) {
            throw new IllegalArgumentException("Invalid Height!");
        }
        this.height = height;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        if (prof == null || prof.length() == 0) {
            throw new IllegalArgumentException("Invalid Profession!");
        }
        this.prof = prof;
    }

    public double[] getGrades() {
        double[] copy = new double[this.grades.length];

        for (int i = 0; i < this.grades.length; ++i) {
            copy[i] = this.grades[i];
        }

        return copy;
    }

    public void setGrades(double[] grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Invalid grades array");
        }

        this.grades = new double[grades.length];
        for (int i = 0; i < grades.length; ++i) {
            this.grades[i] = grades[i];
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        Person[] person = new Person[N];
        String s = "";

        for (int i = 0; i < N; ++i) {

            String firstName = scanner.nextLine();
            String secondName = scanner.nextLine();
            int year = Integer.parseInt(scanner.nextLine());
            char gender = scanner.nextLine().charAt(0);
            double weight = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            String prof = scanner.nextLine();

            double[] grades = new double[4];

            String line = scanner.nextLine();
            String[] params = line.split(" ");

            grades[0] = Double.parseDouble(params[0]);
            grades[1] = Double.parseDouble(params[1]);
            grades[2] = Double.parseDouble(params[2]);
            grades[3] = Double.parseDouble(params[3]);

            year = 2016 - year;
            person[i] = new Person(firstName, secondName, year, gender, weight, height, prof, grades);

            double average = 0;
            double total = 0;
            for (int j = 0; j < grades.length; j++) {
                total = total + grades[j];
            }
            average = total / grades.length;


            String s1, s2, s3;
            if (gender == 'M') {
                s1 = "His";
                s2 = "He";
                s3 = "he";
            } else {
                s1 = "Her";
                s2 = "She";
                s3 = "she";

            }

            if (year < 18) {
                s += String.format("%s %s is %d years old. %s weight is %.2f and %s is %d cm tall. " +
                                "%s is a %s with an average grade of %.3f. %s %s is under-aged.%n",
                        person[i].getFirstName(), person[i].getSecondName(), person[i].year, s1, person[i].getWeight(),
                        s3, person[i].getHeight(), s2, person[i].getProf(), average,
                        person[i].getFirstName(), person[i].getSecondName());
            } else {
                s += String.format("%s %s is %d years old. %s weight is %.2f and %s is %d cm tall. " +
                                "%s is a %s with an average grade of %.3f.%n",
                        person[i].getFirstName(), person[i].getSecondName(), person[i].year, s1, person[i].getWeight(), s3,
                        person[i].getHeight(), s2, person[i].getProf(), average);
            }
        }
        System.out.print(s);
    }
}



