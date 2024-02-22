import java.util.Scanner;

public class RazerKlavye extends AnaMenu {

    private String[] modelNames = {
            "Razer RZ03-02742100-R3L1 Cynosa Lite Usb Kablolu Aydinlatmali Turkce Klavye",
            "Razer Ornata V3 x Low Profile Membrane RGB Oyuncu Klavye",
            "Razer Hunstman V2 Tenkeyless - Clicky Siyah Oyuncu Klavye",
            "Razer Blackwidow V4 Pro RZ03-04680100-R3M1 Green Q Gaming Klavye",
            "Razer Deathstalker V2 Pro Kirmizi Switch Oyuncu Klavye",
            "Razer Blackwidow V3 Halo Infinite Edition Mekanik Kablolu Gaming Klavye"
    };

    private double[] modelPrices = {189, 159, 249, 975, 539, 489};

    public void listModels() {
        System.out.println("-------Razer Klavye Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Razer modelini satın almak istersiniz?\n");

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
