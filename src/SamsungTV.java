import java.util.Scanner;

public class SamsungTV {
    private String name;
    private double price;

    private String[] modelNames = {
            "Samsung 65 163 Ekran Uydu Crystal 4K HD Smart LED TV",
            "Samsung 75 Crystal 8K QLED Smart LED TV",
            "Samsung 55 138 Ekran Uydu Crystal 4K Neo QLED Smart LED TV",
            "Samsung 85 214 Ekran Uydu Crystal 8K QLED Smart LED TV",
            "Samsung 43 106 Ekran Uydu 4K HD Smart LED TV",
            "Samsung 70 179 Ekran Uydu Crystal 4K Neo QLED Smart LED TV"
    };

    private double[] modelPrices = {1899, 5699, 4599, 6499, 1649, 2599};

    public void listeleModeller() {
        System.out.println("-------Samsung Televizyon Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Samsung modelini satın almak istersiniz?\n");

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
