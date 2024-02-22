import java.util.Scanner;

public class TefalTostMakinesi extends AnaMenu {

    private String[] modelNames = {
            "Tefal GC70D Gourmet Minute Tost Makinsi Gri 2000w",
            "Tefal GC19E Toast Expert Elektrikli Izgara ve Tost Makinesi Gri 2000w",
            "Tefal GC12D Optigrill+ Elektrikli Akıllı Izgara Tost Makinesi",
            "Tefal GC461B Supergrill XL Izgara ve Tost Makinesi 2000w",
            "Tefal GC2225 Chef Comfort Tost Makinesi Kırmızı 2000w",
            "Tefal Ultra Compact Health Grill Comfort Tost Makinesi Gc306012"
    };

    private double[] modelPrices = {169, 149, 249, 285, 279, 459};

    public void listeleModeller() {
        System.out.println("-------Tefal Tost Makinasi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Tefal modelini satın almak istersiniz?\n");

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
