import java.util.Scanner;

public class UcakBiletiRezervasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ucus ucus = new Ucus("Malatya", "Trabzon", "21/02/2024", 100, null);

        ucus.ucusGoster();

        System.out.print("Yolcu Adı:");
        String ad = scanner.nextLine();

        System.out.print("Yolcu Soyadı:");
        String soyad = scanner.nextLine();

        System.out.print("Yolcu Tc Kimlik:");
        String tcKimlik = scanner.nextLine();


        Yolcu yolcu = new Yolcu(ad, soyad, tcKimlik);

        System.out.print("Seçmek istediğiniz koltuk no:");
        int koltukNo = Integer.parseInt(scanner.nextLine());

        ucus.rezervasyonYap(yolcu, koltukNo);

        scanner.close();
    }
}