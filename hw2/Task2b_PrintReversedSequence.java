import java.util.Scanner;

public class Task2b_PrintReversedSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        String rev = "";

        for (int i = 0; i < num; ++i) {
            rev = sc.nextInt() + " " + rev;
        }
        System.out.println(rev);
    }
}



