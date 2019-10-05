package Homeworks.hw3;

import java.util.Scanner;

public class Task2e_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int start = 0;
        int finish = 0;
        int length = 0;
        int counter = 0;

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            while (i < numbers.length - 1 && numbers[i] < numbers[i + 1]) {
                i++;
            }

            if (i - index + 1 > length) {
                length = i - index + 1;
                start = index;
                finish = i;
            }
        }
        for (int i = start; i <= finish; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

