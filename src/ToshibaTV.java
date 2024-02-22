import java.util.Scanner;

public class ToshibaTV {
    private String name;
    private double price;

    private String[] modelNames = {
            "Toshiba 65 163 Ekran Uydu Crystal 4K HD Smart LED TV",
            "Toshiba 75 Crystal 8K QLED Smart LED TV",
            "Toshiba 55 138 Ekran Uydu Crystal 4K Neo QLED Smart LED TV",
            "Toshiba 85 214 Ekran Uydu Crystal 8K QLED Smart LED TV",
            "Toshiba 43 106 Ekran Uydu 4K HD Smart LED TV",
            "Toshiba 70 179 Ekran Uydu Crystal 4K Neo QLED Smart LED TV"
    };

    private double[] modelPrices = {1899, 5699, 4599, 6499, 1649, 2599};

    public void listeleModeller() {
        System.out.println("-------Toshiba Televizyon Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Toshiba modelini satın almak istersiniz?\n");

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
