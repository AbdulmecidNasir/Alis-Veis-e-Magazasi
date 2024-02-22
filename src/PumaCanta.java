import java.util.Scanner;

public class PumaCanta extends AnaMenu {

    private String[] modelNames = {
            "Puma 07548701 Phase Sirt ve Okul Cantasi",
            "Puma 07685403 Siyah Teamgoal Sirt ve Okul Cantasi",
            "Puma City Backpack Gri Erkek Sirt Cantasi",
            "Puma BMW MMS Small Portable Siyah Omuz Cantasi",
            "Puma 079615 Lacivert Sirt Cantasi",
            "Puma Individualrise Backpack 079322-01 Sirt Cantasi"
    };

    private double[] modelPrices = {59, 55, 75, 85, 69, 80};

    public void listeleModeller() {
        System.out.println("-------Puma Canta Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Puma modelini satın almak istersiniz?\n");

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
