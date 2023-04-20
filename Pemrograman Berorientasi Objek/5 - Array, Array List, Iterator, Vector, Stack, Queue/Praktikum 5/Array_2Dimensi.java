public class Array_2Dimensi {
    public static void main(String[] args) {
        int Array[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        System.out.println("Panjang Array = " + Array.length);
        System.out.print("Data Array = ");
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.println(Array[i][j] + " ");
            }
        }
    }
}
