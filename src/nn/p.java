package nn;

import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0, rakam;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        while(sayi > 0) {

            rakam = sayi % 10;
            System.out.println(rakam + "' ın karesi = " + (rakam * rakam));
            toplam += (rakam * rakam);
            sayi /= 10;
        }
        System.out.println("Girilen sayinin karelerinin toplamı = " + toplam);
    }
}
