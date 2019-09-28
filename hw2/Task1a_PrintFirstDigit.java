import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        while (input >= 10) {
            input /= 10;
        }
        System.out.println(input);
    }
}

