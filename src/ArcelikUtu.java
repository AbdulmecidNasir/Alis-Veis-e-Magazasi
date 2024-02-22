import java.util.Scanner;

public class ArcelikUtu {
    private String name;
    private double price;

    private String[] modelNames = {
            "Arcelik Aria Expert Beu 9040D 2800w Buharli Utu",
            "Arcelik Aria Master Pro Bku 9130 3000w Buharli Kazanli Utu",
            "Arcelik Aria Expert 350ml 3000w Buharli Utu",
            "Arcelik Aria Beu 3926 2600w Buharli Utu",
            "Arcelik K 9040D 2800w Buharli Utu",
            "Arcelik K 4618 2400w Seramik Taban 150 gr. Buharli Utu"
    };

    private double[] modelPrices = {99, 179, 149, 155, 169, 199};

    public void listeleModeller() {
        System.out.println("-------Arcelik Utu Modeller Kategorisine Hoş Geldiniz !--------\n");
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
