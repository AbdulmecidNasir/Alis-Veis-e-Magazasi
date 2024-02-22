import java.util.Scanner;

public class PanasonicCamera extends AnaMenu {

    private String[] modelNames = {
            "Panasonic Lumix DMC-FZ82 4K Dijital Fotograf Makinesi",
            "Panasonic Lumix DMC-TZ18 14.1 MP 3 LCD Dijital Fotograf Makinesi",
            "Panasonic Limix DMC-LX15 Dijital Fotograf Makinesi",
            "Panasonic Lumox DC-LX100M2 Dijital Fotograf Makinsei",
            "Panasonic Lumix DC-FZ300 Dijital Fotograf Maknisei",
            "Panasonic Lumix DMC-FZ1000  16x Optik Zoom 20.1 MP LCD Ekran Dijital Fotograf Makinsei"
    };

    private double[] modelPrices = {990, 695, 899, 2099, 1199, 1399};

    public void listModels() {
        System.out.println("-------Panasonic Dijital Fotogaraf Makinesi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Panasonic modelini satın almak istersiniz?\n");

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
