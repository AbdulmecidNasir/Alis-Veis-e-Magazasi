import java.util.Scanner;

public class SamsungSupurge {
    private String name;
    private double price;

    private String[] modelNames = {
            "Samsung VCO7R3 Toz Torbasiz Elektrik Supurge 2 yil garantili",
            "Samsung Vc3500tm Cycloneforce Teknolojili Toz Torbasiz Elektrik Supurge",
            "Samsung 750w Turbo Baslikli Toz Torbasiz Elektrik Supurge",
            "Samsung VCC45WOS3K/XTR Toz Torbasiz Elektrik Supurge",
            "Samsung VCO7R302MVP/TR  Toz Torbasiz Elektrik Supurge",
            "Samsung 3A Cycloneforce Teknolojili Toz Torbasiz Elektrik Supurge"
    };

    private double[] modelPrices = {99, 129, 149, 119, 139, 199};

    public void listeleModeller() {
        System.out.println("-------Samsung Supurge Modeller Kategorisine Hoş Geldiniz !--------\n");
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
