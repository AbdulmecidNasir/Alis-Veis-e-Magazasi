import java.util.Scanner;

public class DellModeli extends AnaMenu {

    private String name;
    private double price;

    private String[] modelNames = {
            "Dell Inspiron 512GB SSD 8GB Ram Intel Iris X",
            "Dell Gaming G15 1TB SSD 32GB RAM CORE I7 RTX",
            "Dell Vostro 256GB SSD 8GB RAM CORE I3",
            "Dell XPS 13 512GB SSD 32GB RAM AMD Ryzen 7",
            "Dell Gaming G16 512GB SSD 32GB RAM CORE I7",
            "Dell Latitude 512GB SSD 32GB RAM CORE I9"
    };

    private double[] modelPrices = {899, 999, 699, 1449, 1399, 1699};

    public void listeleModeller() {
        System.out.println("-------Dell Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Dell modelini satın almak istersiniz?\n");

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
