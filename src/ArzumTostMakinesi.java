import java.util.Scanner;

public class ArzumTostMakinesi extends AnaMenu {

    private String[] modelNames = {
            "Arzum Ar2001 Tostcu Delux Granit Tost Makinesi 1800w",
            "Arzum AR2007 Sultane Izgara Tost Makinesi 1800w Kirmizi",
            "Arzum AR2035 Tostcu Neo Granite Granit Tost Makinesi 1800w",
            "Arzum Ar2044 Inx Kantintost Paslanmaz Celik Pro Izgara ve Tost Makinesi 1800w",
            "Arzum AR2005 Panini Izgara ve Tost Makinesi 2000w",
            "Arzum AR2019 Murdum Tostcu Delux Izgara ve Tost Makinsi 2000w"
    };

    private double[] modelPrices = {179, 149, 249, 285, 199, 359};

    public void listeleModeller() {
        System.out.println("-------Arzum Tost Makinasi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Arzum modelini satın almak istersiniz?\n");

        // Model bilgilerini listeleyin
        for (int i = 0; i < modelNames.length; i++) {
            System.out.println((i + 1) + ". " + modelNames[i] + " - " + modelPrices[i] + "$");
        }

        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();

        if (secim < 1 || secim > modelNames.length) {
            System.out.println("Yanlış numara girdiniz. Tekrar deneyin.");
        } else {
            // Seçimi bir dizi içinde döndür
            System.out.println("Seçilen model: " + modelNames[secim - 1] + "\nModel Fiyati : " + modelPrices[secim - 1] + "$");
        }
    }

    public String getModelInfo(int secim) {
        if (secim >= 1 && secim <= modelNames.length) {
            String name = modelNames[secim - 1];
            String price = String.valueOf(modelPrices[secim - 1]);
            return "Seçilen model: " + name + " - Fiyat: " + price + "$";
        } else {
            return "Geçersiz bir seçim yaptınız.";
        }
    }
}
