import java.util.Scanner;

public class HuaweiModeli extends AnaMenu {

    private String name;
    private double price;

    private String[] modelNames = {
            "Huawei Matebook X Pro 512GB SSD 16GB Ram Intel Iris X",
            "Huawei Matebook 16s Windows 11 1TB SSD 32GB RAM CORE I9",
            "Huawei D 16 256GB SSD 16GB RAM CORE I5",
            "Huawei D 15 512GB SSD 8GB RAM AMD Ryzen 7",
            "Huawei D 14 512GB SSD 16GB RAM CORE I7",
            "Huawei Matebook 14 512 SSD 32GB RAM CORE I9"
    };

    private double[] modelPrices = {1999, 1899, 1699, 1449, 1399, 1699};

    public void listeleModeller() {
        System.out.println("-------Huawei Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Huawei modelini satın almak istersiniz?\n");

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
