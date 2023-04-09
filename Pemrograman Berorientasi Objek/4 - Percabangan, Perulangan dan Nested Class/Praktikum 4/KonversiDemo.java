import java.util.Scanner;

public class KonversiDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Konversi konversi = new Konversi();
        int detik;
        
        do {
            System.out.print("Masukkan detik: ");
            detik = input.nextInt();
            konversi.detik(detik);
            konversi.tampilHasil();
            System.out.print("Apakah anda ingin mengulang? (y/n): ");
        } while (input.next().equalsIgnoreCase("y"));
        
    }
}
