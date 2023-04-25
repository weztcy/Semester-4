public class Sorting {
    void printData(int data[]) {
        int n = data.length;
        for (int i = 0; i < n; ++i)
            System.out.print(data[i] + " ");
        System.out.println();
    }

    static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    void bubbleSort(int data[]) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    printData(data);
                }
            }
        }
    }

    int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (data[j] < pivot) {
                i++;
                swap(data, i, j);
                printData(data);
            }
        }
        swap(data, i + 1, high);
        return (i + 1);
    }

    void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    void insertionSort(int data[]) {
        int n = data.length;
        for (int i = 1; i < n; ++i) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
                printData(data);
            }
            data[j + 1] = key;
        }
    }

    void selectionSort(int data[]) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[min_idx]) {
                    min_idx = j;
                }
            }
            swap(data, min_idx, i);
            printData(data);
        }
    }

    void merge(int a[], int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int Leftdata[] = new int[n1];
        int Rightdata[] = new int[n2];
        for (i = 0; i < n1; i++)
            Leftdata[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            Rightdata[j] = a[mid + 1 + j];
        i = 0;
        j = 0;
        k = beg;
        while (i < n1 && j < n2) {
            if (Leftdata[i] <= Rightdata[j]) {
                a[k] = Leftdata[i];
                i++;
            } else {
                a[k] = Rightdata[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            a[k] = Leftdata[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = Rightdata[j];
            j++;
            k++;
        }
    }

    void mergeSort(int a[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
            printData(a);
        }
    }
}