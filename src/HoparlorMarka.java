import java.util.Scanner;

public class HoparlorMarka extends AnaMenu {

    private String[] hoparlorMarkalari = {"JBL", "Sony", "Xiaomi", "Harman Kardon", "Hytech", "Lexon"};

    public void listeleMarkalar() {
        System.out.println("-------Hoparlör Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden hangi hoparlör markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getHoparlorMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getHoparlorMarkalari()[i]);
        }
    }

    public String[] hoparlorMarka() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Hoparlör Marka Seçimine Hoş Geldiniz !--------\n");

        listeleMarkalar();

        int secim = scanner.nextInt();

        if (secim >= 1 && secim <= getHoparlorMarkalari().length) {
            // Seçilen markayı döndür
            return new String[]{getHoparlorMarkalari()[secim - 1]};
        } else {
            System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getHoparlorMarkalari() {
        return hoparlorMarkalari;
    }

    public void setHoparlorMarkalari(String[] hoparlorMarkalari) {
        this.hoparlorMarkalari = hoparlorMarkalari;
    }
}
