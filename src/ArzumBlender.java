import java.util.Scanner;

public class ArzumBlender extends AnaMenu {

    private String[] modelNames = {
            "Arzum Ar1137 Starchef Multi 1500w Blender Seti",
            "Arzum Ar1004 Soprano Max Multi Siyah Blender 1000w Siyah",
            "Arzum Ar1140 Bianco 1500w Blender Seti",
            "Arzum Ar1058 Hestia Multi Blender 1500w Siyah",
            "Arzum Ar1108 Smarty Neo Siyah 900w Blender Seti",
            "Arzum Ar1057 MaxiBlend Surahi Blender Seti 1000w"
    };

    private double[] modelPrices = {89, 99, 129, 185, 179, 159};

    public void listeleModeller() {
        System.out.println("-------Arzum Blender Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Arzum modelini satın almak istersiniz?\n");

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
