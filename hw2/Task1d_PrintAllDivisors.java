import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
