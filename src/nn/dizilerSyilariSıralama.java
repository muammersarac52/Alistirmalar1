package nn;

import java.util.Arrays;

public class dizilerSyilariSıralama {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 8, 7, 3, 4, 5};
        Arrays.sort(sayilar);
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(" ");
            System.out.print(sayilar[i]);
        }
    }
}
