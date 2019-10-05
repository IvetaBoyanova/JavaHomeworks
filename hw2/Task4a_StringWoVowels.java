package Homeworks.hw2;

import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();


        for (int i = 0; i < input.length(); i++) {
            if (!(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u')) {
                System.out.print(input.charAt(i));
            }
        }
    }
}

//        String newInput = scanner.replaceAll("[aeiou]", "");
//
//        System.out.println(newInput);
//    }
//}




