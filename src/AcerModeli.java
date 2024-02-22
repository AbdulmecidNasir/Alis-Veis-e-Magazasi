import java.util.Scanner;

public class AcerModeli extends AnaMenu {

    private String name;
    private double price;

    private String[] modelNames = {
            "Acer Extensa 512GB SSD 16GB Ram Intel IRISxe",
            "Acer Nitro 5 512GB SSD 16GB RAM CORE I7",
            "Acer Aspire 3 512GB SSD 16GB RAM CORE I5",
            "Acer Nitro Predator Helios Neo 1TB SSD 64GB RAM CORE I9",
            "Acer Nitro V15 512GB SSD 16GB RAM AMD Ryzen 7",
            "Acer Aspire 5 256GB SSD 32GB RAM CORE I5"
    };

    private double[] modelPrices = {999, 1299, 1999, 2799, 1299, 1399};

    public void listeleModeller() {
        System.out.println("-------Acer Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Acer modelini satın almak istersiniz?\n");

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
