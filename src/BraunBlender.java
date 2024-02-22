import java.util.Scanner;

public class BraunBlender extends AnaMenu {

    private String[] modelNames = {
            "Braun Mq7025x Multiquick 7 EL Blender Seti",
            "Braun Mq5245wh Multiquick 5 Vario Blender Seti 1200w",
            "Braun Mq120 Pesto Multiquick 600ml 450w Blender Seti",
            "Braun Multiquick 5 Vario Daldirma Blender 21 Hiz 500ml 1000w",
            "Braun Multiquick easytwist Sistemli Daldirma Sistemli 1000w Blender Seti",
            "Braun JB3150WH Powerblend 3 Blender Seti 1200w"
    };

    private double[] modelPrices = {139, 129, 229, 285, 279, 359};

    public void listeleModeller() {
        System.out.println("-------Braun Blender Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Braun modelini satın almak istersiniz?\n");

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
