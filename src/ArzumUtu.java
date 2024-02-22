import java.util.Scanner;

public class ArzumUtu {
    private String name;
    private double price;

    private String[] modelNames = {
            "Arzum Steam Pro ar6030 2400w Buharli Utu",
            "Arzum Olivya Seramik 2000w Buharli Utu",
            "Arzum Steamline ar6025 2400w Buharli Utu",
            "Arzum Steamforce ar6001 2400w Buharli Kazanli Utu",
            "Arzum Steamart Lux 2400w Buharli Utu",
            "Arzum Health Tech ar6018 2400w Buharli Utu"
    };

    private double[] modelPrices = {99, 79, 89, 195, 149, 179};

    public void listeleModeller() {
        System.out.println("-------Arzum Utu Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Arzum modelini satın almak istersiniz?\n");

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
