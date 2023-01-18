package nn;

import java.util.Scanner;

public class Ddd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gun adinin ilk harfini yaziniz");
        char ilkHarf = input.next().charAt(0);
      if (ilkHarf=='c'||ilkHarf=='C'){
          System.out.println("cuma ,cumartesiveya carsamba");

        } else if (ilkHarf=='p'||ilkHarf=='P') {
          System.out.println("pazar,pazartesi veya persembe");
      } else if (ilkHarf=='s'||ilkHarf=='S') {
          System.out.println("sali");
      }else {
          System.out.println("yanlis!! Lutfen tekrara dene aptal misin oglum");
      }

    }


}
