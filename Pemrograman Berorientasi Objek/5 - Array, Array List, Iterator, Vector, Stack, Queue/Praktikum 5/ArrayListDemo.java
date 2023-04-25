import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Float> nilai1 = new ArrayList<Float>();
        ArrayList<Float> nilai2 = new ArrayList<Float>();
        ArrayList<Float> jumlah = new ArrayList<Float>();
        ArrayList<Float> kurang = new ArrayList<Float>();
        ArrayList<Float> kali = new ArrayList<Float>();
        ArrayList<Float> bagi = new ArrayList<Float>();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        
        int n = input.nextInt();
        System.out.println("Nilai 1");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan ke - " + (i + 1) + ": ");
            nilai1.add(input.nextFloat());
        }
        System.out.println("Nilai 2");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan ke - " + (i + 1) + ": ");
            nilai2.add(input.nextFloat());
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
            kurang.add(nilai1.get(i) - nilai2.get(i));
            kali.add(nilai1.get(i) * nilai2.get(i));
            bagi.add(nilai1.get(i) / nilai2.get(i));
        }
        System.out.println("Hasil Jumlah nilai1 + nilai2");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Jumlah Index ke " + i + " = " +
                    jumlah.get(i));
        }
        System.out.println();
        System.out.println("Hasil Kurang nilai1 - nilai2");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Kurang Index ke " + i + " = " +
                    kurang.get(i));
        }
        System.out.println();
        System.out.println("Hasil Kali nilai1 * nilai2");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Kali Index ke " + i + " = " + kali.get(i));
        }
        System.out.println();
        System.out.println("Hasil Bagi nilai1 / nilai2");
        
        for (int i = 0; i < n; i++) {
            System.out.println("Bagi Index ke " + i + " = " + bagi.get(i));
        }
        System.out.println();
    }
}