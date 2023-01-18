package nn;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        java.util.List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('u');
        m.add('z');
        m.add('t');

        java.util.List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
        Integer counter = 0;   //flack denir

        for (int i = 0; i < m.size(); i++) {
            if (m.size()!=n.size()){
                counter++;
                System.out.println("esit degil");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("esit degildir");
                break;
            }

        }if (!(counter == 0)) {
            System.out.println("esittir");
        }

    }
}
