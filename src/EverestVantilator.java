import java.util.Scanner;

public class EverestVantilator extends AnaMenu {

    private String[] modelNames = {
            "Everest Efn-482 Metal Usb Vantilator",
            "Everest Efn-505 360 Derece Donus Tasinabilir Mini Vantilator",
            "Everest Efn-482 Masa Ustu Metal Usb Vantilator",
            "Everest Dexter EFN-503 Usb Vantilator",
            "Everest Efn-521 Masa Ustu sarz edelebilir Usb Vantilator",
            "Everest Efn-503 Masa Ustu Usb Vantilator"
    };

    private double[] modelPrices = {39, 49, 29, 45, 59, 79};

    public void listeleModeller() {
        System.out.println("-------Everest Vantilator Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Everest modelini satın almak istersiniz?\n");

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
