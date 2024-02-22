import java.util.Scanner;

public class EvAletleri extends AnaMenu {

    private String[] evAletKategorileri = {"Utuler", "Supurgeler", "Klimalar", "Blender", "Tost Makinesi", "Vantilator"};

    public void listeleKategoriler() {
        System.out.println("-------Ev Aletleri Kategorisine Hos Geldiniz !--------\n");
        System.out.println("Aşağıdakilerden ne tür ev aletlerini bakmak istersiniz?\n");

        // Kategori bilgilerini listeleyin
        for (int i = 0; i < getEvAletKategorileri().length; i++) {
            System.out.println((i + 1) + ". " + getEvAletKategorileri()[i]);
        }

    }

    public String[] evAletKategori() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 4) {
            System.out.println("-------Ev Aleti Kategori Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki ev aleti kategorilerinden birini seçiniz:\n");

            listeleKategoriler();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getEvAletKategorileri().length) {
                // Seçilen kategoriyi döndür
                return new String[]{getEvAletKategorileri()[secim - 1]};
            }

            else
            {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }

    public String[] getEvAletKategorileri() {
        return evAletKategorileri;
    }

    public void setEvAletKategorileri(String[] evAletKategorileri) {
        this.evAletKategorileri = evAletKategorileri;
    }
}
