package Homeworks.hw3;

import java.util.Scanner;

public class Task2d_PrintSplitIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[N];
        int sum = 0;
        int sum1 = 0;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];

            if (sum - sum1 == sum1) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("No");
        } else {
            System.out.println(index);
        }
    }
}









