import java.util.Scanner;

public class Task2_LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean leapYear = false;

        if ((year % 4 == 0) && ((year % 100 != 0) || ((year % 400 == 0)))) {
            leapYear = true;
            System.out.println(leapYear);
        } else {
            System.out.println(leapYear);

        }
    }
}
