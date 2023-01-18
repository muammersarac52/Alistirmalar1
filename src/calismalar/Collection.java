package calismalar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collection {
    public static void main(String[] args) {
        //verilen liste tum elemani ekranda yaziniz.
        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        // System.out.println(liste); // [5, 7, 8, 6, 9]
        // for each kullanarak her elementi 2 artiralim

//        for (Integer each : liste) {
//            each = each + 2;
//            System.out.print(each + " " + "\n");
//        }
//        System.out.println("*****");
//
//        for (Integer w : liste) {
//            liste.set(liste.indexOf(w), w + 2);
//
//        }
//        System.out.print(liste);
//
//
//        for (Integer w : liste) {
//            System.out.print((w + 2) + " ");
//        }


        // bir listede ortalamanin ustunde olan elemanlarin sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);
        double ortalama = 0.0;
        double toplam = 0.0;
        for (Double w:sayilar ) {
            toplam+=w;
        }
        double ort=toplam/sayilar.size();
        System.out.println("ort = " + ort);//ort = 3.875




        List<Double>ortalamaninUstundekiler=new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)>ort){
                ortalamaninUstundekiler.add(sayilar.get(i));
            }
        }
        System.out.println(ortalamaninUstundekiler);







        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        List<Integer> sayilar1 = new LinkedList<>();
        sayilar1.add(1);
        sayilar1.add(3);
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(5);
        sayilar1.add(6);
        sayilar1.add(1);
        sayilar1.add(7);

        System.out.println(tekrarsizListeOlustur(sayilar1));

    }

    public static List<Integer> tekrarsizListeOlustur(List<Integer> sayiLer){

        List<Integer> tekersizList=new LinkedList<>();
        for (int i=0;i<sayiLer.size(); i++){
            if (!tekersizList.contains(sayiLer.get(i))){
                tekersizList.add(sayiLer.get(i));
            }

        }
        return tekersizList;













    }

}
