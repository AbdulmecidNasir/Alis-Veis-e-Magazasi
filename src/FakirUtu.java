import java.util.Scanner;

public class FakirUtu {
    private String name;
    private double price;

    private String[] modelNames = {
            "Fakir Elegance 2400w Lacevert Buharli Utu",
            "Fakir Sprint 2400w Buharli Utu",
            "Fakir Mercy 2400w Buharli Utu",
            "Fakir Galaxis Mor 2600w Buharli Utu",
            "Fakir Onyx 2800w Buharli Utu",
            "Fakir Vetecare Jenetorlu 2800w Buharli Utu"
    };

    private double[] modelPrices = {79, 69, 75, 45, 69, 99};

    public void listeleModeller() {
        System.out.println("-------Fakir Utu Modeller Kategorisine Hoş Geldiniz !--------\n");
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
