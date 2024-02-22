import java.util.Scanner;

public class PhilipsSupurge {
    private String name;
    private double price;

    private String[] modelNames = {
            "Philips PowerPro City FC9331/07 Toz Torbasiz Supurge",
            "Philips Marathon Ultimate Xb9145/97 Toz Torbasiz Elektrik Supurge",
            "Philips SpeedPro Max Xc7043 Elektrikli Supurge",
            "Philips Marathin Daily XB7151/07 Toz Torbasiz Elekrtik Supurge",
            "Philips PowerPro PowerPro Compact Fc9323/07 Toz Torbasiz Elektrik Supurge",
            "Philips 8000 Aqua Plus Kablosuz Sarzli Dik Supurge 7.51 kg, 25V 80db"
    };

    private double[] modelPrices = {299, 329, 349, 295, 289, 399};

    public void listeleModeller() {
        System.out.println("-------Philips Supurge Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Philips modelini satın almak istersiniz?\n");

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
