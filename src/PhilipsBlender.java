import java.util.Scanner;

public class PhilipsBlender extends AnaMenu {

    private String[] modelNames = {
            "Philips HR2546/00 Daily collection ProMix El Blenderi 700w",
            "Philips HR2228/90 Problend 5000 Cam Smoothie 1200w",
            "Philips Viva Collection ProMix HR2653/90 800w Blender Seti",
            "Philips Flip&Juice Meyve Sikacagi Modullu Yuksek Hizli Blender",
            "Philips Dual Chef Meyve Sikacagi & Blender Siyah Metal 1500w 2 Litre",
            "Philips Evrekala Shop Blender Smoothie Makinesi Problend Crush Cam Buz Kirici"
    };

    private double[] modelPrices = {139, 169, 199, 285, 479, 279};

    public void listeleModeller() {
        System.out.println("-------Philips Blender Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Philips modelini satın almak istersiniz?\n");

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
