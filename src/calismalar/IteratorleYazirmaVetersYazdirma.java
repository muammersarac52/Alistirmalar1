package calismalar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorleYazirmaVetersYazdirma {
    public static void main(String[] args) {
//        List<Integer> list= new ArrayList<>();
//
//        list.add(5);
//        list.add(7);
//        list.add(8);
//        list.add(6);
//        list.add(9);


//        ListIterator itr= list.listIterator();
//
//        while (itr.hasNext()){
//            System.out.print("Orijinal linked list:"+itr.next()+" ");
//        }
//        System.out.println();
////        System.out.println("========");
//        while (itr.hasPrevious()){
//            System.out.println(itr.previous()+ " ");
//        }

        LinkedList<String> elements = new LinkedList<>();
        elements.add("sari");
        elements.add("mavi");
        elements.add("yesil");
        elements.add("kirmizi");
        elements.add("beyaz");
        elements.add("mor");
        System.out.println("Orijinal linked list:"+elements);

        ListIterator itr1= elements.listIterator();
        while (itr1.hasNext()){
           itr1.next();
        }
        System.out.println();
        System.out.println("LinkedList Tersi:\n");
        while (itr1.hasPrevious()){
            System.out.println(itr1.previous()+"\n");
        }

    }
}
