import java.util.Scanner;

public class BaymakKlima extends AnaMenu {

    private String[] modelNames = {
            "Baymak Elegant Prime 12.000 Btu/h Inverter Klima A++",
            "Baymak Elegant Plus 16.000 Btu/h Inverter Klima A++",
            "Baymak Elegant Plus 09 9.000 Btu/h Inverter Duvar Tipi Klima A++",
            "Baymak Elegant Prime UV 18.000 Btu/h Inverter Klima A++",
            "Baymak Elegant Plus 24.000 Btu/h Inverter Klima A++",
            "Baymak Elegant Prime 12 12.000 Btu/h A++"
    };

    private double[] modelPrices = {949, 969, 889, 1135, 1049, 999};

    public void listeleModeller() {
        System.out.println("-------Baymak Klima Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Baymak modelini satın almak istersiniz?\n");

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
