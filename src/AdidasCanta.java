import java.util.Scanner;

public class AdidasCanta extends AnaMenu {

    private String[] modelNames = {
            "Adidas Hm5027 LK Bp New Siyah Sirt ve Okul Cantasi",
            "Adidas Hg0348 Polyester Unisex Sirt ve Okul Cantasi",
            "Adidas Power V1 Sirt ve Okul Cantasi",
            "Adidas Backpack Gunlik Kullanima Uygun Sirt ve Okul Cantasi",
            "Adidas Sirt ve Okul Cantasi",
            "Adidas Gri Laptop Bolmeli 48 cm Sirt ve Okul Cantasi"
    };

    private double[] modelPrices = {69, 75, 95, 55, 69, 99};

    public void listeleModeller() {
        System.out.println("-------Adidas Canta Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Adidas modelini satın almak istersiniz?\n");

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
