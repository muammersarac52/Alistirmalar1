package calismalar;

import java.util.Scanner;

public class StringiTersCevirMethodIle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime giriniz: ");
        String metin = scan.nextLine();

        System.out.println(tersYaz(metin));


        String originalStr = "Hello";
        String reversedStr = "";
        System.out.println("Original string: " + originalStr);

        for (int i =originalStr.length()-1 ; i >=0 ; i--) {
            reversedStr = reversedStr+ originalStr.charAt(i);
        }

        System.out.println("Reversed string: "+ reversedStr);

    }

    static String tersYaz(String metin) {
        String sonuc = "";

        for (int i = metin.length() - 1; i >= 0; i--) {
            sonuc += metin.charAt(i);
        }return sonuc;


    }
}




