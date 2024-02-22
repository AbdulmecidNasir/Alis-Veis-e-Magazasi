import java.util.Scanner;

public class XiaomiModel extends AnaMenu {

    private String[] modelNames = {
            "Xiaomi 14 pro 1TB",
            "Xiaomi 13T pro 512GB",
            "Xiaomi Redmi 12 5G 256GB",
            "Xiaomi 13 Lite 128GB",
            "Xiaomi 11 SE 128GB",
            "Xiami Redmi 10C 64GB"
    };

    private double[] modelPrices = {1799, 1699, 1499, 1249, 629, 559};

    public void listeleModeller() {
        System.out.println("-------Xiaomi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Xiaomi modelini satın almak istersiniz?\n");

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
