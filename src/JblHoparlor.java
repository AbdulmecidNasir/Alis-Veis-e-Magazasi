import java.util.Scanner;

public class JblHoparlor extends AnaMenu {

    private String[] modelNames = {
            "JBL Go Essnetial Bluetooth Hoparlor lpx7 Siyah",
            "JBL Go 3 Tasinabilir Su Gecirmez Bluetooth Hoparlor Siyah",
            "JBL Patybox 310 Tasinabilir Bluetooth Hoparlor Siyah",
            "JBL Flip 5 IPX7 Su Gecirmez Bluetooth Hoparlor Siyah",
            "JBL Charge 5 IPX7 Su Gecirmez Bluetooth Hoparlor Siyah",
            "JBL Xtreme 3 Tasinabilir Su Gecirmez Bluetooth Hoparlor Siyah"
    };

    private double[] modelPrices = {129, 139, 899, 655, 499, 529};

    public void listeleModeller() {
        System.out.println("-------JBL Hoparlor Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi JBL modelini satın almak istersiniz?\n");

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
