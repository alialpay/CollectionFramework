
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
   
        System.out.println("Ramazan Pidesi Uygulaması");
        Random random = new Random();
        
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        
        pide_kuyrugu.offer("Ali");
        pide_kuyrugu.offer("batu");
        pide_kuyrugu.offer("tolga");
        pide_kuyrugu.offer("bahar");
        pide_kuyrugu.offer("sena");
        pide_kuyrugu.offer("selim");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("gizem");
        pide_kuyrugu.offer("ayse");
        pide_kuyrugu.offer("ezgi");
        
        int pide_sayisi = 1 + random.nextInt(10);
        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide Sayısı: " + pide_sayisi);
        Thread.sleep(3000);
        
        while (pide_sayisi != 0) {            
            System.out.println(pide_kuyrugu.poll() + " pideyi aldı...");
            pide_sayisi--;
            Thread.sleep(1000);
            
        }
        System.out.println("Pide kalmadı...");
        
    }
}
