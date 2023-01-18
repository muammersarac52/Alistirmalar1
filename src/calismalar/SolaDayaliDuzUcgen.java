package calismalar;

import java.util.Scanner;

public class SolaDayaliDuzUcgen {
    public static void main(String[] args) {


        //Artan yildiz
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
        System.out.println("******");
        Scanner klavye = new Scanner(System.in);
        System.out.println("Alt alta kaç sıra olsun ? ");
        Scanner inp = new Scanner(System.in);
        int sira = inp.nextInt();

        for (int i = 1; i <= sira; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}








