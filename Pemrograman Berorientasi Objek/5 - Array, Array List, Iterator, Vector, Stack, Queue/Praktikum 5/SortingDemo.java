import java.util.Scanner;

public class SortingDemo {
    public static void main(String[] args) {
        Sorting bs = new Sorting();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = scanner.nextInt();
        int data[] = new int[n];
        int temp[] = new int[n];
        System.out.println("Masukkan total bilangan: ");
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
            temp[i] = data[i];
        }
        while (true) {
            System.out.println("Menu Sorting");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Selection Sort");
            System.out.println("5. Merge Sort");
            System.out.println("6. Exit");
            System.out.print("Masukkan menu: ");
            int x = scanner.nextInt();
            System.out.println();
            if (x == 1) {
                System.out.println("Bubble Sort :");
                bs.bubbleSort(data);
                System.out.print("Hasil Sorting : ");
                bs.printData(data);
                for (int i = 0; i < n; i++) {
                    data[i] = temp[i];
                }
            }
            else if (x == 2) {
                System.out.println("Quick Sort :");
                bs.quickSort(data, 0, n - 1);
                System.out.print("Hasil Sorting : ");
                bs.printData(data);
                for (int i = 0; i < n; i++) {
                    data[i] = temp[i];
                }
            }
            else if (x == 3) {
                System.out.println("Insertion Sort :");
                bs.insertionSort(data);
                System.out.print("Hasil Sorting : ");
                bs.printData(data);
                for (int i = 0; i < n; i++) {
                    data[i] = temp[i];
                }
            }
            else if (x == 4) {
                System.out.println("Selection Sort :");
                bs.selectionSort(data);
                System.out.print("Hasil Sorting : ");
                bs.printData(data);
                for (int i = 0; i < n; i++) {
                    data[i] = temp[i];
                }
            }
            else if (x == 5) {
                System.out.println("Merge Sort :");
                bs.mergeSort(data, 0, n - 1);
                System.out.print("Hasil Sorting : ");
                bs.printData(data);
                for (int i = 0; i < n; i++) {
                    data[i] = temp[i];
                }
            }
            else if (x == 6 || x != 6) {
                break;
            }
        }
        scanner.close();
    }
}