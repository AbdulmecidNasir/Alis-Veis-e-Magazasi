import java.util.Scanner;

public class KeychronKlavye extends AnaMenu {

    private String[] modelNames = {
            "Keychron K3 Ultra-Slim Kablosuz Mekanik Klavye Bluetooth 5.1 RGB Turkce Klavye",
            "Keychron V1 Qmk Custom K Pro Red Switch Rgb Hot Swap Mekanik Oyuncu Klavye",
            "Keychron K2 V2 Brown Switch Mekanik Klavye",
            "Keychron V4 Qmk Custom K Pro Red Switch RGB Hot Swap Mekanik Klavye",
            "Keychron K8 TKL Kablosuz Mekanik Oyuncu Klavyesi Bluetooth 5.1 Multitasking-Gateron",
            "Keychron K6 Pro Qmk/via Custom Kablosuz Mekanik Gaming Klavye"
    };

    private double[] modelPrices = {489, 359, 549, 275, 539, 489};

    public void listModels() {
        System.out.println("-------Keychron Klavye Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Keychron modelini satın almak istersiniz?\n");

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
