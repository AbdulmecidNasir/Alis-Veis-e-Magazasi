import java.util.Scanner;

public class SamsungKlima extends AnaMenu {

    private String[] modelNames = {
            "Samsung AR9500T 18.000 Btu/h Inverter Klima A++",
            "Samsung AR35 Silver AR12TX 12.000 Btu/h Inverter Klima A++",
            "Samsung AR18cxfabt/sk Windfree Premium Black 18.000 Btu/h Inverter Duvar Tipi Klima A++",
            "Samsung Premium Plus Ar09tsf/sk 9.000 Btu/h Inverter Klima A++",
            "Samsung AF50JS4 48.000 Btu/h Salon Tipi Inverter Klima A++",
            "Samsung Windfree Wifi ozellikli Split Klima 18.000 Btu/h A++"
    };

    private double[] modelPrices = {1349, 969, 1489, 1235, 5249, 1399};

    public void listeleModeller() {
        System.out.println("-------Samsung Klima Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Samsung modelini satın almak istersiniz?\n");

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
