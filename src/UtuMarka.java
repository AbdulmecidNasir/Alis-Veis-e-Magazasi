import java.util.Scanner;

public class UtuMarka extends AnaMenu {


    private String[] utuMarkalari = {"Philips", "Tefal", "Arzum", "Bosch", "Arcelik", "Fakir"};

    public void listeleMarkalar() {
        System.out.println("-------Utu Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden ütünün hangi markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getUtuMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getUtuMarkalari()[i]);
        }

    }

    public String[] utuMarka() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 1) {
            System.out.println("-------Utu Marka Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki ütü markalarından birini seçiniz:\n");

            listeleMarkalar();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getUtuMarkalari().length) {
                // Seçilen markayı döndür
                return new String[]{getUtuMarkalari()[secim - 1]};
            } else {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }


    }

    public String[] getUtuMarkalari() {
        return utuMarkalari;
    }

    public void setUtuMarkalari(String[] utuMarkalari) {
        this.utuMarkalari = utuMarkalari;
    }
}
