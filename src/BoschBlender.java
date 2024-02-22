import java.util.Scanner;

public class BoschBlender extends AnaMenu {

    private String[] modelNames = {
            "Bosch VitaPower 1200w Gümüş Blender Seti",
            "Bosch Inow Blender Seti 1000w Siyah",
            "Bosch Cam Hazneli Blender VitaPower Serie 4 1200w Blender Seti",
            "Bosch ErgoMix 12 Kademe 1250 ml 1000w",
            "Bosch MSM6170 ErgoMixx 750W Blender Seti",
            "Bosch MMB6177S Blender VitaPower Serie 4 Blender Seti 1200w"
    };

    private double[] modelPrices = {119, 129, 229, 185, 279, 359};

    public void listeleModeller() {
        System.out.println("-------Bosch Blender Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Bosch modelini satın almak istersiniz?\n");

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
