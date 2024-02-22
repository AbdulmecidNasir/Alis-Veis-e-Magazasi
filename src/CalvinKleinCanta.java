import java.util.Scanner;

public class CalvinKleinCanta extends AnaMenu {

    private String[] modelNames = {
            "Calvin Klein Elevated Flatpack Siyah Erkek Postaci Cantasi",
            "Calvin Klein K50K509394-BDS Erkek Marka Logolu Desenli Fermuarli Sirt Cantasi",
            "Calvin Klein K50K509595-01K Erkek, Logolu Fermuarli Deri Gunluk Omuz Cantasi",
            "Calvin Klein Must Mono Waistbag Polyester Erkek Bel Cantasi",
            "Calvin Klein K50K509810 BDS Fermuaurli Ayarlanabilir Omuz Askili Erkek Cantasi",
            "Calvin Klein Monogram Soft Cmpus Bp 40 Sirt Cantasi"
    };

    private double[] modelPrices = {89, 220, 300, 125, 209, 299};

    public void listeleModeller() {
        System.out.println("-------Calvin Klein Canta Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Calvin Klein modelini satın almak istersiniz?\n");

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
