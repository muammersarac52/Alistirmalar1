package calismalar;

public class RasgeleSayininrakamlariniTopla {
    public static void main(String[] args) {
        int randomSayi=(int)Math.random()*(1000);
         //0 ile 1000 arasında sayı
        System.out.println("random sayi " + randomSayi); //üretilen sayıyı konsola bastırdık


        int birler = randomSayi %10; //birler basamağı
        int onlar = (randomSayi /10) %10;   //onlar basamağı
        int yuzler = (randomSayi /100) %10;  //yüzler basamağı

        System.out.println("Toplamları ="+(birler+onlar+yuzler));
    }
}
