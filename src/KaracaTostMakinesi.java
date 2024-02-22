import java.util.Scanner;

public class KaracaTostMakinesi extends AnaMenu {

    private String[] modelNames = {
            "Karaca Future Essential Matte Black Tost Makinesi 1800w",
            "Karaca Gastro Classic Izgara ve Tost Makinesi 2000w",
            "Karaca Perfect Grill 2005 Izgara ve Tost Makinesi 1800w",
            "Karaca Rosegold Granit Izgara ve Tost Makinesi 2000w",
            "Karaca Future Plus Biodiamond Pearly Pink Tost Makinesi 2000w",
            "Karaca Perfect Grill 2006 Izgara ve Tost Makinesi 2000w"
    };

    private double[] modelPrices = {129, 189, 149, 255, 199, 259};

    public void listeleModeller() {
        System.out.println("-------Karaca Tost Makinasi Modeller Kategorisine Hoş Geldiniz !--------\n");
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
