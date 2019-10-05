import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

//        String binary = "";
//
//        while (decimal != 0) {
//
//            binary = (decimal % 2) + binary;
//            decimal = decimal / 2;
//        }
//            System.out.println(binary);
//
//
        System.out.println(Integer.toString(decimal, 2));
        System.out.println(Integer.toString(decimal, 16).toUpperCase());
    }
}











