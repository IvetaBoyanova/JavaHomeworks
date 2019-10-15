package Homeworks.hw3;

import java.util.Scanner;

public class Task3c_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String encodeOrDecodeMessage = scanner.nextLine();
        int key = 1;

        if (encodeOrDecodeMessage.equals("encode")) {
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                if (c == ' ') {
                    System.out.print(" ");
                }else if(c == '.'){
                    System.out.print(".");
                } else {
                    System.out.print((char) (c + key));
                }
            }
            System.out.println();
        }
        if (encodeOrDecodeMessage.equals("decode")) {
            for (int i = 0; i < message.length(); i++) {
                char c = message.charAt(i);
                if (c == ' ') {
                    System.out.print(" ");
                }else if(c == '.'){
                    System.out.print(".");
                } else {
                    System.out.print((char) (c - key));
                }
            }
            System.out.println();
        }
    }
}
