import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int [] x;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        size = input.nextInt();
        x = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            x[i] = input.nextInt();
        }
        System.out.println("Isi array: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Nilai X["+ i + "] = " + x[i]);
        }    
    }
}