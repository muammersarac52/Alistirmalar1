package calismalar;

import java.util.Scanner;

public class SayiyiTerstenyazdir2 {
    public static void main(String[] args) {
         int ters = 0;

        System.out.println("Bir tam sayı girin :");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        while(a > 0) {

            ters = ters * 10 + a %10;
            a = a/10;
        }

        System.out.println("Ters çevrilen tam sayı " + ters);
    }
}
