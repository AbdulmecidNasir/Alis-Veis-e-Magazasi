import java.util.Scanner;

public class XiaomiKulaklik extends AnaMenu {

    private String[] modelNames = {
            "Xiaomi Redmi Buds 4 Active Bluetooth Kulaklik",
            "Xiaomi Redmi Buds 3 Lite Siyah Bluetooth Kulaklik",
            "Xiaomi Earbuds 2 Enc Gurultu engellemeli V5.3 Suaya toza Dayaniklik Bluetooth Kulaklik",
            "Xiaomi Flipbuds Pro Bluetooth Kulakik",
            "Xiaomi Redmi Buds 3t Pro Yesil Bluetooth Kulaklik",
            "Xiaomi Haylou Gt1 Kablosuz Bluetooth Kulaklik"
    };

    private double[] modelPrices = {49, 59, 57, 155, 99, 119};

    public void listeleModeller() {
        System.out.println("-------Xiaomi Kulaklik Modeller Kategorisine Hoş Geldiniz !--------\n");
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
