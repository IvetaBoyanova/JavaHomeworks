package Homeworks.hw3;

import sun.font.FontRunIterator;

import java.util.Scanner;

public class Task4_PersonCharacteristics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String s = "";
        for (int i = 0; i < n; i++) {
            String firstName = scanner.nextLine();
            String secondName = scanner.nextLine();
            int year = Integer.parseInt(scanner.nextLine());
            char gender = scanner.nextLine().charAt(0);
            double weight = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            String prof = scanner.nextLine();

            double[] grades = new double[4];
            for (int j = 0; j < grades.length; j++) {
                grades[i] = Double.parseDouble(scanner.nextLine());
            }
            year = 2014 - year;

            double average = 0;
            double total = 0;
            for (int j = 0; j < grades.length; j++) {
                total = total + grades[i];
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
                s += String.format("%s %s is %d years old. %s weight is %.1f and %s is %d cm tall. " +
                                "%s is a %s with an average grade of %.3f. %s %s is under-aged.%n",
                        firstName, secondName, year, s1, weight, s3, height, s2,
                        prof, average, firstName, secondName);
            } else {
                s += String.format("%s %s is %d years old. %s weight is %.1f and %s is %d cm tall. " +
                                "%s is a %s with an average grade of %.3f.%n",
                        firstName, secondName, year, s1, weight, s3, height, s2, prof, average);
            }
        }
        System.out.print(s);
    }
}

