import java.util.Scanner;

public class Aksesuarlar extends AnaMenu {

    private String[] aksesuarKategorileri = {"Kulaklik", "Hoparlor", "Konsol Oyun", "Canta", "Kamera", "Klavyeler"};

    public void listeleKategoriler() {
        System.out.println("-------Aksesuar Kategorisine Hoş Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden hangi aksesuar kategorisini bakmak istersiniz?\n");

        // Kategori bilgilerini listeleyin
        for (int i = 0; i < getAksesuarKategorileri().length; i++) {
            System.out.println((i + 1) + ". " + getAksesuarKategorileri()[i]);
        }
    }

    public String[] aksesuarKategori() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 5) {
            System.out.println("-------Aksesuar Kategori Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki aksesuar kategorilerinden birini seçiniz:\n");

            listeleKategoriler();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getAksesuarKategorileri().length) {
                // Seçilen kategoriyi döndür
                return new String[]{getAksesuarKategorileri()[secim - 1]};
            } else {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getAksesuarKategorileri() {
        return aksesuarKategorileri;
    }

    public void setAksesuarKategorileri(String[] aksesuarKategorileri) {
        this.aksesuarKategorileri = aksesuarKategorileri;
    }
}
