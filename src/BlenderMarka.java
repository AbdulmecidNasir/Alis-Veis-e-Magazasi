import java.util.Scanner;

public class BlenderMarka extends AnaMenu {

    private String[] blenderMarkalari = {"Philips", "Tefal", "Arzum", "Bosch", "Braun", "Karaca"};

    public void listeleMarkalar() {
        System.out.println("-------Blender Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden blenderin hangi markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getBlenderMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getBlenderMarkalari()[i]);
        }
    }

    public String[] blenderMarka() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 4) {
            System.out.println("-------Blender Marka Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki blender markalarından birini seçiniz:\n");

            listeleMarkalar();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getBlenderMarkalari().length) {
                // Seçilen markayı döndür
                return new String[]{getBlenderMarkalari()[secim - 1]};
            } else {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getBlenderMarkalari() {
        return blenderMarkalari;
    }

    public void setBlenderMarkalari(String[] blenderMarkalari) {
        this.blenderMarkalari = blenderMarkalari;
    }
}
