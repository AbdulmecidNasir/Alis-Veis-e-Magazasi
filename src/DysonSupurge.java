import java.util.Scanner;

public class DysonSupurge {
    private String name;
    private double price;

    private String[] modelNames = {
            "Dyson V12 Detected Slim Absolute Plus 3000w",
            "Dyson Gen5 Detected cyclone Kablosuz Supurge 2 yil Garantili",
            "Dyson V15 Detect Total Clean Hepa Filtreli Dyson Turkiye Garantili",
            "Dyson V12 Detected Slim Extra Absolute Kablosuz Supurge 2 yil Garantili 2000w",
            "Dyson Cinetic Big Ball Animal Pro 2 Elekrtikli Supurge Toz Torbasiz 5 yil Garantili 3000w",
            "Dyson Omni-Glide+ Kablosuz Supurge 2 yil garantili 2000w"
    };

    private double[] modelPrices = {599, 429, 349, 369, 389, 299};

    public void listeleModeller() {
        System.out.println("-------DYSON Supurge Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Dyson modelini satın almak istersiniz?\n");

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
