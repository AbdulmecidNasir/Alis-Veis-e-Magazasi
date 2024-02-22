import java.util.Scanner;

public class CanonCamera extends AnaMenu {

    private String[] modelNames = {
            "Canon EOS 700D 18-55 DC DSLR Dijital Fotograf Makinesi",
            "Canon EOS 1300D 18-55 DC Dijital Fotograf Makinesi",
            "Canon Fotograf EOS 1100D 18-55MM Sir Dijital Fotograf Makinesi",
            "Canon EOS 6D Mark 2 Body Dijital Fotograf Makinsei",
            "Canon Powershot SX70 HS Dijital Fotograf Maknisei",
            "Canon EOS 77D 18-135MM IS USM Nano Lens Kit + 16 GB Kart + Canta Dijital Fotograf Makinsei"
    };

    private double[] modelPrices = {799, 999, 1099, 2699, 1599, 2399};

    public void listeleModeller() {
        System.out.println("-------Canon Dijital Fotogaraf Makinesi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Canon modelini satın almak istersiniz?\n");

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
