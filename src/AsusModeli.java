import java.util.Scanner;

public class AsusModeli extends AnaMenu {
    private String[] modelNames = {
            "Asus Vivobook 15 1TB SSD",
            "Asus Rog Srtix 1TB SSD 32GB RAM CORE I7",
            "Asus Tuf Gaming 512GB SSD 16GB RAM CORE I5",
            "Asus Expertbook 512GB SSD 8GB RAM CORE I3",
            "Asus X515E5 256GB SSD 16GB RAM CORE I5",
            "Asus Rog Srtix Scar 16 2TB SSD 64GB RAM CORE I9"
    };

    private double[] modelPrices = {2099, 3299, 1999, 1249, 999, 4999};

    public void listeleModeller() {
        System.out.println("-------ASUS Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi ASUS modelini satın almak istersiniz?\n");

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
            System.out.println("Seçilen model: " + modelNames[secim - 1]+ "\nModel Fiyati : " +modelPrices[secim - 1]+ "$");
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
