import java.util.Scanner;

public class SonyKulaklik extends AnaMenu {

    private String[] modelNames = {
            "Sony Wh-ch510 Kulak Ustu Bluetooth Kulaklik",
            "Sony Wh-1000xm5 Tamamen Kablosuz Gurultu Engelleme Ozellikli Kulaklik",
            "Sony Wh-CH510 Kulak Ustu Bluetooth Kulaklik",
            "Sony Mdr-zx310ap Mikrofonlu Kulak Ustu Kulakik",
            "Sony Ps5 Pulse 3d Kulak Ustu Kulaklik",
            "Sony MDR7506 Professional Kulaklik"
    };

    private double[] modelPrices = {289, 479, 157, 155, 299, 329};

    public void listeleModeller() {
        System.out.println("-------SONY Kulaklik Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Sony modelini satın almak istersiniz?\n");

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
