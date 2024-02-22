import java.util.Scanner;

public class Notebook extends AnaMenu {

    private String[] notebookMarkalari = {"Asus", "Monster", "Macbook", "Acer", "Lenovo", "Dell", "Huawei"};

    public void listeleMarkalar() {
        System.out.println("-------Notebook Marka Listesi--------\n");
        for (int i = 0; i < getNotebookMarkalari().length; i++) {
            System.out.println((i + 1) + ". " + getNotebookMarkalari()[i]);
        }
    }

    public String[] notebookMarka() {
        Scanner scanner = new Scanner(System.in);

        if (super.secim == 2) {
            System.out.println("-------Notebook Marka Secimine Hoş Geldiniz !--------\n");
            System.out.println("Aşağıdaki notebook markalarından birini seçiniz:\n");

            listeleMarkalar();

            int secim = scanner.nextInt();

            if (secim >= 1 && secim <= getNotebookMarkalari().length) {
                // Seçilen markayı döndür
                return new String[]{getNotebookMarkalari()[secim - 1]};
            } else {
                System.out.println("Yanlış Numara Girdiniz. Tekrar Deneyin.");
                return new String[]{"Hatalı Giriş"};
            }
        } else {
            return new String[]{"Hatalı Giriş"};
        }
    }


    public String[] getNotebookMarkalari() {
        return notebookMarkalari;
    }

    public void setNotebookMarkalari(String[] notebookMarkalari) {
        this.notebookMarkalari = notebookMarkalari;
    }
}
