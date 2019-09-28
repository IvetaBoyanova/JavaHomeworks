import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n1; i++) {
            int n2 = scanner.nextInt();

            if (n2 % 2 == 0) {

                System.out.print(n2 + " ");

            }
        }
    }
}

