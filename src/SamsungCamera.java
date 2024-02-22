import java.util.Scanner;

public class SamsungCamera extends AnaMenu {

    private String[] modelNames = {
            "Samsung WB100 16.2 MP 26x Optik Zoom 3.0 LCD Dijital Fotograf Makinesi",
            "Samsung ES91 14.2 MP 5x Optik Zoom 2.7 LCD Dijital Fotograf Makinesi",
            "Samsung PL20 14.2 MP 2.7 LCD Dijital Fotograf Makinesi",
            "Samsung DV150F 16 MP 5x Optik Zoom 2.7 LCD Ekran Dijital Fotograf Makinsei",
            "Samsung Galaxy Camera 2 GC200 16.3 MP 21x Optik Zoom Dijital Fotograf Maknisei",
            "Samsung NX1000 20-50mm Lens + Flash 20.3 MP 3.0 LCD Wifi Dijital Fotograf Makinsei"
    };

    private double[] modelPrices = {999, 995, 799, 1099, 1199, 1399};

    public void listeleModeller() {
        System.out.println("-------Samsung Dijital Fotogaraf Makinesi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Samsung modelini satın almak istersiniz?\n");

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
