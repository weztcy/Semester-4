import java.util.Scanner;

public class NilaiDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do{
            Nilai nilai = new Nilai(); // ini object
            nilai.isiData(); // akses method
            nilai.hitungNilai();
            nilai.hitungIndex();
            nilai.tampilData();
            System.out.print("Apakah anda ingin mengulang? (y/n) ");
        } while (input.nextLine().equalsIgnoreCase("y"));
    }
}