import java.util.Scanner;

public class Task7_PersonCharacteristics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        int year = Integer.parseInt(sc.nextLine());
        double weight = Double.parseDouble(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        String profession = sc.nextLine();
        year = 2014 - year;

        System.out.printf("%s %s is %d years old. His weight is %.1f and he is %d cm tall. He is a %s.", firstName, secondName, year, weight, height, profession);
    }
}
