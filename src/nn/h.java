package nn;

import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        double num = 75.4238;
        String s = String.valueOf(num);

        int idxOfComma = s.indexOf(".");

        String decimalPart = s.split("\\.")[1];//  s.substring(idxOfComma+1);

        String t = "";
        for(Integer i=0; i<decimalPart.length(); i++){
            String r = decimalPart.substring(i,i+1);
            t = t + "*" + r;
        }
        System.out.println(t);




            }
        }
