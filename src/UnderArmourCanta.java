import java.util.Scanner;

public class UnderArmourCanta extends AnaMenu {

    private String[] modelNames = {
            "Under Armour 1364180-001 Ua Hustle Lite Sirt Cantasi",
            "Under Armour 1361176-002 Ua Hustle 5.0 Sirt Cantasi",
            "Under Armour 1364181-001 Ua Hustle Sport Erkek Sirt Cantasi",
            "Under Armour 1362365-001 Unisex Ua Halftime Sirt Cantasi",
            "Under Armour 1380476-001 Ua London Lite Sirt Cantasi",
            "Under Armour Ua Hustle Pro Sirt Cantasi"
    };

    private double[] modelPrices = {89, 120, 95, 85, 69, 99};

    public void listeleModeller() {
        System.out.println("-------Under Armour Canta Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Under Armour modelini satın almak istersiniz?\n");

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
