import java.util.Scanner;

public class KameraMarka extends AnaMenu {

    private String[] kameraMarkalari = {"Nikon", "Canon", "Sony", "Fujifilm", "Samsung", "Panasonic"};

    public void listeleMarkalar() {
        System.out.println("-------Dijital Fotoğraf Makinesi Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden hangi fotoğraf makinesi markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getKameraMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getKameraMarkalari()[i]);
        }
    }

    public String[] kameraMarka() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Fotoğraf Makinesi Marka Seçimine Hoş Geldiniz !--------\n");

        listeleMarkalar();

        int secim = scanner.nextInt();

        if (secim >= 1 && secim <= getKameraMarkalari().length) {
            // Seçilen markayı döndür
            return new String[]{getKameraMarkalari()[secim - 1]};
        } else {
            System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getKameraMarkalari() {
        return kameraMarkalari;
    }

    public void setKameraMarkalari(String[] kameraMarkalari) {
        this.kameraMarkalari = kameraMarkalari;
    }
}
