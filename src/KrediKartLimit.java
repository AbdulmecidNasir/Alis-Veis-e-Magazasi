import java.util.Scanner;

public class KrediKartLimit implements KrediKartIslem {
    double krediKartLimit;
    double price;
    String adres;
    KrediKartLimit() {
        this.krediKartLimit = krediKartLimit;
    }

    public void krediIslem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Kredi Kart Limitinizi Giriniz : ");
        krediKartLimit = scanner.nextDouble();

        // Örnek bir ürün fiyatını belirleyelim (Örneğin, iPhone fiyatı)
        IphoneModel iphoneModel = new IphoneModel();
        price = iphoneModel.getModelPrice(0);

        if (krediKartLimit >= price) {
            System.out.println("Siparisiniz onaylanmasi icin lutfen ev adresiniz giriniz :");
            adres = scanner.next();
            krediKartLimit -= price; // Kredi kartı limitinden ürün fiyatını düşür
            System.out.println("Siparisniz Onaylanmistir, Bizi tercih ettiginiz cok tesekkur ederiz :)");
            System.out.println("Siparisiniz "+adres+" deki adresinize 3-5 is gununde elinize ulasacaktir.");
            System.out.println("Siparis durumuzu kontrol etmek icin menu kismindan siparis durumunu kontrol edebilirsiniz.");
            System.out.println("Kalan Kredi Kart Limitiniz: " + krediKartLimit);
        } else {
            System.out.println("Üzgünüm, ancak kredi kart limitiniz yetmiyor. Ama size uygun bir ürün bulabilirsiniz.");
        }
    }
}
