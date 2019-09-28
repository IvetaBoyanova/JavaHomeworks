import java.util.Scanner;

public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int seconds = (number % 60);
        int minutes = (number / 60 % 60);
        int hours = (number / 3600 % 24);
        int days = (number / 3600 / 24);

        System.out.printf("%d days, %d hours, %d minutes, %d seconds", days, hours, minutes, seconds);
    }
}
