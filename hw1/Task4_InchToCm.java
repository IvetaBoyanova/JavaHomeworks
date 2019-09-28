import java.util.Scanner;

public class Task4_InchToCm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double input = Double.parseDouble(sc.nextLine());
        double result = 0;

        result = input * 2.54;
        result = (double)Math.round(result * 10000) / 10000;
        System.out.println(result);
    }
}