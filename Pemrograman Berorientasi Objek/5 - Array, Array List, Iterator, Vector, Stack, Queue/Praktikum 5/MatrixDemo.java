import java.util.Scanner;
public class MatrixDemo {
    Matrix matrix = new Matrix();
    static Scanner input = new Scanner(System.in);
    static int menu;

    public static void main(String[] args) {
        do {
            System.out.println("Menu Matrix");
            System.out.println("1. Penjumlahan Matrix");
            System.out.println("2. Pengurangan Matrix");
            System.out.println("3. Perkalian Matrix");
            System.out.println("4. Transpose Matrix");
            System.out.println("5. Keluar");
            
            System.out.print("Masukkan pilihan : ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    Matrix.tambahMatrix(matrix1, matrix2);
                    break;
                case 2:
                    matrix.kurangMatrix(matrix1, matrix2);
                    break;
                case 3:
                    matrix.kaliMatrix(matrix1, matrix2);
                    break;
                case 4:
                    matrix.transposeMatrix(matrix1);
                    break;
                case 5:
                    System.out.println("Keluar");
                    break;
            }
        } while (menu <= 5);
    }
}
