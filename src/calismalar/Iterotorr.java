package calismalar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterotorr {
    public static void main(String[] args) {
        LinkedList<String> elements = new LinkedList<>();
        elements.add("sari");
        elements.add("mavi");
        elements.add("yesil");
        elements.add("kirmizi");
        elements.add("beyaz");
        elements.add("mor");
        Iterator iterator=elements.iterator();
        ListIterator iterator1=elements.listIterator();

       System.out.println(elements);

        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());
        System.out.println(iterator1.next());

        System.out.println();
        System.out.println("LinkedList Tersi:");
        System.out.println(iterator1.previous());
        System.out.println(iterator1.previous());
        System.out.println(iterator1.previous());
        System.out.println(iterator1.previous());
        System.out.println(iterator1.previous());
        System.out.println(iterator1.previous());




    }

}
