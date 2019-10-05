import java.util.Scanner;

public class Task0e_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());
        String s = "";

        for (int i = 0; i < input; i++) {
            String output = sc.nextLine();
            s += output + " ";
        }
        System.out.print(s);
    }
}








