import java.util.Scanner;

public class KlavyeMarka extends AnaMenu {

    private String[] klavyeMarkalari = {"Logitech", "Asus", "Rampage", "Razer", "Everest", "Keychron"};

    public void listeleMarkalar() {
        System.out.println("-------Klavye Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden hangi klavye markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; getKlavyeMarkalari() != null && i < getKlavyeMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getKlavyeMarkalari()[i]);
        }
    }

    public String[] klavyeMarka() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Klavye Marka Seçimine Hoş Geldiniz !--------\n");

        listeleMarkalar();

        int secim = scanner.nextInt();

        if (getKlavyeMarkalari() != null && secim >= 1 && secim <= getKlavyeMarkalari().length) {
            // Seçilen markayı döndür
            return new String[]{getKlavyeMarkalari()[secim - 1]};
        } else {
            System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getKlavyeMarkalari() {
        return klavyeMarkalari;
    }

    public void setKlavyeMarkalari(String[] klavyeMarkalari) {
        this.klavyeMarkalari = klavyeMarkalari;
    }
}
