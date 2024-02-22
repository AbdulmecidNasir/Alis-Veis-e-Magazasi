import java.util.Scanner;

public class BoschKlima extends AnaMenu {

    private String[] modelNames = {
            "Bosch 500 Rac 18.000 Btu/h Inverter Klima A++",
            "Bosch Multi Split 18.000 Btu/h Inverter Klima A++",
            "Bosch Climate CL2000-35WE 12.000 Btu/h Inverter Klima A++",
            "Bosch Climate 3000i 9.000 Btu/h Inverter Klima A++",
            "Bosch ASX12XB30N 12.000 Btu/h Inverter Klima A++",
            "Bosch Climate Class 8000i-CL8001 9.000 Btu/h Split Klima Antrasit A++"
    };

    private double[] modelPrices = {1119, 1299, 999, 945, 1449, 1399};

    public void listeleModeller() {
        System.out.println("-------Bosch Klima Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Bosch modelini satın almak istersiniz?\n");

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
