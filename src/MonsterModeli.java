import java.util.Scanner;

public class MonsterModeli extends AnaMenu {

    private String name;
    private double price;

    private String[] modelNames = {
            "Monster Tulpar T7 512GB SSD 16GB Ram Intel Core I7",
            "Monster Abra A5 1TB SSD 32GB RAM Intel CORE I7 RTX",
            "Monster Huma H5 256GB SSD 16GB RAM CORE I7",
            "Monster Tulpar T6 1TB SSD 32GB RAM AMD Ryzen 7 RTX",
            "Monster Semruk S7 4TB SSD 64GB RAM CORE I9 13H RTX",
            "Monster Abra A7 2TB SSD 32GB RAM CORE I9"
    };

    private double[] modelPrices = {1299, 999, 799, 1249, 3299, 1699};

    public void listeleModeller() {
        System.out.println("-------Monster Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Monster modelini satın almak istersiniz?\n");

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
