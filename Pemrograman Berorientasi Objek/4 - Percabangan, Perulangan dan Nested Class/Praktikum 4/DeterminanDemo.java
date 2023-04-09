import java.util.Scanner;

public class DeterminanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Determinan det = new Determinan();
        do{
            System.out.print("Masukkan nilai a: ");
            float a = input.nextFloat();
            System.out.print("Masukkan nilai b: ");
            float b = input.nextFloat();
            System.out.print("Masukkan nilai c: ");
            float c = input.nextFloat();
            det.setData(a, b, c);
            det.tampilHasil();
            System.out.print("Apakah anda ingin mengulang? (y/n)");
        } while (input.next().equals("y"));
    }
}
