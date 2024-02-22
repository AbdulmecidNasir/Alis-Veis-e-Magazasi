import java.util.Scanner;

public class TefalUtu {
    private String name;
    private double price;

    private String[] modelNames = {
            "Tefal Express Steam Max fv2868 2400w Buharli Utu",
            "Tefal Turbo Pro fv5696 3000w Buharli Utu",
            "Tefal Pureglis fv8064 2700w Buharli Utu",
            "Tefal Express Protect Pro GV9230 2700w Buharli Kazanli Utu",
            "Tefal Ultimate Pure fv9845 2400w Buharli Utu",
            "Tefal Easygliss Plus fv5770 2000w Buharli Utu"
    };

    private double[] modelPrices = {199, 239, 189, 295, 289, 79};

    public void listeleModeller() {
        System.out.println("-------Tefal Utu Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Tefal modelini satın almak istersiniz?\n");

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
