import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnaMenu anaMenu = new AnaMenu();
        Secim secim = new Secim();
        KrediKartLimit krediKartLimit = new KrediKartLimit();
        Scanner scanner =  new Scanner(System.in);
        KayitIslemi kayitIslemi = new KayitIslemi();
        DosyaIslemi dosyaIslemi = new DosyaIslemi(kayitIslemi,krediKartLimit);
        char devam;
        int giris;
        //UPGRADICE = UPGRADE DEVICE = CIHAZLARI GUNCELLE
        System.out.println("************************************************************************");
        System.out.println("------------MERHABA UPGRADİCE WEB SAYFASINA HOSGELDINIZ----------\n");
        System.out.println("İHTİYAÇLAR SENDEN AKSESUARLAR BİZDEN !\n");
        System.out.println("Sitemize Giris Yapmak Icin Once Kayit Olmaniz Gerekiyor\n");
        System.out.println("1 - Kayit Ol\n");
        System.out.println("2 - Cikis");
        giris = scanner.nextInt();
        System.out.println("******************************");
        if(giris == 1)
        {
            kayitIslemi.kayitislemi();
            String[] kategoriSecimi = anaMenu.menu(); // Kullanıcının kategori seçimini al
            do {
                try
                {
                    if (kategoriSecimi[0].equals("1")) {
                        TelefonListesi telefonListesi = new TelefonListesi();
                        telefonListesi.listeleMarkalar(); // Telefon markalarını listeleyin
                        String[] markaSecimi = telefonListesi.telMarka(); // Kullanıcının marka seçimini al
                        secim.telefonSecimi();
                        krediKartLimit.krediIslem();

                    }
                    if (kategoriSecimi[0].equals("2")) {
                        Notebook notebook = new Notebook();
                        notebook.listeleMarkalar();
                        String[] markaSecimi = notebook.notebookMarka();
                        secim.notebookSecimi();
                        krediKartLimit.krediIslem();
                    }
                    if (kategoriSecimi[0].equals("3")) {
                        Televizyonlar televizyonlar = new Televizyonlar();
                        televizyonlar.listeleMarkalar();
                        String[] markaSecimi = televizyonlar.televizyonMarka();
                        secim.televizyonSecimi();
                        krediKartLimit.krediIslem();
                    }
                    if (kategoriSecimi[0].equals("4")) {
                        EvAletleri evAletleri = new EvAletleri();
                        evAletleri.listeleKategoriler();
                        secim.evaletKategoriSecim();
                        krediKartLimit.krediIslem();
                        UtuMarka utuMarka = new UtuMarka();


                    }
                    if (kategoriSecimi[0].equals("5")) {
                        Aksesuarlar aksesuarlar = new Aksesuarlar();
                        aksesuarlar.listeleKategoriler();
                        secim.aksesuarSecimi();
                        krediKartLimit.krediIslem();

                    }
                    dosyaIslemi.yazdirDosyaya();
                    dosyaIslemi.DosyaOku(); // Kullanıcı işlemleri tamamlandıktan sonra dosyayı oku

                }catch(Exception e)
                {
                    System.err.println("Hata : "+e.getMessage());
                }
                System.out.println("Islemi Devam Etmek Ister misiniz ? (e/h)");
                devam = scanner.next().charAt(0);
            }while(devam == 'e' || devam == 'E');

        }
        else {
            System.out.println("Sitemize Yine Bekleriz :)");
        }

        }


}

