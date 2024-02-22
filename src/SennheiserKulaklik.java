import java.util.Scanner;

public class SennheiserKulaklik extends AnaMenu {

    private String[] modelNames = {
            "Sennheiser HD 350BT Beyaz Bluetooth Kulaklik",
            "Sennheiser HD 450BT Siyah Bluetooth Kulaklik",
            "Sennheiser Cx True Wireless Siyah Kulak ici Bluetooth Kulaklik",
            "Sennheiser Momentum True Wireless 2 Kulak Ici Kulakik",
            "Sennheiser Momentum 4 Wireless Kulak Ustu Kulaklik",
            "Sennheiser Cx400BT True Wireless Kulak Ici Kulaklik"
    };

    private double[] modelPrices = {589, 679, 257, 955, 899, 329};

    public void listeleModeller() {
        System.out.println("-------Sennheiser Kulaklik Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Sennheiser modelini satın almak istersiniz?\n");

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
