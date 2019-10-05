package Homeworks.hw3;

import java.util.Scanner;

public class Task2c_PrintClusterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            while (i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
                i++;
            }

            if (i > index) {
                counter++;
            }
        }
        System.out.print(counter);
    }
}




