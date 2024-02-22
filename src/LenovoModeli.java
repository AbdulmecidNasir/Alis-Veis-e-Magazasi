import java.util.Scanner;

public class LenovoModeli extends AnaMenu {

    private String name;
    private double price;

    private String[] modelNames = {
            "Lenovo Ideapad 512GB SSD Amd Ryzen 7 16GB Ram",
            "Lenovo Ideapad Gaming 1TB SSD 32GB RAM CORE I7",
            "Lenovo Thinkbook 512GB SSD 16GB RAM CORE I5",
            "Lenovo Thinkpad 1TB SSD 64GB AMD Ryzen 9",
            "Lenovo LOQ 256GB SSD 16GB RAM CORE I5",
            "Lenovo V15 ABA 512 SSD 32GB RAM CORE I8"
    };

    private double[] modelPrices = {1499, 2399, 1999, 1249, 1399, 1199};

    public void listeleModeller() {
        System.out.println("-------Lenovo Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Lenovo modelini satın almak istersiniz?\n");

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
