import java.util.Scanner;

public class PlaystationKonsol extends AnaMenu {

    private String[] modelNames = {
            "Sony Playstation 5 + Dual Sense Kol + FC24",
            "Sony Playstation 4 + Dual Sense Kol + God of War",
            "Sony Playstation 4 Slim + Dual Sense Kol + FIFA23",
            "Sony Playstation 4 Pro + Dual Sense Kol + GTA V Premium Edition",
            "Sony Playstation 3"
    };

    private double[] modelPrices = {1199, 999, 899, 999, 499};

    public void listeleModeller() {
        System.out.println("-------Playstation Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Playstation modelini satın almak istersiniz?\n");

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
