package nn;

import java.util.Scanner;

public class Sggg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tam adinizi giriniz ");
        String tamAd = input.nextLine();
        char ilkHarf =tamAd.toUpperCase().split(" ")[0].charAt(0);
        System.out.println(ilkHarf);

    }
}
