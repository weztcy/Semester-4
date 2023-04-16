import java.util.Scanner;

public class PenjualanDemo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama, kode;
            float harga;
            int jumlah;

            Penjualan penjualan = new Penjualan();

            do {
                System.out.print("Masukkan nama barang : ");
                nama = input.next();
                System.out.print("Masukkan kode barang : ");
                kode = input.next();
                System.out.print("Masukkan harga barang : ");
                harga = input.nextFloat();
                System.out.print("Masukkan jumlah barang : ");
                jumlah = input.nextInt();
                
                penjualan.setData(nama, kode, harga, jumlah);
                penjualan.printNota();
                
                System.out.print("Apakah anda ingin mengulang? (y/n): ");
            } while (input.next().equalsIgnoreCase("y"));
        }
    }
}