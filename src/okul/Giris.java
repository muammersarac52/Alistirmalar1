package okul;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    static Scanner scan =new Scanner(System.in);
    static List<OgretmenBilgileri> ogretmenList=new ArrayList();

    public static void main(String[] args) {

        System.out.println("Hosgeldiniz");
        System.out.println("Isim giriniz");
        String isim= scan.nextLine();

        System.out.println("SoyIsim giriniz");
        String soyIsim= scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("bransinizi giriniz");
        String brans= scan.next();


        System.out.println("tel giriniz");
        String tel = scan.next();



        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyIsim,yas,brans,tel);

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);






    }


}
