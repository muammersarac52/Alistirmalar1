package nn;

import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();

        for (int i = sayi1; i < sayi2; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " sayısı üçün katıdır.");
            }
        }
    }
}
