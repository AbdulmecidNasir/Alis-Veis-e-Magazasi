import java.util.Scanner;

public class TelefonListesi extends AnaMenu {

    private String[] telefonMarkalari = {"Iphone", "Samsung", "Xiaomi", "Oppo", "One Plus", "Google Pixel"};

    public void listeleMarkalar() {
        System.out.println("-------Telefon Marka Listesi--------\n");
        for (int i = 0; i < getTelefonMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getTelefonMarkalari()[i]);
        }
    }
    public String[] telMarka() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 1) {
            System.out.println("-------Telefon Marka Secimine Hos Geldiniz !--------\n");
            System.out.println("Aşağıdaki telefon markalarından birini seçiniz:\n");

            listeleMarkalar();

            int secim = scanner.nextInt();

            if (secim == 1) {
                // Iphone modellerini listeleyin
                IphoneModel iphoneModel = new IphoneModel();
                iphoneModel.listeleModeller();
                // Seçimi bir dizi içinde döndür
                return new String[]{"Iphone"};
            } else {
                System.out.println("Yanlis Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getTelefonMarkalari() {
        return telefonMarkalari;
    }

    public void setTelefonMarkalari(String[] telefonMarkalari) {
        this.telefonMarkalari = telefonMarkalari;
    }
}
