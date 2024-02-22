import java.util.Scanner;

public class RaksVantilator extends AnaMenu {

    private String[] modelNames = {
            "Raks Sf18 Max Pervaneli Ayakli Vantilator",
            "Raks Sf16 Max 5 Pervaneli Ayakli Vantilator",
            "Raks Wf20 Duvar Tipi Sanayi Vantilator 130w",
            "Raks Sf 30 250w 5 Pervaneli Ayakli Vantilator",
            "Raks SFR 20 SA Uzaktan Kumandali Sanayi Tipi Vantilator",
            "Raks WFR 30 SA UZaktan Kumandali Duvar Tipi Vantilator"
    };

    private double[] modelPrices = {249, 159, 149, 215, 299, 259};

    public void listeleModeller() {
        System.out.println("-------Raks Vantilator Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Raks modelini satın almak istersiniz?\n");

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
