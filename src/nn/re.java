package nn;

import java.util.Scanner;

public class re {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi= scanner.nextInt();

        int toplam=0;
        while(sayi > 0) {

            int rakam = sayi % 10;

            System.out.println(rakam + "' ın karesi = " + (rakam * rakam));
            toplam += (rakam * rakam);
            sayi /= 10;
        }
        System.out.println("Girilen sayinin karelerinin toplamı = " + toplam);
    }
}
