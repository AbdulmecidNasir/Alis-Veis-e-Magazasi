import java.util.Scanner;

public class Secim extends TelefonListesi{
    TelefonListesi telefonListesi = new TelefonListesi();
    Notebook notebook = new Notebook();
    AsusModeli asusModeli = new AsusModeli();
    MonsterModeli monsterModeli = new MonsterModeli();
    MacbookModeli macbookModeli = new MacbookModeli();
    AcerModeli acerModeli = new AcerModeli();
    LenovoModeli lenovoModeli = new LenovoModeli();
    DellModeli dellModeli = new DellModeli();
    HuaweiModeli huaweiModeli = new HuaweiModeli();
    XiaomiModel xiaomiModel = new XiaomiModel();
    SamsungModel samsungModel = new SamsungModel();
    IphoneModel iphoneModel = new IphoneModel();
    OppoModel oppoModel = new OppoModel();
    OnePlusModel onePlusModel = new OnePlusModel();
    GooglePixelModeli googlePixelModeli = new GooglePixelModeli();
    SamsungTV samsungTV = new SamsungTV();
    LgTV lgTV = new LgTV();
    PhilipsTV philipsTV = new PhilipsTV();
    SonyTV sonyTV = new SonyTV();
    BekoTV bekoTV = new BekoTV();
    VestelTV vestelTV = new VestelTV();
    ToshibaTV toshibaTV = new ToshibaTV();
    UtuMarka utuMarka = new UtuMarka();
    SupurgulerMarka supurgulerMarka = new SupurgulerMarka();
    KlimaMarka klimaMarka = new KlimaMarka();
    BlenderMarka blenderMarka = new BlenderMarka();
    TostMakinesiMarka tostMakinesiMarka = new TostMakinesiMarka();
    VantilatorMarka vantilatorMarka = new VantilatorMarka();
    PhilipsUtu philipsUtu = new PhilipsUtu();
    TefalUtu tefalUtu = new TefalUtu();
    ArzumUtu arzumUtu = new ArzumUtu();
    BoschUtu boschUtu = new BoschUtu();
    ArcelikUtu arcelikUtu = new ArcelikUtu();
    FakirUtu fakirUtu = new FakirUtu();
    PhilipsSupurge philipsSupurge = new PhilipsSupurge();
    BoschSupurge boschSupurge = new BoschSupurge();
    DysonSupurge dysonSupurge = new DysonSupurge();
    SamsungSupurge samsungSupurge = new SamsungSupurge();
    ArcelikSupurge arcelikSupurge = new ArcelikSupurge();
    FantomSupurge fantomSupurge = new FantomSupurge();
    KulaklikMarka kulaklikMarka = new KulaklikMarka();
    HoparlorMarka hoparlorMarka = new HoparlorMarka();
    KonsolOyun konsolOyun = new KonsolOyun();
    CantaMarka cantaMarka = new CantaMarka();
    KameraMarka kameraMarka = new KameraMarka();
    KlavyeMarka klavyeMarka = new KlavyeMarka();


    Scanner scanner = new Scanner(System.in);
    int telsecim;
    int notebooksecim;
    int televizyonsecim;
    int evAletKategoriSecim;
    int utuMarkaSecimi;
    int supurgeSecimi;
    int aksesuarSecim;
    Secim()
    {
        this.telsecim = telsecim;
        this.notebooksecim = notebooksecim;
        this.televizyonsecim = televizyonsecim;
        this.evAletKategoriSecim = evAletKategoriSecim;
        this.utuMarkaSecimi = utuMarkaSecimi;
        this.supurgeSecimi = supurgeSecimi;
        this.aksesuarSecim = aksesuarSecim;
    }

    public int telefonSecimi()
    {
        System.out.println("Lutfen Yukaridaki Telefon Modellerden Birini Seciniz : ");
        telsecim = scanner.nextInt();
        switch (telsecim)
        {
            case 1:
                iphoneModel.listeleModeller();
                break;
            case 2:
                samsungModel.listeleModeller();
                break;
            case 3:
                xiaomiModel.listeleModeller();
                break;
            case 4:
                oppoModel.listeleModeller();
                break;
            case 5:
                onePlusModel.listeleModeller();
                break;
            case 6:
                googlePixelModeli.listeleModeller();
                break;
        }
        return telsecim;
    }
    public int notebookSecimi()
    {
        System.out.println("Lutfen Yukaridaki Notebook Modellerden Birini Seciniz : ");
        notebooksecim = scanner.nextInt();
        switch (notebooksecim)
        {
            case 1:
                asusModeli.listeleModeller();
                break;
            case 2:
                monsterModeli.listeleModeller();
                break;
            case 3:
                macbookModeli.listeleModeller();
                break;
            case 4:
                acerModeli.listeleModeller();
                break;
            case 5:
                lenovoModeli.listeleModeller();
                break;
            case 6:
                dellModeli.listeleModeller();
                break;
            case 7:
                huaweiModeli.listeleModeller();
        }
        return notebooksecim;
    }
    public int televizyonSecimi()
    {
        System.out.println("Lutfen Yukaridaki Televizyon Modellerden Birini Seciniz : ");
        televizyonsecim = scanner.nextInt();
        switch (televizyonsecim)
        {
            case 1:
                samsungTV.listeleModeller();
                break;
            case 2:
                lgTV.listeleModeller();
                break;
            case 3:
                philipsTV.listeleModeller();
                break;
            case 4:
                sonyTV.listeleModeller();
                break;
            case 5:
                bekoTV.listeleModeller();
                break;
            case 6:
                vestelTV.listeleModeller();
                break;
            case 7:
                toshibaTV.listeleModeller();
        }
        return televizyonsecim;
    }
    public int evaletKategoriSecim()
    {
        System.out.println("Lutfen Yukaridaki Ev Alet Kategorisinden Birini Seciniz: ");
        evAletKategoriSecim = scanner.nextInt();
        switch (evAletKategoriSecim)
        {
            case 1:
                utuMarka.listeleMarkalar();
                break;
            case 2:
                supurgulerMarka.listeleMarkalar();
                break;
            case 3:
                klimaMarka.listeleMarkalar();
                break;
            case 4:
                blenderMarka.listeleMarkalar();
                break;
            case 5:
                tostMakinesiMarka.listeleMarkalar();
                break;
            case 6:
                vantilatorMarka.listeleMarkalar();
                break;
        }
        return evAletKategoriSecim;
    }
    public int utuMarkaSecim() {
            System.out.println("Lutfen Yukaridaki Utu Markalarin Biriniz Seciniz :");
            utuMarkaSecimi = scanner.nextInt();
            switch (utuMarkaSecimi) {
                case 1:
                    philipsUtu.listeleModeller();
                    break;
                case 2:
                    tefalUtu.listeleModeller();
                    break;
                case 3:
                    arzumUtu.listeleModeller();
                    break;
                case 4:
                    boschUtu.listeleModeller();
                    break;
                case 5:
                    arcelikUtu.listeleModeller();
                    break;
                case 6:
                    fakirUtu.listeleModeller();
                    break;
            }
            return utuMarkaSecimi;
    }
    public void markaSecimi()
    {
        UtuMarka utuMarka1 = new UtuMarka();
        utuMarka.utuMarka();
        utuMarkaSecim();
    }
    public int supurgeSecim() {
        System.out.println("Lutfen Yukaridaki Supurge Markalarin Biriniz Seciniz :");
        supurgeSecimi = scanner.nextInt();
        switch (supurgeSecimi) {
            case 1:
                philipsSupurge.listeleModeller();
                break;
            case 2:
                boschSupurge.listeleModeller();
                break;
            case 3:
                dysonSupurge.listeleModeller();
                break;
            case 4:
                samsungSupurge.listeleModeller();
                break;
            case 5:
                arcelikSupurge.listeleModeller();
                break;
            case 6:
                fantomSupurge.listeleModeller();
                break;
        }
        return supurgeSecimi;
    }
    public void supurgelerSecimi()
    {
        SupurgulerMarka supurgulerMarka = new SupurgulerMarka();
        supurgulerMarka.supurgeMarka();
        supurgeSecim();
    }
    public int aksesuarSecimi() {
        System.out.println("Lutfen Yukaridaki Aksesuarlardan Biriniz Seciniz :");
        aksesuarSecim = scanner.nextInt();
        switch (aksesuarSecim) {
            case 1:
                kulaklikMarka.listeleMarkalar();
                break;
            case 2:
                hoparlorMarka.listeleMarkalar();
                break;
            case 3:
                konsolOyun.listeleOyunlar();
                break;
            case 4:
                cantaMarka.listeleMarkalar();
                break;
            case 5:
                kameraMarka.listeleMarkalar();
                break;
            case 6:
                klavyeMarka.listeleMarkalar();
                break;
        }
        return aksesuarSecim;
    }
}

