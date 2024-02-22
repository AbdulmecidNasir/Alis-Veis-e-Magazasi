import java.util.Scanner;

public class KayitIslemi {
    private String isim;
    private String soyad;
    private String telNo;
    private String email;
    private String sifre;
    KayitIslemi()
    {
        this.setIsim(isim);
        this.setSoyad(soyad);
        this.setTelNo(telNo);
        this.setEmail(email);
        this.setSifre(sifre);
    }

    public void kayitislemi() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Lutfen Isminizi Giriniz :");
        setIsim(scanner.nextLine());
        System.out.println("Lutfen Soyadinizi Giriniz :");
        setSoyad(scanner.next());

        // Telefon numarasını güvenli bir şekilde al
        while (true) {
            try {
                System.out.println("Lutfen Telefon Numaranizi Giriniz :");
                setTelNo(scanner.next());
                break; // Doğru bir giriş yapıldıysa döngüden çık
            } catch (NumberFormatException e) {
                System.out.println("Hatalı giriş! Telefon numarasını doğru bir şekilde giriniz.");
            }
        }

        System.out.println("Lutfen Email Adrsesinizi Giriniz :");
        setEmail(scanner.next());
        System.out.println("Lutfen Sifrenizi Giriniz :");
        setSifre(scanner.next());

        System.out.println("Merhaba " + getIsim() + " " + getSoyad() + " Sitemize Kayidiniz Olusturuldu\nUpgradice Sitemize Yineden Hosgeldiniz !\n");
        System.out.println("Sitemizden Guvenceyle Alis-Veris Yapabilirsiniz");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String gmail) {
        this.email = gmail;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}

