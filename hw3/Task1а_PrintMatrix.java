package Homeworks.hw3;

import java.util.Scanner;

public class Task1а_PrintMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[][] = new int[n][n];
        int counter = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                arr[j][i] = counter++;
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



