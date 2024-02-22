import java.util.Scanner;

public class Televizyonlar extends AnaMenu {

    private String[] televizyonMarkalari = {"Samsung", "LG", "Philips", "Sony", "Beko", "Vestel", "Toshiba"};

    public void listeleMarkalar() {
        System.out.println("-------Televizyon Marka Listesi--------\n");
        for (int i = 0; i < getTelevizyonMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getTelevizyonMarkalari()[i]);
        }
    }

    public String[] televizyonMarka() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 3) {
            System.out.println("-------Televizyon Marka Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki televizyon markalarından birini seçiniz:\n");

            listeleMarkalar();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getTelevizyonMarkalari().length) {
                // Seçilen markayı döndür
                return new String[]{getTelevizyonMarkalari()[secim - 1]};
            } else {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getTelevizyonMarkalari() {
        return televizyonMarkalari;
    }

    public void setTelevizyonMarkalari(String[] televizyonMarkalari) {
        this.televizyonMarkalari = televizyonMarkalari;
    }
}
