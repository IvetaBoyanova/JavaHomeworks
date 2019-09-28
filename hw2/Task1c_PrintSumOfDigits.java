import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int sum = 0;
        while (input > 0) {
            sum = sum + input % 10;
            input = input / 10;
        }
        System.out.println(sum);
    }
}

