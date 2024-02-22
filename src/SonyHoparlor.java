import java.util.Scanner;

public class SonyHoparlor extends AnaMenu {

    private String[] modelNames = {
            "Sony Srs-xp500 X Serisi Tasinabilir Kablosuz Hoparlor",
            "Sony SRS-LSR200 Hoparloru TV Guclendirilmis Kablosuz 3 Modlu Hoparlor",
            "Sony SRS-xe300 Tasinabilir Bluetooth Hoparlor Siyah",
            "Sony SRS-xb23 Extra Bass Tasinabilir Bluetooth Hoparlor Siyah",
            "Sony SRS-xg500 X Serisi Tasinabilir Bluetooth Hoparlor Siyah",
            "Sony SRS-RA3000 Birinci Kablosuz Bluetooth Hoparlor Siyah"
    };

    private double[] modelPrices = {629, 739, 299, 155, 799, 1029};

    public void listeleModeller() {
        System.out.println("-------Sony Hoparlor Modeller Kategorisine Hoş Geldiniz !--------\n");
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
