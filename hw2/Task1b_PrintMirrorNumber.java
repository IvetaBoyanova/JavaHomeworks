import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int reverse = 0;
        while (input > 0) {
            reverse = reverse * 10;
            reverse = reverse + input % 10;
            input = input / 10;
        }
        System.out.println(reverse);
    }
}
