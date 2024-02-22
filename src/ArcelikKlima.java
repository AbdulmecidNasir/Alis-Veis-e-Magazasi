import java.util.Scanner;

public class ArcelikKlima extends AnaMenu {

    private String[] modelNames = {
            "Arcelik 18325 Ekolojik Inverter 18.000 Btu/h Klima A++",
            "Arcelik 24325 Ekolojik Inverter 24.000 Btu/h Duvar Tipi Klima A++",
            "Arcelik 12505 Ekolojik Inverter 12.000 Btu/h Duvar Tipi Klima A++",
            "Arcelik 09465 Hp Ultra HiyjenPlus Silver Inverter Klima 9.000 Btu/h R32 Gazli A++",
            "Arcelik 12560 Hp Wifi Ultra Hiyjen Plus Prosmart Black Inverter Klima 12.000 Btu/h A++ R32",
            "Arcelik 15325 S Sadece Sogutma Ekolojik Inverter 15.000 Btu/h A Split A++"
    };

    private double[] modelPrices = {999, 1299, 899, 945, 1449, 1199};

    public void listeleModeller() {
        System.out.println("-------Arcelik Klima Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Arcelik modelini satın almak istersiniz?\n");

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
