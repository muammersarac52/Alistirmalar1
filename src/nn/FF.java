package nn;

public class FF {
    public static void main(String[] args) {
      String a = "Muammer Sarac";
       a.replaceAll("[^a-z-A-Z]","");
      String t="";

        System.out.println(a);
        for (int i = 0;i<a.length();i++){
           String r= a.substring(i,i+1);
              t=t+r+"*";
        }
        System.out.println(t);

    }
}
