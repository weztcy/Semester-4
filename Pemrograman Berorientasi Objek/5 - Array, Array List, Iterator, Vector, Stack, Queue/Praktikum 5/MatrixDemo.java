import java.util.Scanner;
public class MatrixDemo {
    public static void main(String[] args) {
        Matrix mx = new Matrix();
        do{
            System.out.println("");
            System.out.println("Menu Matrix");
            System.out.println("1. Penjumlahan Matrix");
            System.out.println("2. Pengurangan Matrix");
            System.out.println("3. Perkalian Matrix");
            System.out.println("4. Transpose Matrix");
            System.out.println("5. Exit");
            System.out.print("Masukkan menu: ");
            Scanner input = new Scanner(System.in);
            int menu = input.nextInt();
            switch(menu){
                case 1:
                    mx.penjumlahanMatrix();
                    break;
                case 2:
                    mx.penguranganMatrix();
                    break;
                case 3:
                    mx.perkalianMatrix();
                    break;
                case 4:
                    mx.transposeMatrix();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("menu tidak ada");
            }
        }while(true);
    }
}