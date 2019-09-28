import java.util.Scanner;

public class Task0d_ReadNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= input; i++) {
            int output = sc.nextInt();
            System.out.println(output);
        }

    }
}
