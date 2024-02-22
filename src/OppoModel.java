import java.util.Scanner;

public class OppoModel extends AnaMenu {

    private String[] modelNames = {
            "Oppo A79 1TB",
            "Oppo A18 128GB",
            "Oppo Find N3 Flip 256GB",
            "Oppo A58 4G 128GB",
            "Oppo Reno 10 256GB",
            "Oppo K11x 64GB"
    };

    private double[] modelPrices = {1599, 1299, 1499, 1149, 929, 559};

    public void listeleModeller() {
        System.out.println("-------Oppo Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi OPPO modelini satın almak istersiniz?\n");

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
            System.out.println("Seçilen model: " + modelNames[secim - 1]+ "\nModel Fiyati : " +modelPrices[secim - 1]+ "$");
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
