import java.util.Scanner;

public class TostMakinesiMarka extends AnaMenu {

    private String[] tostMakinesiMarkalari = {"Korkmaz", "Tefal", "Arzum", "Arcelik", "Fakir", "Karaca"};

    public void listeleMarkalar() {
        System.out.println("-------Tost Makinesi Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden tost makinesinin hangi markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getTostMakinesiMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getTostMakinesiMarkalari()[i]);
        }
    }

    public String[] tostMakinesiMarka() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 5) {
            System.out.println("-------Tost Makinesi Marka Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki tost makinesi markalarından birini seçiniz:\n");

            listeleMarkalar();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getTostMakinesiMarkalari().length) {
                // Seçilen markayı döndür
                return new String[]{getTostMakinesiMarkalari()[secim - 1]};
            } else {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getTostMakinesiMarkalari() {
        return tostMakinesiMarkalari;
    }

    public void setTostMakinesiMarkalari(String[] tostMakinesiMarkalari) {
        this.tostMakinesiMarkalari = tostMakinesiMarkalari;
    }
}
