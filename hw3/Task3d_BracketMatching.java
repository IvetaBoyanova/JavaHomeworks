package Homeworks.hw3;

import java.util.Scanner;
import java.util.Stack;

public class Task3d_BracketMatching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();

        boolean isBalanced = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.charAt(i);
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
            } else {
                if (bracket == '}') {
                    bracket = '{';
                } else if (bracket == ')') {
                    bracket = '(';
                } else if (bracket == ']') {
                    bracket = '[';
                }

                if (stack.empty()) {
                    isBalanced = false;
                    break;
                }

                if (bracket == stack.peek()) {
                    stack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
