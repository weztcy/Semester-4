import java.util.Scanner;
public class Sorting {
    int jumlahData;;

    void isiData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        jumlahData = input.nextInt();
    }

    void bubbleSort(int[] data) {
        int i, j, temp;
        for (i = 0; i < jumlahData; i++) {
            for (j = 0; j < jumlahData - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    int partition(int[] data, int left, int right) {
        int pivot = data[left];
        int i = left + 1;
        int j = right;
        int temp;
        while (i <= j) {
            while (data[i] < pivot) {
                i++;
            }
            while (data[j] > pivot) {
                j--;
            }
            if (i <= j) {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;
            }
        }
        temp = data[left];
        data[left] = data[j];
        data[j] = temp;
        return j;
    }

    int quickSort(int[] data, int left, int right) {
        int pivot;
        if (left < right) {
            pivot = partition(data, left, right);
            quickSort(data, left, pivot - 1);
            quickSort(data, pivot + 1, right);
        }
        return 0;
    }

    void insertionArray(int[] data) {
        int i, j, temp;
        for (i = 1; i < jumlahData; i++) {
            temp = data[i];
            j = i - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    void selectionArray(int[] data) {
        int i, j, temp;
        for (i = 0; i < jumlahData - 1; i++) {
            for (j = i + 1; j < jumlahData; j++) {
                if (data[i] > data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }

    void mergeSort(int[] data, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(data, left, mid);
            mergeSort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }

    void merge(int[] data, int left, int mid, int right) {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                data[k] = temp[i];
                i++;
            } else {
                data[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            data[k] = temp[i];
            k++;
            i++;
        }
    }

    void printArray(int[] data) {
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        sorting.isiData();
        int[] data = new int[sorting.jumlahData];
        for (int i = 0; i < sorting.jumlahData; i++) {
            data[i] = (int) (Math.random() * 100);
        }
        System.out.println("Data sebelum diurutkan");
        sorting.printArray(data);
        sorting.bubbleSort(data);
        System.out.println("Data setelah diurutkan dengan Bubble Sort");
        sorting.printArray(data);
        sorting.quickSort(data, 0, sorting.jumlahData - 1);
        System.out.println("Data setelah diurutkan dengan Quick Sort");
        sorting.printArray(data);
        sorting.insertionArray(data);
        System.out.println("Data setelah diurutkan dengan Insertion Sort");
        sorting.printArray(data);
        sorting.selectionArray(data);
        System.out.println("Data setelah diurutkan dengan Selection Sort");
        sorting.printArray(data);
        sorting.mergeSort(data, 0, sorting.jumlahData - 1);
        System.out.println("Data setelah diurutkan dengan Merge Sort");
        sorting.printArray(data);
    }
}
