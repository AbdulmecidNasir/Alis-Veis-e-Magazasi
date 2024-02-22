import java.util.Scanner;

public class OnePlusModel extends AnaMenu {

    private String[] modelNames = {
            "One Plus Ace 2 Pro 1TB",
            "One Plus Nord CE3 512GB",
            "One Plus 11R 256GB",
            "One Plus 10T 128GB",
            "One Plus Ace Ace Racing 1TB",
            "One Plus 10 Pro 512GB"
    };

    private double[] modelPrices = {1799, 1699, 1499, 1449, 1899, 999};

    public void listeleModeller() {
        System.out.println("-------One Plus Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi One Plus modelini satın almak istersiniz?\n");

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
            System.out.println("Seçilen model: " + modelNames[secim - 1]+ "\nModel Fiyati : " +modelPrices[secim - 1]+ "$");
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
