package Homeworks.hw3;

import java.util.Scanner;

public class Task3a_IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--)
            reverse = reverse + input.charAt(i);
        if (input.equals(reverse)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
