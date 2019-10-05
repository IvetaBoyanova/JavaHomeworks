package Homeworks.hw3;

import java.util.Scanner;

public class Task2a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int max = 0;

        for (int i = 0; i < num; i++) {
            num = scanner.nextInt();
            if (num > max) {
                max = num;
                System.out.println(max);
            }
        }
    }
}

