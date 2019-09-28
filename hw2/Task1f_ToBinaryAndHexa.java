import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int rem = 0;
        int dec = 0;

        for (int i = 0; i <input; i++) {
            while (input > 0) {
                rem = input % 2;
                dec = dec + rem * i;
                i = i * 2;
                input = input / 10;
            }

            System.out.print(i +"");
        }
    }
}

