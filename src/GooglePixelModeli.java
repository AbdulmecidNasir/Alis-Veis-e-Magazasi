import java.util.Scanner;

public class GooglePixelModeli extends AnaMenu {

    private String[] modelNames = {
            "Google Pixel 8 Pro 1TB",
            "Google Pixel 8 512GB",
            "Google Pixel 7 Pro 256GB",
            "Google Pixel Fold 512GB",
            "Google Pixel 6a 64GB",
            "Google Pixel 6 Pro 512GB"
    };

    private double[] modelPrices = {1899, 1799, 1499, 1749, 999, 1299};

    public void listeleModeller() {
        System.out.println("-------Google Pixel Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Google Pixel modelini satın almak istersiniz?\n");

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
