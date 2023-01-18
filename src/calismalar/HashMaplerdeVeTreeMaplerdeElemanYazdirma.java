package calismalar;

import java.util.HashMap;
import java.util.Map;

public class HashMaplerdeVeTreeMaplerdeElemanYazdirma {
    public static void main(String[] args) {
        HashMap<String, Integer> kisi = new HashMap<>();
        kisi.put("Ali    ", 12);
        kisi.put("mehmet ", 36);
        kisi.put("Aysa   ", 35);
        kisi.put("Hatica ", 34);

        for (Map.Entry<String, Integer> isim : kisi.entrySet()) {

            System.out.println(isim);
        }

        HashMap<String, Integer> kisi1 = new HashMap<>();
        kisi.put("Ali    ", 12);
        kisi.put("mehmet ", 36);
        kisi.put("Aysa   ", 35);
        kisi.put("Hatica ", 34);

        for (Map.Entry<String, Integer> isim1 : kisi.entrySet()) {
            System.out.println(isim1);
            System.out.println(isim1.getKey());
            System.out.println(isim1.getValue());
        }
    }
}

