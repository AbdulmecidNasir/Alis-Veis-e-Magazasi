import java.util.Scanner;

public class FantomSupurge {
    private String name;
    private double price;

    private String[] modelNames = {
            "Fantom Provac p 5000 Cyclone Dikey Elektrik Supurge 2 yil garantili",
            "Fantom Speedy Pro Dikey Toz Torbasiz Elektrik Supurge",
            "Fantom Ecologic Wf 4700 Su Filtreli Elektrik Supurge",
            "Fantom Turbo Tr 8650 Toz Torbasiz Elektrik Supurge",
            "Fantom MultiCyclone 850w Toz Torbasiz Elektrik Supurge",
            "Fantom Quantum p 2049 Sarzli Elektrik Supurge"
    };

    private double[] modelPrices = {99, 139, 169, 179, 149, 199};

    public void listeleModeller() {
        System.out.println("-------Fantom Supurge Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Fantom modelini satın almak istersiniz?\n");

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
