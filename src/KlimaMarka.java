import java.util.Scanner;

public class KlimaMarka extends AnaMenu {

    private String[] klimaMarkalari = {"Arcelik", "Bosch", "Beko", "Samsung", "Baymak", "Vestel"};

    public void listeleMarkalar() {
        System.out.println("-------Klima Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden klimayı hangi markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getKlimaMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getKlimaMarkalari()[i]);
        }
    }

    public String[] klimaMarka() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 3) {
            System.out.println("-------Klima Marka Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki klima markalarından birini seçiniz:\n");

            listeleMarkalar();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getKlimaMarkalari().length) {
                // Seçilen markayı döndür
                return new String[]{getKlimaMarkalari()[secim - 1]};
            } else {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getKlimaMarkalari() {
        return klimaMarkalari;
    }

    public void setKlimaMarkalari(String[] klimaMarkalari) {
        this.klimaMarkalari = klimaMarkalari;
    }
}
