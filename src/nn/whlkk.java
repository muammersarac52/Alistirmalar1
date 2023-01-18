package nn;

import java.util.Scanner;

public class whlkk {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();

// 1, yol
//        int toplam = 0;
//          while (sayi>0){
//              int rakam = sayi % 10;
//              System.out.println("Rakam = " + rakam);
//              toplam += rakam;
//              sayi /= 10;

        //2.yol
//        int toplam = 0;
//        while (sayi>0){
//            toplam += sayi % 10;
//            sayi /= 10;
      //3.yol
        int toplam = 0;
        while (sayi>0){
            int rakam = sayi % 10;
            toplam += rakam;
            sayi /= 10;




        }
        System.out.println(toplam);


    }
}
