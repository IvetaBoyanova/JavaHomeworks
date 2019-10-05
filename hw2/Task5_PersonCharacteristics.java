package Homeworks.hw2;

import java.util.Scanner;

public class Task5_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String s = "";
        for (int i = 0; i < n; i++) {
            String firstName = scanner.nextLine();
            String secondN = scanner.nextLine();
            int year = Integer.parseInt(scanner.nextLine());
            double weight = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            String prof = scanner.nextLine();
            year = 2014 - year;

            if (year < 18) {
                s += String.format(" %s %s is %d years old. His weight is %.6f and he is %d cm tall. He is a %s. %s %s is under-aged.", firstName, secondN, year, weight, height, prof, firstName, secondN);

            } else {
                s += String.format(" %s %s is %d years old. His weight is %.6f and he is %d cm tall. He is a %s.", firstName, secondN, year, weight, height, prof);
            }
        }
        System.out.print(s);
    }
}

