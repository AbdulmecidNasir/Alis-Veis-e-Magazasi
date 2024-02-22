import java.util.Scanner;

public class JblKulaklik extends AnaMenu {

    private String[] modelNames = {
            "JBL T560bt Kulak Ustu Bluetooth Kulaklik",
            "JBL Tune 570BT Wireless Kulaklik CT Siyah",
            "JBL Tune 520bt Connect Wireless Kulaklik",
            "JBL T500 Siyah Kablolu Kulak Ustu Kulakik",
            "JBL Wave Beam Kulak ici Kulaklik",
            "JBL Tune 720BT Kulaklik CT Siyah"
    };

    private double[] modelPrices = {89, 79, 87, 55, 99, 129};

    public void listeleModeller() {
        System.out.println("-------JBL Kulaklik Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi JBL modelini satın almak istersiniz?\n");

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
