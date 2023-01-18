package okul;

import java.util.Scanner;

public class UzunKelime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = scan.nextLine();

        System.out.println("enuzunkelime(cumle) = " + enuzunkelime(cumle));


    }

    public static String enuzunkelime(String cumle) {
        String arr[] = cumle.split(" ");
        int max = 0;
        String uzunkelime = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                uzunkelime = arr[i];
            }

        }
        return uzunkelime;
    }
}
