package nn;

public class Bb {
    public static void main(String[] args) {
        String s = "Ali Can mahmt tuncer?";
        s = s.replaceAll("[^a-z]", "");
        System.out.println(s);

        //lican

        String t = "";
        for(int i=0; i<s.length(); i++){
        String r    =s.substring(i,i+1);

            t=t+r+"*";


    } System.out.println(t);


}
}

