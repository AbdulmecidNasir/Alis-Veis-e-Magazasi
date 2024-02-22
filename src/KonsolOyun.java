import java.util.Scanner;

public class KonsolOyun extends AnaMenu {

    private String[] konsolOyunlari = {"Playstation", "Xbox"};

    public void listeleOyunlar() {
        System.out.println("-------Konsol Oyun Seçimine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden hangi konsol oyun markasını seçmek istersiniz?\n");

        // Oyun bilgilerini listeleyin
        for (int i = 0; i < getKonsolOyunlari().length; i++) {
            System.out.println((i + 1) + ". " + getKonsolOyunlari()[i]);
        }
    }

    public String[] konsolOyun() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Konsol Oyun Seçimine Hoş Geldiniz !--------\n");

        listeleOyunlar();

        int secim = scanner.nextInt();

        if (secim >= 1 && secim <= getKonsolOyunlari().length) {
            // Seçilen oyunu döndür
            return new String[]{getKonsolOyunlari()[secim - 1]};
        } else {
            System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getKonsolOyunlari() {
        return konsolOyunlari;
    }

    public void setKonsolOyunlari(String[] konsolOyunlari) {
        this.konsolOyunlari = konsolOyunlari;
    }
}
