import java.util.Scanner;
public class Matrix {
    int baris, kolom;

    void isiData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris : ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom : ");
        kolom = input.nextInt();
    }
    
    void tambahMatrix(int[][] matrix1, int[][] matrix2) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Hasil penjumlahan matrix : ");
    }

    void kurangMatrix(int[][] matrix1, int[][] matrix2) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.println("Hasil pengurangan matrix : ");
    }

    void kaliMatrix(int[][] matrix1, int[][] matrix2) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        System.out.println("Hasil perkalian matrix : ");
    }

    void transposeMatrix(int[][] matrix1) {
        int baris = matrix1.length;
        int kolom = matrix1[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matrix1[j][i];
            }
        }
        System.out.println("Hasil transpose matrix : ");
    }
}