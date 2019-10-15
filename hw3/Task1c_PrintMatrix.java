package Homeworks.hw3;

import java.util.Scanner;

public class Task1c_PrintMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int matrix[][] = new int[rows][cols];
        int counter = 1;
        int startRow = 0;
        int startCol = 0;
        int row = startRow;
        int col = startCol;
        for (int c = 0; c < rows * cols; c++) {
            matrix[row][col] = counter++;
            row--;
            col++;
            if (row < 0 || col >= cols) {
                startRow++;
                if (startRow >= rows) {
                    startRow = rows - 1;
                    startCol++;
                }
                row = startRow;
                col = startCol;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



