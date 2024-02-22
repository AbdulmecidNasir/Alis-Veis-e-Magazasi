import java.util.Scanner;

public class LogitechKlavye extends AnaMenu {

    private String[] modelNames = {
            "Logitech 920-007586 K380 Bluetooth Siyah Klavye",
            "Logitech 920-008094 G213 Prodigy RGB Oyuncu Klavye",
            "Logitech MX Keys Aydinlatmali Tam Boyutlu Kablosuz Turkce Q Klavye Siyah",
            "Logitech K380s Pebble Keys 2 Coklu Cihaz Ozellikli Bluetooth Turkce Q Klavye Siyah",
            "Logitech K400 Plus Dokunmatik Yuzeyli USB Baglantili TUrkce Q Klavye Siyah",
            "Logitech MX Mechanical Kablosuz Aydinlatmali Inglizce Q Performans Klavye"
    };

    private double[] modelPrices = {69, 99, 299, 175, 139, 479};

    public void listModels() {
        System.out.println("-------Logitech Klavye Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Logitech modelini satın almak istersiniz?\n");

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
