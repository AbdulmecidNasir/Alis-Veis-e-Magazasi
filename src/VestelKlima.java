import java.util.Scanner;

public class VestelKlima extends AnaMenu {

    private String[] modelNames = {
            "Vestel Flora Doga 122 Wifi 12.000 Btu/h Inverter Klima A++",
            "Vestel Flora Doga 092 Wifi 9.000 Btu/h Inverter Klima A++",
            "Vestel Multi Inverter Plus 12.000 and 18.000 Btu/h Inverter Duvar Tipi Klima A++",
            "Vestel Nova 122 GI Pro 12.000 Btu/h Wifi Inverter Klima A++",
            "Vestel Vega Plus Inverter G 122 12.000 Btu/h Klima A++",
            "Vestel Buzz Inverter 242 24.000 Btu/h Wifi A++"
    };

    private double[] modelPrices = {989, 969, 1489, 1135, 1049, 1599};

    public void listeleModeller() {
        System.out.println("-------Vestel Klima Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Vestel modelini satın almak istersiniz?\n");

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
