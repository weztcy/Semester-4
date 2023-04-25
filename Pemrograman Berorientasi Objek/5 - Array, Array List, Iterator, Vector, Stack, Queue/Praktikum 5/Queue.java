import java.util.Scanner;
import java.util.ArrayList;

public class Queue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> queue = new ArrayList<String>();
        int pilih;
        do {
            System.out.println();
            System.out.println("Menu Queue");
            System.out.println("1. Insert queue");
            System.out.println("2. Remove queue");
            System.out.println("3. Peek");
            System.out.println("4. Check empty");
            System.out.println("5. Check full");
            System.out.println("6. Size");
            System.out.print("Insert menu: ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Insert data: ");
                    String data = input.next();
                    queue.add(data);
                    System.out.println("isi queue: " + queue);
                    break;
                case 2:
                    queue.remove(0);
                    System.out.println("Insert queue: " + queue);
                    break;
                case 3:
                    System.out.println("First data: " + queue.get(0));
                    break;
                case 4:
                    if (queue.size() == 5) {
                        System.out.println("Queue full");
                    } else {
                        System.out.println("Queue empty");
                    }
                    break;
                case 5:
                    if (queue.size() == 10) {
                        System.out.println("Queue full");
                    } else {
                        System.out.println("Queue empty");
                    }
                    break;
                case 6:
                    System.out.println("size" + queue.size());
                    break;
            }
            System.out.print("Continue? [Y/N]: ");
            String ask = input.next();
            if (ask.equalsIgnoreCase("n")) {
                break;
            }
        } while (pilih != 0);
    }
}