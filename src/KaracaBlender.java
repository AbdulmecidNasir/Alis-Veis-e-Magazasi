import java.util.Scanner;

public class KaracaBlender extends AnaMenu {

    private String[] modelNames = {
            "Karaca Multiblend Smoothie Blender Krem 1000w",
            "Karaca Pro Multimax 6 in 1 Cok Amacli Mutfak Robotu Red",
            "Karaca Mastermaid Power Essential Red Mutfak Robotu, Blender Seti 2000w",
            "Karaca Pro Spiral Mutfak Robotu Red Gold 1500w",
            "Karaca Blendfit Go Personel Kisisel Smoothie Blender Rosegold",
            "Karaca Inox Powermix Smoothie Blender 1801 500+ml"
    };

    private double[] modelPrices = {149, 169, 199, 185, 179, 239};

    public void listeleModeller() {
        System.out.println("-------Karaca Blender Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Karaca modelini satın almak istersiniz?\n");

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
