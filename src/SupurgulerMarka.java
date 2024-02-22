import java.util.Scanner;

public class SupurgulerMarka extends AnaMenu {

    private String[] supurgeMarkalari = {"Philips", "Bosch", "Dyson", "Samsung", "Arcelik", "Fantom"};

    public void listeleMarkalar() {
        System.out.println("-------Süpürgüler Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden süpürgenin hangi markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getSupurgeMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getSupurgeMarkalari()[i]);
        }
    }

    public String[] supurgeMarka() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 2) {
            System.out.println("-------Süpürgü Marka Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki süpürge markalarından birini seçiniz:\n");

            listeleMarkalar();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getSupurgeMarkalari().length) {
                // Seçilen markayı döndür
                return new String[]{getSupurgeMarkalari()[secim - 1]};
            } else {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getSupurgeMarkalari() {
        return supurgeMarkalari;
    }

    public void setSupurgeMarkalari(String[] supurgeMarkalari) {
        this.supurgeMarkalari = supurgeMarkalari;
    }
}
