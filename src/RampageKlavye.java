import java.util.Scanner;

public class RampageKlavye extends AnaMenu {

    private String[] modelNames = {
            "Rampage Bygamex-K2 Rainbow Aydinlatmali Multimedi Turkce RGB Gaming Klavye",
            "Rampage KB-R66 USB Gokkusagi Aydinlatmali Q Multimedia RGB Oyuncu Klavye",
            "Rampage KB-RX77 Runner USB Aydinlatmali Q Bilek Destekli Oyuncu Klavye",
            "Rampage KB-RX7 Alpor Pro Sese Duyarli RGB Aydinlatmali Q Gaming Klavye",
            "Rampage Hydra R6 Full Color RGB LED Gaming Pro Red Switch Q Multimedia Oyuncu Klavye",
            "Rampage Snug K14 Beyaz/Gri Red Switch Rainbow TKL 97 Tuslu Suoer Kompakt RGB Oyuncu Q Klavye"
    };

    private double[] modelPrices = {189, 159, 229, 75, 239, 189};

    public void listModels() {
        System.out.println("-------Rampage Klavye Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Rampage modelini satın almak istersiniz?\n");

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
