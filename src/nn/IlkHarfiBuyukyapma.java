package nn;

public class IlkHarfiBuyukyapma {
    public static void main(String[] args) {
        String sehirIsim = " mIAMI ";
        String konsolSehirIsım = sehirIsim.trim().toLowerCase();
        konsolSehirIsım = konsolSehirIsım.substring(0,1).toUpperCase() +
                konsolSehirIsım.substring(1);
        System.out.println(konsolSehirIsım);
    }
}

