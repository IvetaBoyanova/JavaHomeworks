import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());
        boolean isPrime = true;

        if (input <= 1)
            isPrime = false;

        for (int i = 2; i < input; i++)
            if (input % i == 0)
                isPrime = false;
        System.out.println(isPrime);
    }
}



