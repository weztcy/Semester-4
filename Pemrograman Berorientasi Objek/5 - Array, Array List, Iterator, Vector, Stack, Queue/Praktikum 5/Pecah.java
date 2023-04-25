import java.util.Scanner;

public class Pecah {
    public static void main(String[] args) {
        int bilangan, p;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        bilangan = input.nextInt();
        for (int i = 1; i <= bilangan; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("----------");
        System.out.print("Dipecah: ");
        p = input.nextInt();
        for (int i = 1; i <= bilangan; i++) {
            System.out.print(i + " ");
            if (i % p == 0) {
                System.out.println();
            }
        }
    }    
}
