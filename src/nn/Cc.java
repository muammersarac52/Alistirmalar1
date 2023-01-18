package nn;

import java.util.Scanner;

public class Cc {
    public static void main(String[] args) {
        String s = "Ali Can?";
        s = s.replaceAll("[^a-z]", "");
        String t = "";

        for(int i=0; i<s.length(); i++){
            String r = s.substring(i,i+1);
            t = t + r + '*';
        }
        System.out.println(t);
    }
}
