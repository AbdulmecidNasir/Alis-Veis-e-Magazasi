import java.util.Scanner;

public class ArcelikSupurge {
    private String name;
    private double price;

    private String[] modelNames = {
            "Arcelik Trb3174 Toz Torbasiz Elektrik Supurge 2 yil garantili",
            "Arcelik Comfort-x 3.0 Tsz6282 Toz Torbasiz Elektrik Supurge",
            "Arcelik Imperium Go Sd 9041k Toz Torbasiz Elektrik Supurge",
            "Arcelik S7564 Toz Torbasiz Elektrik Supurge",
            "Arcelik Tornado S4910 Toz Torbasiz Elektrik Supurge",
            "Arcelik S4964 Toz Torbasiz Elektrik Supurge"
    };

    private double[] modelPrices = {99, 129, 149, 119, 139, 199};

    public void listeleModeller() {
        System.out.println("-------Arcelik Supurge Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Arcelik modelini satın almak istersiniz?\n");

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
