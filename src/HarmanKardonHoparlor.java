import java.util.Scanner;

public class HarmanKardonHoparlor extends AnaMenu {

    private String[] modelNames = {
            "Harman Kardon Go+play Mini Bluetooth Tasinabilir Kablosuz Hoparlor",
            "Harman Kardon Onyx Studio 7 Bluetooth Hoparlor",
            "Harman Kardon Soundstick lv Bluetooth Hoparlor",
            "Harman Kardon Aura Studio 4 Bluetooth Hoparlor",
            "Harman Kardon Citation Surround Bluetooth Hoparlor Gri",
            "Harman Kardon LUNA Outdoor Mini Bluetooth Hoparlor"
    };

    private double[] modelPrices = {679, 739, 999, 855, 995, 439};

    public void listeleModeller() {
        System.out.println("-------Harman Kardon Hoparlor Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Harman Kardon modelini satın almak istersiniz?\n");

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
