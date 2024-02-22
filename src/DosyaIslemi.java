import java.io.*;

public class DosyaIslemi extends KayitIslemi {
    KayitIslemi kayitIslemi;
    KrediKartLimit krediKartLimit;


    public DosyaIslemi(KayitIslemi kayitIslemi, KrediKartLimit krediKartLimit) {
        this.kayitIslemi = kayitIslemi;
        this.krediKartLimit = krediKartLimit;
    }
    public DosyaIslemi(){}
    public void yazdirDosyaya()
    {
        File file = new File("DosyaKayitIslemi");
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Dosya Olusturulamadi Nedeni : "+e.getMessage());
            }
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("DosyaKayitIslemi.txt",true)))
        {
            if(file != null)
            {
                System.out.println("\nBilgileriniz Dosya ya Yazilmistir !");
                writer.write("Isim : "+kayitIslemi.getIsim() + "\n");
                writer.write("Soyad : "+kayitIslemi.getSoyad() + "\n");
                writer.write("Telefon Numara : "+kayitIslemi.getTelNo()+"\n");
                writer.write("Email Adres : "+kayitIslemi.getEmail()+"\n");
                writer.write("Sifre : "+kayitIslemi.getSifre()+"\n");

                if (krediKartLimit != null) {
                    writer.write("Ev Adres : " + krediKartLimit.adres + "\n");
                    writer.write("Satin Aldiniz Urun Fiyati : " + krediKartLimit.price + "\n");
                }
            }
            else
            {
                System.out.println("Dosyaya Yazdirilamadi");
            }
            writer.close();
        }catch(IOException e)
        {
            System.err.println("Dosya Yazma Hatasi : "+e.getMessage());
        }

    }
    public void DosyaOku() {

        try (BufferedReader reader = new BufferedReader(new FileReader("DosyaKayitIslemi.txt"))) {
            String satir;

            while ((satir = reader.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (IOException e) {
            System.out.println("Dosya Okuma Hatasi: " + e.getMessage());
        }
    }
}
