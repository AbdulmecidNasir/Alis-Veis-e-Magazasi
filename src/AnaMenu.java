import java.util.Scanner;

public class AnaMenu {
    char secim;


    public String[] menu() {
        Scanner scanner = new Scanner(System.in);
        String[] secimDizisi;
        //UPGRADICE = UPGRADE DEVICE = CIHAZLARI GUNCELLE
        System.out.println("\n------------MERHABA UPGRADİCE WEB SAYFASINA HOSGELDINIZ----------\n");
        System.out.println("İHTİYAÇLAR SENDEN AKSESUARLAR BİZDEN !\n");
        System.out.println("Lutfen asagidaki kategoriden birini seciniz (1-5):\n");
        System.out.println("1. Cep Telefonlari\n");
        System.out.println("2. Notebooklar\n");
        System.out.println("3. Televizyonlar\n");
        System.out.println("4. Ev Aletleri\n");
        System.out.println("5. Aksesuarlar\n");

        secim = scanner.next().charAt(0);

        while (secim < '1' || secim > '5') {
            System.out.println("Yanlis Numara Girdiniz. Tekrar Deneyin.");
            secim = scanner.next().charAt(0);
        }

        // Seçimi bir dizi içinde döndür
        secimDizisi = new String[]{String.valueOf(secim)};
        // Seçimi tek bir String olarak döndür
        return new String[] { String.valueOf(secim) };
    }
}