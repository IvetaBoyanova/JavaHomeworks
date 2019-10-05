package Homeworks.hw2;

import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] words = input.split("\\. ");
        for (String i : words) {
            System.out.println(i.concat("."));

        }
    }
}