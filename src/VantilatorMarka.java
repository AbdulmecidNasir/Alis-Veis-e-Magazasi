import java.util.Scanner;

public class VantilatorMarka extends AnaMenu {

    private String[] vantilatorMarkalari = {"Arcelik", "Kumtel", "Raks", "Rubenis", "Luxell", "Everest"};

    public void listeleMarkalar() {
        System.out.println("-------Vantilator Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden vantilatörün hangi markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getVantilatorMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getVantilatorMarkalari()[i]);
        }
    }

    public String[] vantilatorMarka() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 6) {
            System.out.println("-------Vantilator Marka Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki vantilatör markalarından birini seçiniz:\n");

            listeleMarkalar();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getVantilatorMarkalari().length) {
                // Seçilen markayı döndür
                return new String[]{getVantilatorMarkalari()[secim - 1]};
            } else {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getVantilatorMarkalari() {
        return vantilatorMarkalari;
    }

    public void setVantilatorMarkalari(String[] vantilatorMarkalari) {
        this.vantilatorMarkalari = vantilatorMarkalari;
    }
}
