import java.util.Scanner;

public class EverestKlavye extends AnaMenu {

    private String[] modelNames = {
            "Everest Kb-871U Q Usb Siyah Standart Klavye",
            "Everest KB-120 Sleek Siyah Usb Gokkusagi Aydinlatmali Q Gaming Oyuncu Klavye",
            "Everest KB-88 Siyah/Gri Kablosuz 2.4g + Bluetooth Bt1 Bt2 Coklu Cihaz Baglantili Klavye",
            "Everest KB-G7 Armor Siyah USB Q Gaming Oyuncu Klavye",
            "Everest KB-89 Cytrus Daktilo Tusli Gri Wireless 2.4g + Bluetooth Coklu Cihaz",
            "Everest KB-MK7 USB Bilek Destekli Mekanik Klavye Q Blue Switch Gaming Klavye"
    };

    private double[] modelPrices = {39, 59, 79, 75, 99, 89};

    public void listModels() {
        System.out.println("-------Everest Klavye Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Everest modelini satın almak istersiniz?\n");

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
