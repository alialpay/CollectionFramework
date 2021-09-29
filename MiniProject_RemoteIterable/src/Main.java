
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Kumanda Programına Hoşgeldiniz...");
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler...\n"
                + "1. Kanalları Göster\n"
                + "2. Kanal Ekle\n"
                + "3. Kanal Sil\n"
                + "4. Kamal Sayısı\n"
                + "Çıkış için q'ya basınız...";
        
        Kumanda kumanda = new Kumanda();
        
        while (true) { 
            System.out.println(islemler);
            System.out.println("İşlemi giriniz..."); 
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                kanallariGoster(kumanda);
            }
            else if (islem.equals("2")) {
                System.out.println("Eklenecek Kanal : ");
                String kanal_ismi = scanner.nextLine();
                kumanda.kanalEkle(kanal_ismi);
            }
            else if (islem.equals("3")) {
                System.out.println("Silinecek Kanal :");
                String kanal_ismi = scanner.nextLine();
                
                kumanda.kanalSil(kanal_ismi);
            }
            else if (islem.equals("4")) {
                System.out.println("Kanal Sayısı : " + kumanda.kanalSayisi());
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
        
        
        
    }
    public static void kanallariGoster(Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) {
            System.out.println("Şu anda hiç kanal bulunmuyor...");
        }
        else {
            for (String kanal : kumanda) {
                System.out.println("Kanal: " + kanal);
            }
        }
        
    }
}
