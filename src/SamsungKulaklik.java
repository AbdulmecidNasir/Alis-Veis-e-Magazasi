import java.util.Scanner;

public class SamsungKulaklik extends AnaMenu {

    private String[] modelNames = {
            "Samsung Galaxy Buds FE Bluetooth Beyaz Kulaklik",
            "Samsung Galaxy Buds 2 Siyah Bluetooth Kulaklik",
            "Samsung Orijinal Type-c Stereo Kablolu Kulak ici Kulaklik",
            "Samsung By Harman Y400 Kablosuz Bluetooth Mikrofonlu Kulak Ustu Kulakik",
            "Samsung AKG EO-IG955B Kulak ici Kulaklik",
            "Samsung By Harman Kardon AKG N200a Bluetooth Spor Kulak Ici Kulaklik"
    };

    private double[] modelPrices = {89, 99, 59, 155, 49, 229};

    public void listeleModeller() {
        System.out.println("-------Samsung Kulaklik Modeller Kategorisine Hoş Geldiniz !--------\n");
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
