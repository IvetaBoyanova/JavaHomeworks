package Homeworks.hw2;

import java.util.Scanner;

public class Task3a_PrintSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("* ");
            for (int j = 2; j < n; j++) {
                if (i == 0) {
                    stringBuilder.append("* ");
                } else if (i == n - 1) {
                    stringBuilder.append("* ");
                } else {
                    stringBuilder.append("  ");
                }
            }
            stringBuilder.append("* ");
            System.out.println(stringBuilder);

        }
    }
}
