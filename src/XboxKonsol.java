import java.util.Scanner;

public class XboxKonsol extends AnaMenu {

    private String[] modelNames = {
            "Microsoft Xbox Series X 1TB Oyun Konsolu Siyah",
            "Microsoft Xbox Series S 512 GB Oyun Konsolu Beyaz",
            "Microsoft Xbox 360 500 GB Oyun Konsolu",
            "Microsoft Xbox One 1TB Oyun Konsolu Siyah"
    };

    private double[] modelPrices = {1099, 899, 399, 699};

    public void listeleModeller() {
        System.out.println("-------Xbox Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Xbox modelini satın almak istersiniz?\n");

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
