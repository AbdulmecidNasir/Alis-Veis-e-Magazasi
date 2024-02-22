import java.util.Scanner;

public class BoschSupurge {
    private String name;
    private double price;

    private String[] modelNames = {
            "Bosch Bgs41 Pro Hygienic Toz Torbasiz Supurge",
            "Bosch Bgs7 1000w 2 yil Garantili Toz Torbasiz Elektrik Supurge",
            "Bosch Adavancedvac 20 1200w Islak Kuru Elektrikli Supurge",
            "Bosch Bgl8 Zoo Pro animal Toz Torbali Elekrtik Supurge",
            "Bosch Serie 6 ProPower 1500w Toz Torbali Elektrik Supurge",
            "Bosch Series 8 Premium TurboSpin motor yuksek performans 10 yil garantli"
    };

    private double[] modelPrices = {199, 229, 249, 295, 289, 599};

    public void listeleModeller() {
        System.out.println("-------Bosch Supurge Modeller Kategorisine Hoş Geldiniz !--------\n");
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
