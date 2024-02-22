import java.util.Scanner;

public class FakirTostMakinesi extends AnaMenu {

    private String[] modelNames = {
            "Fakir Gravis Tost Makinesi 2000w",
            "Fakir Silver Stone Taste N Joy Tost Makinesi 1800w",
            "Fakir Pania Tost Makinesi 1800w",
            "Fakir Grill Expert Elite Izgara ve Tost Makinesi 2000w",
            "Fakir N Joy Granit Kaplama Tost Makinesi 2000w",
            "Fakir Torreo Termostatli Izgara ve Tost Makinsi 2000w"
    };

    private double[] modelPrices = {179, 189, 149, 285, 199, 259};

    public void listeleModeller() {
        System.out.println("-------Fakir Tost Makinasi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Fakir modelini satın almak istersiniz?\n");

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
