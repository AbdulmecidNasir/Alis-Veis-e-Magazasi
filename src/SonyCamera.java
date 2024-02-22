import java.util.Scanner;

public class SonyCamera extends AnaMenu {

    private String[] modelNames = {
            "Sony RX10 Mark IV Dijital Fotograf Makinesi",
            "Sony HX300 20.4 MP 50x Optik Zoom 3 LCD Ekran Dijital Fotograf Makinesi",
            "Sony DSC-S3000B 10MP 2.7 LCD Ekran Dijital Fotograf Makinesi",
            "Sony DSC-W810 Cyber-Shot Compact W810 Dijital Fotograf Makinesi",
            "Sony DSC-S5000 14 MP 2.7 LCD Dijital Fotograf Maknisei",
            "Sony ZV-1 Vlog Dijital Fotograf Makinsei"
    };

    private double[] modelPrices = {3999, 1299, 1099, 1699, 1199, 1399};

    public void listeleModeller() {
        System.out.println("-------Sony Dijital Fotogaraf Makinesi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Sony modelini satın almak istersiniz?\n");

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
            System.out.println("Seçilen model: " + modelNames[secim - 1] + "\nModel Fiyati : " + modelPrices[secim - 1] + "$");
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
