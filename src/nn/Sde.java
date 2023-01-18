package nn;

import java.util.Scanner;

public class Sde {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char karakter = input.next().charAt(0);

        if ((karakter>='a'&& karakter<='z')||(karakter>='A'&&karakter<='Z'))
    {
            System.out.println("harf");
        }else {
            System.out.println("girdigin harf degil");
        }


    }
}
