package nn;

import java.util.Arrays;
import java.util.Scanner;

public class diziElemanlariTerstenYazdirma {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        int[] dizi = new int[4];
        int yeni[] = new int[dizi.length];
        String yeniDizi="";
        int iyeni=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Dizinin " + (i + 1) + ".emamnını giriniz:");
            dizi[i] = scan.nextInt();
        }
        System.out.println("Dizinin tersten yazılmış hali\n");
        for (int i = dizi.length - 1; i >= 0; i--) {
            yeni[iyeni]=dizi[i];
            iyeni++;
        }
        System.out.println(Arrays.toString(yeni));
    }
}

