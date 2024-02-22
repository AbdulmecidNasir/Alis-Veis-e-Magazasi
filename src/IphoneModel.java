import java.util.Scanner;

public class IphoneModel extends AnaMenu{
    Telefonlar telefonlar = new Telefonlar();

    // Liste içinde model bilgileri

    // ...

    public double getModelPrice(int secim) {
        if (secim >= 1 && secim <= modelNames.length) {
            return modelPrices[secim - 1];
        } else {
            return -1;
        }
    }

    private String[] modelNames = {
            "Iphone 15 pro max 1TB",
            "Iphone 14 pro 512GB",
            "Iphone 13 mini 64GB",
            "Iphone 12 pro max 256GB",
            "Iphone XR 64GB",
            "Iphone 15 Plus 512GB"
    };

    private double[] modelPrices = {1999, 1499, 899, 999, 699, 1299};

    public void listeleModeller() {
        System.out.println("-------Iphone Modeller Kategorisine Hos Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi iPhone modelini satın almak istersiniz?\n");

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

    public String getModelInfo(int secim, String[] modelPrices) {
        if (secim >= 1 && secim <= modelNames.length) {
            String name = modelNames[secim - 1];
            String price = String.valueOf(modelPrices[secim - 1]);
            return "Seçilen model: " + name + " - Fiyat: " + price + "$";
        } else {
            return "Geçersiz bir seçim yaptınız.";
        }
    }
}