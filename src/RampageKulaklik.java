import java.util.Scanner;

public class RampageKulaklik extends AnaMenu {

    private String[] modelNames = {
            "Rampage Sn-r10 ALquist Siyah 3.5mm RGB Gaming Oyuncu Mikrofonlu Kulaklik",
            "Rampage Rm-k27 X-jammer 3.5mm 7 Renk Ledli Gaming Oyuncu Mikrofonlu Kulaklik",
            "Rampage M7 Moncher RGB usb 7.1 Gaming Kulaklik Kulak Ustu Kulaklik",
            "Rampage Rh 1 Hectora Oyuncu Mikrofonlu kulaklik",
            "Rampage Rm-2019g X-Titan RGB 7.1 Gaming Kulaklik",
            "Rampage Rm-k23 Mission Yesil Gaming Kulaklk"
    };

    private double[] modelPrices = {89, 99, 79, 85, 99, 129};

    public void listeleModeller() {
        System.out.println("-------Rampage Kulaklik Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Rampage modelini satın almak istersiniz?\n");

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
