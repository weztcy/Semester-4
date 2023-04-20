import java.util.Scanner;
public class SortingDemo {
    public static void main(String[] args) {
        int menu;
        do {
            Sorting sorting = new Sorting();

            System.out.println("Menu Sorting");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Selection Sort");
            System.out.println("5. Merge Sort");
            System.out.println("6. Exit");
            System.out.print("Pilih menu : ");
            Scanner input = new Scanner(System.in);
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    bubbleSort(data);
                    break;
                case 2:
                    quickSort(data);
                    break;
                case 3:
                    insertionSort(data);
                    break;
                case 4:
                    selectionSort();
                    break;
                case 5:
                    mergeSort();
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (menu < 6);
    }
}
