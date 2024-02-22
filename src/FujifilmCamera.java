import java.util.Scanner;

public class FujifilmCamera extends AnaMenu {

    private String[] modelNames = {
            "Fujifilm Finepix JV200 Dijital Fotograf Makinesi",
            "Fujifilm INstax Mini liplay Hybrid Dark Gray Dijital Fotograf Makinesi",
            "Fujifilm Instax Mini Evo Siyah Dijital Fotograf Makinesi",
            "Fujifilm Finepix SL260 14 MP LCD Ekran 26x Optik Zoom Dijital Fotograf Makinsei",
            "Fujifilm Finepix HS-20 16 MP LCD Ekran 30x Optik Zoom Dijital Fotograf Maknisei",
            "Fujifilm HS25 Exr Dijital Fotograf Makinsei"
    };

    private double[] modelPrices = {999, 1099, 899, 999, 1199, 799};

    public void listeleModeller() {
        System.out.println("-------Fujifilm Dijital Fotogaraf Makinesi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Fujifilm modelini satın almak istersiniz?\n");

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
