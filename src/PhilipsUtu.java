import java.util.Scanner;

public class PhilipsUtu {
    private String name;
    private double price;

    private String[] modelNames = {
            "Philips 5000 series Dst5030/80 2400w Buharli Utu",
            "Philips Azur 8000 series Dst8050/20 Optimal temp 3000w Buharli Utu",
            "Philips Perfectcare 8000 series Psg8130/80 2700w Buharli Kazanli Utu",
            "Philips Perfectcare Elite Plus Gc9682/80 2700w Buharli Kazanli Utu",
            "Philips Perfectcare Performer Gc8711 2400w Buharli Kazanli Utu",
            "Philips Divarese Gc8962/40 PerfecrCare Expert Plus Canta Hediyeli 4000w Buharli Kazanli Utu"
    };

    private double[] modelPrices = {299, 349, 399, 495, 289, 499};

    public String[] listeleModeller() {
        System.out.println("-------Philips Utu Modeller Kategorisine Hoş Geldiniz !--------\n");
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
        return new String[0];
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
