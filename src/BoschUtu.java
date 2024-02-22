import java.util.Scanner;

public class BoschUtu {
    private String name;
    private double price;

    private String[] modelNames = {
            "Bosch TDI90 Entegre Buhar Jenetorlu 3200w Titanium Glissee Taban Utu",
            "Bosch TDA7030 3000w Titanium Glissee Taban Utu",
            "Bosch Buhar motorlu TDI95 2700w Buharli Utu",
            "Bosch TDA5028 2400w Buharli Kazanli Utu",
            "Bosch TDS2140 Buhar Istasyonlu Utu 2800w",
            "Bosch TDS6080tr 2400w Buhar Kazanli Utu"
    };

    private double[] modelPrices = {299, 179, 189, 195, 249, 329};

    public void listeleModeller() {
        System.out.println("-------Bosch Utu Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Bosch modelini satın almak istersiniz?\n");

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
