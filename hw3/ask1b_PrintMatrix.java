package Homeworks.hw3;

import java.util.Scanner;

public class ask1b_PrintMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int counter = 1;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[j][i] = counter++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[j][i] = counter++;
                }
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}



