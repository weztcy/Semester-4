import java.util.Scanner;

public class TestHewan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        System.out.println("Pilih hewan yang ingin anda ketahui informasinya:");
        System.out.println("1. Singa");
        System.out.println("2. Elang");
        System.out.println("3. Lebah");
        System.out.println("4. Paus");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan anda: ");
        menu = input.nextInt();
        
        switch (menu) {
            case 1:
                Hewan.Singa singa = new Hewan().new Singa();
                singa.jenis = "mamalia";
                singa.ciri = "berbulu";
                System.out.println("Hewan ini berjenis " + singa.jenis);
                System.out.println("Ciri-ciri hewan ini " + singa.ciri);
                singa.suara();
                singa.berjalan();
                singa.bernapas();
                break;
            case 2:
                Hewan.Elang elang = new Hewan().new Elang();
                elang.jenis = "burung";
                elang.ciri = "berparuh";
                System.out.println("Hewan ini berjenis " + elang.jenis);
                System.out.println("Ciri-ciri hewan ini " + elang.ciri);
                elang.suara();
                elang.berjalan();
                elang.bernapas();
                break;
            case 3:
                Hewan.Lebah lebah = new Hewan().new Lebah();
                lebah.jenis = "serangga";
                lebah.ciri = "berbadan kecil";
                System.out.println("Hewan ini berjenis " + lebah.jenis);
                System.out.println("Ciri-ciri hewan ini " + lebah.ciri);
                lebah.suara();
                lebah.berjalan();
                lebah.bernapas();
                break;
            case 4:
                Hewan.Paus paus = new Hewan().new Paus();
                paus.jenis = "mamalia";
                paus.ciri = "berbadan besar";
                System.out.println("Hewan ini berjenis " + paus.jenis);
                System.out.println("Ciri-ciri hewan ini " + paus.ciri);
                paus.suara();
                paus.berjalan();
                paus.bernapas();
                break;
            case 5:
                System.out.println("Terima kasih!");
                break;
        }
    }  
}