import java.util.Scanner;

public class NikonCamera extends AnaMenu {

    private String[] modelNames = {
            "Nikon D7500 18-140mm VR Kit",
            "Nikon D3400 AF-P 18-55mm VR Kit",
            "Nikon D5600 18-140mm DSLR Fotograf Makinesi",
            "Nikon D7100 18-55mm VR Kit 24.1 MP 3.2 LCD Ekran Dijital Fotograf Makinsei",
            "Nikon D3500 18-55 VR+ 55-200MM VR li Lens Set Dijital Fotograf Maknisei",
            "Nikon D3200 18-55 Kit Dijital Fotograf Makinsei"
    };

    private double[] modelPrices = {1899, 999, 1499, 1699, 1599, 899};

    public void listeleModeller() {
        System.out.println("-------Nikon Dijital Fotogaraf Makinesi Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Nikon modelini satın almak istersiniz?\n");

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
