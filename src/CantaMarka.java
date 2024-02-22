import java.util.Scanner;

public class CantaMarka extends AnaMenu {

    private String[] cantaMarkalari = {"Nike", "Adidas", "Puma", "Under Armour", "Calvin Klein"};

    public void listeleMarkalar() {
        System.out.println("-------Çanta Marka Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden hangi çanta markasını seçmek istersiniz?\n");

        // Marka bilgilerini listeleyin
        for (int i = 0; i < getCantaMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getCantaMarkalari()[i]);
        }
    }

    public String[] cantaMarka() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------Çanta Marka Seçimine Hoş Geldiniz !--------\n");

        listeleMarkalar();

        int secim = scanner.nextInt();

        if (secim >= 1 && secim <= getCantaMarkalari().length) {
            // Seçilen markayı döndür
            return new String[]{getCantaMarkalari()[secim - 1]};
        } else {
            System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getCantaMarkalari() {
        return cantaMarkalari;
    }

    public void setCantaMarkalari(String[] cantaMarkalari) {
        this.cantaMarkalari = cantaMarkalari;
    }
}
