import java.util.Scanner;

public class HytechHoparlor extends AnaMenu {

    private String[] modelNames = {
            "Hytech Hy-s40 Dc 5v Bluetooth Tasinabilir Kablosuz Hoparlor",
            "Hytech Hy-s21 12w 1200mah Karisik usb+tf Kart+fm Destekli Bluetooth Hoparlor",
            "Hytech Hy-s10 Dc 5v Mavi usb+tf Kart+ Bluetooth Hoparlor",
            "Hytech Hy-s22 Dc 3v Kirmizi usb+tf Kart+ Bluetooth Hoparlor",
            "Hytech Scatty Portable Bluetooth Hoparlor",
            "Hytech Hy-s16 Strain Kamuflaf Aux+usb+tf kart destekli 3.7v-5v/500ma Bluetooth Hoparlor"
    };

    private double[] modelPrices = {79, 339, 99, 55, 65, 79};

    public void listeleModeller() {
        System.out.println("-------Hytech Hoparlor Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Hytech modelini satın almak istersiniz?\n");

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
