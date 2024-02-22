import java.util.Scanner;

public class BekoKlima extends AnaMenu {

    private String[] modelNames = {
            "Beko Ekolojik 31825 18.000 Btu/h Inverter Klima A++",
            "Beko 31125 12.000 Btu/h Inverter Klima A++",
            "Beko Aktif Hiyjen Smart 51860 Hp 18.000 Btu/h Inverter Duvar Tipi Klima A++",
            "Beko 71260 Al Alerjensmart 12.000 Btu/h Inverter Klima A++",
            "Beko 50960 Mirror ProSmart 14.000 Btu/h Inverter Klima A++",
            "Beko Mobil Klima 21215 12.000 Btu/h A++"
    };

    private double[] modelPrices = {949, 969, 1489, 1335, 1249, 1399};

    public void listeleModeller() {
        System.out.println("-------Beko Klima Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Beko modelini satın almak istersiniz?\n");

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
