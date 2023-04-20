import java.util.Scanner;

public class NilaiDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            Nilai nilai = new Nilai();
            
            System.out.print("Jumlah Mahasiswa : ");
            
            int n = input.nextInt();
            Nilai[] nilaiMahasiswa = new Nilai[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Mahasiswa ke : "+(i+1));
                nilaiMahasiswa[i] = new Nilai();
                nilaiMahasiswa[i].isiData();
                nilaiMahasiswa[i].hitungNilai();
                nilaiMahasiswa[i].hitungIndex();
            }
            nilaiMahasiswa[0].judul();
            for (int i = 0; i < n; i++) {
                nilaiMahasiswa[i].daftarNilai();
            }

            System.out.print("Apakah anda ingin mengulang? (y/n): ");
        } while (input.nextLine().equalsIgnoreCase("y"));
    }
}