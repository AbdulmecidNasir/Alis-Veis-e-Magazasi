import java.util.Scanner;

public class LexonHoparlor extends AnaMenu {

    private String[] modelNames = {
            "Lexon La115gp Oslo Bluetooth Tasinabilir Kablosuz Hoparlor",
            "Lexon Ld141x9 City Energy Bluetooth Hoparlor",
            "Lexon La120y9 Mino X Suaya Dayanikli Bluetooth Hoparlor",
            "Lexon La119r9 Tykho 3 Radyo ve Bluetooth Hoparlor",
            "Lexon La109n Cylindre Bluetooth Hoparlor",
            "Lexon Lh76mdb Mino L Led Lamba ve Bluetooth Hoparlor"
    };

    private double[] modelPrices = {279, 339, 299, 355, 265, 179};

    public void listeleModeller() {
        System.out.println("-------Lexon Hoparlor Modeller Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdaki hangi Lexon modelini satın almak istersiniz?\n");

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
