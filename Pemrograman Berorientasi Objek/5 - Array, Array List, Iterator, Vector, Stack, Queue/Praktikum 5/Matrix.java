import java.util.Scanner;
public class Matrix {

    int baris, kolom;

    void penjumlahanMatrix(){

        // penjumlahan matrix
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = input.nextInt();
        int[][] matrix1 = new int[baris][kolom];
        int[][] matrix2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        System.out.println("Masukkan matrix 1");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen baris ke-" + (i+1) + " kolom ke-" + (j+1) + ": ");
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix 1");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Masukkan matrix 2");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen baris ke-" + (i+1) + " kolom ke-" + (j+1) + ": ");
                matrix2[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix 2");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Hasil penjumlahan matrix");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

    void penguranganMatrix(){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = input.nextInt();
        int[][] matrix1 = new int[baris][kolom];
        int[][] matrix2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        System.out.println("Masukkan matrix 1");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen baris ke-" + (i+1) + " kolom ke-" + (j+1) + ": ");
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix 1");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Masukkan matrix 2");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen baris ke-" + (i+1) + " kolom ke-" + (j+1) + ": ");
                matrix2[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix 2");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Hasil pengurangan matrix");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

    void perkalianMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = input.nextInt();

        int[][] matrix1 = new int[baris][kolom];
        int[][] matrix2 = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("Masukkan matrix 1");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen baris ke-" + (i+1) + " kolom ke-" + (j+1) + ": ");
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix 1");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Masukkan matrix 2");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen baris ke-" + (i+1) + " kolom ke-" + (j+1) + ": ");
                matrix2[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix 2");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Hasil perkalian matrix");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                for (int k = 0; k < baris; k++) {
                    hasil[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

    void transposeMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        kolom = input.nextInt();
        int[][] matrix = new int[baris][kolom];
        int[][] hasil = new int[kolom][baris];

        System.out.println("Masukkan matrix");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen baris ke-" + (i+1) + " kolom ke-" + (j+1) + ": ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Hasil transpose matrix");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[j][i] = matrix[i][j];
                System.out.print(hasil[j][i] + " ");
            }
            System.out.println();
        }
    }
}