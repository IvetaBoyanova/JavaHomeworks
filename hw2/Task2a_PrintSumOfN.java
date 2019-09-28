import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n1; i++) {
            int n2 = scanner.nextInt();
            sum = sum + n2;
        }
        System.out.println(sum);
    }
}


