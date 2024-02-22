import java.util.Scanner;

public class KorkmazTostMakina extends AnaMenu {

    private String[] modelNames = {
            "Korkmaz Inox Tostkolik Granit Tost Makinesi A328-05",
            "Korkmaz Tostella Siyah Tost Makinesi 2000w Aluminyum",
            "Korkmaz A310-03 Formula Siyah/Gri Tost Makinesi 2000w",
            "Korkmaz Tostema Maxi Tost Makinesi 2000w A811-07",
            "Korkmaz Castron Laciver Tost Makinesi 2000w",
            "Korkmaz Tostema Azura Maxi Tost Makinesi 2000w"
    };

    private double[] modelPrices = {169, 149, 229, 285, 279, 259};

    public void listeleModeller() {
        System.out.println("-------Korkmaz Tost Makinasi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Korkmaz modelini satın almak istersiniz?\n");

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
