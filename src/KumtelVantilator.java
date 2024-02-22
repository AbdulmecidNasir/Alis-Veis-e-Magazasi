import java.util.Scanner;

public class KumtelVantilator extends AnaMenu {

    private String[] modelNames = {
            "Kumtel KTF-300 5 Pervaneli Ayakli Vantilator",
            "Kumtel KTF-280 5 Pervaneli Ayakli Vantilator",
            "Kumtel KTF-305 5 Pervaneli Ayakli Vantilator",
            "Kumtel KTF-285 5 Pervaneli Ayakli Vantilator",
            "Kumtel KTF-258W Kule Vantilator",
            "Kumtel KTF-295 5 Pervaneli Ayakli Vantilator"
    };

    private double[] modelPrices = {249, 159, 149, 215, 299, 259};

    public void listeleModeller() {
        System.out.println("-------Kumtel Vantilator Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Kumtel modelini satın almak istersiniz?\n");

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
