package Homeworks.hw3;

import java.util.Scanner;

public class Task2g_LargestSumSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            count = count + arr[i];

            if (count > max) {
                max = count;
            }
            if (count < 0) {
                count = 0;
            }
        }
        System.out.print(max);
    }
}



