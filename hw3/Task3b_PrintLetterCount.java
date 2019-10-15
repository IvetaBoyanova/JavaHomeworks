package Homeworks.hw3;

import java.util.Scanner;

public class Task3b_PrintLetterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int MAX_CHAR = 256;
        int count[] = new int[MAX_CHAR];


        for (int i = 0; i < text.length(); i++)
            count[text.charAt(i)]++;

        char ch[] = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            ch[i] = text.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (text.charAt(i) == ch[j])
                    find++;
            }

            if (find == 1)
                System.out.println(text.charAt(i) + "(" + count[text.charAt(i)] + ")");
        }
    }
}

