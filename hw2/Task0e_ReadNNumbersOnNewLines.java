import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= input; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= input; i++) {
            System.out.print(i + " ");
        }
    }
}

