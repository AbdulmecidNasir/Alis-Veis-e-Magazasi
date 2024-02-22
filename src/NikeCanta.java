import java.util.Scanner;

public class NikeCanta extends AnaMenu {

    private String[] modelNames = {
            "Nike Ba-5876-082 Sirt ve Okul Cantasi",
            "Nike Dd0559-010 Nk Sirt ve Okul Cantasi",
            "Nike Ba-5773-010 Unisex Academy Team Sirt ve Okul Cantasi",
            "Nike BCk-5940-010 Elemantal Sirt ve Okul Cantasi",
            "Nike Ba-6032-010 Elemantal Backpack Sirt ve Okul Cantasi",
            "Nike Dj-9794-004 Sportswear Essentials Sirt ve Okul Cantasi"
    };

    private double[] modelPrices = {79, 69, 75, 85, 69, 99};

    public void listeleModeller() {
        System.out.println("-------Nike Canta Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Nike modelini satın almak istersiniz?\n");

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
