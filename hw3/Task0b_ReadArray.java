package Homeworks.hw3;

import java.util.Scanner;

public class Task0b_ReadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print((numbers[i] + ","));
        }

        System.out.print(numbers[N - 1]);
    }
}

