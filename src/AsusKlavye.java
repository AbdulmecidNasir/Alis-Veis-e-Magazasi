import java.util.Scanner;

public class AsusKlavye extends AnaMenu {

    private String[] modelNames = {
            "Asus RA04 TUF Gaming K1 Mekanik Hisli TUrkce RGB Gaming Klavye",
            "Asus ROG Strix Scope RX Red Switch 1ms IP57 Su Gecirmez ve Toza Dayanikli RGB Klavye",
            "Asus ROG Strix Scope NX RED Wireless Deluxe Oyuncu Klavye",
            "Asus ROG Falchion NX Red Switch Turkce RGB Mekanik Kablosuz Mini Gaming Klavye",
            "Asus ROG Strix Flare Aura Sync RGB Mekanik Oyuncu Klavye Cherry MX Red",
            "Asus TUF Gaming K5 Mech-Brane RGB Oyuncu Inglizce Q Performans Klavye"
    };

    private double[] modelPrices = {89, 299, 499, 275, 839, 479};

    public void listModels() {
        System.out.println("-------Asus Klavye Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Asus modelini satın almak istersiniz?\n");

        // Model bilgilerini listeleyin
        for (int i = 0; i < modelNames.length; i++) {
            System.out.println((i + 1) + ". " + modelNames[i] + " - " + modelPrices[i] + "$");
        }

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice < 1 || choice > modelNames.length) {
            System.out.println("Yanlış bir numara girdiniz. Lütfen tekrar deneyin.");
        } else {
            // Seçimi bir dizi içinde döndür
            System.out.println("Seçilen model: " + modelNames[choice - 1] + "\nModel Fiyati : " + modelPrices[choice - 1] + "$");
        }
    }

    public String getModelInfo(int choice) {
        if (choice >= 1 && choice <= modelNames.length) {
            String name = modelNames[choice - 1];
            String price = String.valueOf(modelPrices[choice - 1]);
            return "Seçilen model: " + name + " - Fiyat: " + price + "$";
        } else {
            return "Geçersiz bir seçim yaptınız.";
        }
    }
}
