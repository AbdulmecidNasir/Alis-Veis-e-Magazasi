import java.util.Scanner;

public class MacbookModeli extends AnaMenu {

    private String name;
    private double price;

    private String[] modelNames = {
            "Macbook Air M1 512GB SSD QHD 16GB Ram",
            "Macbook Pro M2 512GB SSD 16GB RAM macOS 13",
            "Macbook Air M2 512GB SSD 16GB RAM CORE I5",
            "Macbook Air M3 1TB SSD 64GB RAM macOS 14",
            "Macbook Pro M3 512GB SSD 16GB RAM macOS 14",
            "Macbook Pro M3 Pro 1TB SSD 32GB RAM macOS 14"
    };

    private double[] modelPrices = {1499, 2799, 1999, 2499, 2899, 2999};

    public void listeleModeller() {
        System.out.println("-------Macbook Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Macbook modelini satın almak istersiniz?\n");

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
