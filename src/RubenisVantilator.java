import java.util.Scanner;

public class RubenisVantilator extends AnaMenu {

    private String[] modelNames = {
            "Rubenis Rbs-20 5 Pervaneli Ayakli Vantilator",
            "Rubenis J-283 Rbs35 4 Salinimli 5 Pervaneli Ayakli Vantilator",
            "Rubenis Simit Ayakli Rbs-20 90w Vantilator",
            "Rubenis Rba-sr31 Sarhos Ayakli Vantilator",
            "Rubenis Uzaktan Rbs 15 Kumandali Sanayi Tipi Vantilator",
            "Rubenis Rbs700 Sanayi Tipi Vantilator"
    };

    private double[] modelPrices = {149, 179, 149, 75, 99, 259};

    public void listeleModeller() {
        System.out.println("-------Rubenis Vantilator Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Rubenis modelini satın almak istersiniz?\n");

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
