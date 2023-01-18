package calismalar;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MaplerdeElemanlariYazdir {
    public static void main(String[] args) {
        HashMap<String, Integer> studentAges = new HashMap<>();

        studentAges.put("Ali", 13);//{Ali=13}
        studentAges.put("Tom", 21);
        studentAges.put("Bred", 12);
        studentAges.put("Ajda", 83);
        studentAges.put("Cuneyt", 75);
        studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandigiizda overwrite yapar //{Bred=12, Tom=21, Ajda=83, Cuneyt=75, Ali=88}//Alinin son degerini alir
        studentAges.put(null, 55);
        studentAges.put(null, 66);
        studentAges.put("Ayhan Isik", null);
        studentAges.put("Ayhan ", null);

        Set<String> names = studentAges.keySet();
        String sum1 = "";
        for (String w : names) {
            if (w != null && !w.startsWith("A")) {
                sum1 = sum1 + w + " ";

            }
        }
        System.out.print(sum1 + " ");


        //Example 1++++> Tum Integer yaslarin ortalamasini hesaplayan kodu yaziniz

        Collection<Integer> values1 = studentAges.values();
        int sum = 0;
        double counter = 0;
        for (Integer w : values1) {
            if (w != null) {
                sum = sum + w;
                counter++;
            }
        }
    }
}

