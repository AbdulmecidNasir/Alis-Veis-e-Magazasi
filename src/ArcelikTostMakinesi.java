import java.util.Scanner;

public class ArcelikTostMakinesi extends AnaMenu {

    private String[] modelNames = {
            "Arcelik Tm6046 C Resital Tost Makinesi 1800w",
            "Arcelik K2375 TG Tost Makinesi 1800w Kirmizi",
            "Arcelik TM9046 S Gurme Tost Makinesi 1800w",
            "Arcelik K2396 TG lal Izgara ve Tost Makinesi 2000w",
            "Arcelik TM3946 Pastoral Pembe Tost Makinesi 2000w",
            "Arcelik TM6046 Resital Izgara ve Tost Makinsi 2000w"
    };

    private double[] modelPrices = {179, 149, 249, 285, 199, 359};

    public void listeleModeller() {
        System.out.println("-------Arcelik Tost Makinasi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Arcelik modelini satın almak istersiniz?\n");

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
