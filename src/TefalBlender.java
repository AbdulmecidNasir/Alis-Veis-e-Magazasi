import java.util.Scanner;

public class TefalBlender extends AnaMenu {

    private String[] modelNames = {
            "Tefal HB1811 Easyblend Blender Seti 1000w",
            "Tefal HB 2358 Powelix Activflow Expert Blender 1500w Cam Hazneli Siyah",
            "Tefal BL811D Perfectt Mix Powelix Yüksek Hızlı Blender 1200w",
            "Tefal HB1748 Optiblend Blender Seti 1000w Siyah",
            "Tefal Blendeforce 2 in 1 Blend and Juice 800w",
            "Tefal HB204ntr Activflow Professional Cam Blender 1500w"
    };

    private double[] modelPrices = {139, 199, 299, 285, 179, 379};

    public void listeleModeller() {
        System.out.println("-------Tefal Blender Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Tefal modelini satın almak istersiniz?\n");

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
