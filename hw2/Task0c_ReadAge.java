import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        if (input >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }
    }
}