package okul;

public class OgretmenBilgileri {
String isim;
String soyIsim;
int yas;
String brans;
String tel;

    public OgretmenBilgileri() {
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri" +
                " \nisim=" + isim +
                " \nsoyIsim='" + soyIsim +
                " \nyas=" + yas +
                " \nbrans=" + brans +
                " \ntel=" + tel +'}';

    }

    public OgretmenBilgileri(String isim, String soyIsim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;

    }
}
