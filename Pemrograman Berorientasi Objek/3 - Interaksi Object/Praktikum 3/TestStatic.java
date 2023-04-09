public class TestStatic {
    int a = 5;
    static int b = 10;
    protected int c = 15;
    public int d = 20;
    private int e = 25;

    void satu() {
        dua();
        System.out.println("Satu..........");
        System.out.println("Satu..........a: " + a);
        System.out.println("Satu..........b: " + b);
        System.out.println("Satu..........c: " + c);
        System.out.println("Satu..........d: " + d);
        System.out.println("Satu..........e: " + e);
    }
    static void dua() {
        System.out.println("Dua...........b: " + b);
    
    }
    int getC() {
        return c;
    }
    public static void main(String[] args) {
        dua();
    }
}
