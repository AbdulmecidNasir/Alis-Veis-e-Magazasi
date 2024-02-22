import java.util.Scanner;

public class XiaomiHoparlor extends AnaMenu {

    private String[] modelNames = {
            "Xiaomi MI Compact Mini Bluetooth Tasinabilir Kablosuz Hoparlor",
            "Xiaomi MI Portable MDZ-35db Mavi Bluetooth Hoparlor",
            "Xiaomi MI Outdoor Siyah Mini Bluetooth Hoparlor",
            "Xiaomi MI Smart Speaker lr Control LO5g Akilli Hoparlor",
            "Xiaomi Qualitell Bluetooth Hoparlor Uyku Yardimcisi",
            "Xiaomi Xmyx07ym Mini Bluetooth Hoparlor 2020 Yeni Versiyon"
    };

    private double[] modelPrices = {79, 339, 299, 255, 499, 39};

    public void listeleModeller() {
        System.out.println("-------Xiaomi Hoparlor Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Xiaomi modelini satın almak istersiniz?\n");

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
