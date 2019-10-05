package Homeworks.hw3;

import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] counters = new char[5];
        for (char i = 0; i < counters.length; i++)
        {
           int index = counters[i] - 1;
            counters[index]++; // 4 - 3 = 1 -> counters[1]++;
        }
       // System.out.printf();
        }
    }
