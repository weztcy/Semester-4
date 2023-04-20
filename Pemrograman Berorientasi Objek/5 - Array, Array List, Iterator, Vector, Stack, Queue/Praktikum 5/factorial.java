import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        long Fac = 1; 
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        bilangan = input.nextInt();
        for (int i = 2; i <= bilangan; i++) {
            System.out.print(Fac + " factorial " + i + " = ");
            Fac = Fac * i;
            System.out.println(Fac);
        }
    }
}