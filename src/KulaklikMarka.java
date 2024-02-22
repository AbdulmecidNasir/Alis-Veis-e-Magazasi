import java.util.Scanner;

public class KulaklikMarka extends AnaMenu {

    private String[] kulaklikMarkalari = {"JBL", "Sony", "Xiaomi", "Sennheiser", "Rampage", "Samsung"};

    public void listeleMarkalar() {
        System.out.println("-------Kulaklık Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden hangi kulaklık markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getKulaklikMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getKulaklikMarkalari()[i]);
        }
    }

    public String[] kulaklikMarka() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Kulaklık Marka Seçimine Hoş Geldiniz !--------\n");

        listeleMarkalar();

        int secim = scanner.nextInt();

        if (secim >= 1 && secim <= getKulaklikMarkalari().length) {
            // Seçilen markayı döndür
            return new String[]{getKulaklikMarkalari()[secim - 1]};
        } else {
            System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getKulaklikMarkalari() {
        return kulaklikMarkalari;
    }

    public void setKulaklikMarkalari(String[] kulaklikMarkalari) {
        this.kulaklikMarkalari = kulaklikMarkalari;
    }
}
