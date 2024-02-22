import java.util.Scanner;

public class LuxellVantilator extends AnaMenu {

    private String[] modelNames = {
            "Luxell Lxf-285 5 Pervaneli Ayakli Vantilator",
            "Luxell Lxf-518 5 Pervaneli Ayakli Vantilator",
            "Luxell Lxf-401 Push Button 55w 5 Pervaneli Ayakli Vantilator",
            "Luxell Lxf-410 Rotary Kontrol 5 Pervaneli Ayakli Vantilator",
            "Luxell Lxf-257w Kule Tipi Vantilator",
            "Luxell Lxf-718 Rose 75 Watt Ayakli Vantilator"
    };

    private double[] modelPrices = {49, 79, 99, 75, 99, 79};

    public void listeleModeller() {
        System.out.println("-------Luxell Vantilator Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Luxell modelini satın almak istersiniz?\n");

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
